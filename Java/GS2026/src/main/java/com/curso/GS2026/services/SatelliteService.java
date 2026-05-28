package com.curso.GS2026.services;

import com.curso.GS2026.dto.CreateSatelliteDTO;
import com.curso.GS2026.dto.SatelliteDetailsDTO;
import com.curso.GS2026.dto.SatelliteMaterialDTO;
import com.curso.GS2026.dto.TleApiDTO;
import com.curso.GS2026.models.*;
import com.curso.GS2026.repositories.SatelliteMaterialRepository;
import com.curso.GS2026.repositories.SatelliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class SatelliteService {

    // Injeção de DPs
    @Autowired
    private SatelliteRepository satelliteRepository;

    @Autowired
    private OperatorService operatorService;

    @Autowired
    private SatelliteMaterialRepository satelliteMaterialRepository;

    // Done: Propriedades
    //Endereço que será utilizado no consumo
    private final String url = "https://tle.ivanstanojevic.me/api/tle";

    // Criando um RestClient, responsável por conectar a API em um determinado URL
    private final RestClient restClient = RestClient.create(url);

    // Done: Metodo responsável por fazer um GET de um satelite na API TLE - NASA

    public TleApiDTO getByNoradId(Long noradId){
        TleApiDTO register = null;

        try {
            // Tentativa de preencher o DTO com alguns dos dados da API
            register = restClient
                    .get() // Indicando o metodo HTTP
                    .uri("/{noradId}", noradId)
                    .retrieve() //recuperando dados da resposta
                    .onStatus(HttpStatusCode::is4xxClientError, (request, response) -> {
                        throw new RuntimeException("Erro na requisição: " + response.getStatusCode());
                    }) // Caso aconteça um erro 400 (na requisição
                    .onStatus(HttpStatusCode::is5xxServerError, ((request, response) -> {
                        throw new RuntimeException("Erro na resposta do servidor: " + response.getStatusCode());
                    })) // Caso ocorra um erro 500 (do lado do servidor)
                    .body(TleApiDTO.class); //Trazendo o corpo encontrado para dentro do DTO
            System.out.println(register);
        }
        catch(Exception exception){
            System.out.println(exception);
        }
        return register;
    }

    // Done: Metodo buscar satelite por operador
    public List<Satellite> getByOperator(Integer operatorId){
        List<Satellite> satellites = satelliteRepository.findByOperator_OperatorId(operatorId);

        satellites.forEach(satellite -> System.out.println(satellite));

        return satellites;
    }

    // Done: Metodo buscar satélites por status

    public List<Satellite> getByStatus(Status status){
        List<Satellite> satellites = satelliteRepository.findByStatus(status);

        satellites.forEach(satellite ->
            System.out.println(satellite)
        );
        return satellites;
    }

    // Done: Metodo cadastrar satelite
    public Satellite createSatelliteFromTle(CreateSatelliteDTO dto){

        TleApiDTO tleData = getByNoradId(dto.getNoradId());

        Operator operator = operatorService.findOperatorById(dto.getOperatorId());

        Satellite satellite = new Satellite();

        satellite.setNoradId(tleData.getNoradId());
        satellite.setName(tleData.getName());
        satellite.setOperator(operator);
        satellite.setStatus(dto.getStatus());

        return satelliteRepository.save(satellite);
    }


    public SatelliteDetailsDTO getCompleteSatelliteDetails(Long noradId){

        TleApiDTO tleData = getByNoradId(noradId);

        Satellite satellite = satelliteRepository
                .findById(noradId)
                .orElseThrow(() ->
                        new RuntimeException("Satélite não encontrado."));

        List<SatelliteMaterial> satelliteMaterials =
                satelliteMaterialRepository
                        .findBySatellite_NoradId(noradId);

        Double totalWeight = satelliteMaterials.stream()
                .mapToDouble(SatelliteMaterial::getTotalWeightKg)
                .sum();

        Double recyclablePercentage = satelliteMaterials.stream()
                .mapToDouble(SatelliteMaterial::getRecyclablePercentage)
                .average()
                .orElse(0.0);

        List<SatelliteMaterialDTO> materialDTOs =
                satelliteMaterials.stream()
                        .map(sm -> new SatelliteMaterialDTO(
                                sm.getMaterial().getMaterialName(),
                                sm.getTotalWeightKg(),
                                totalWeight == 0 ? 0.0 :
                                        (sm.getTotalWeightKg() / totalWeight) * 100,
                                sm.getRecyclablePercentage(),
                                sm.getMaterial().getReusableFor().toString()
                        ))
                        .toList();

        SatelliteDetailsDTO detailsDTO = new SatelliteDetailsDTO();

        detailsDTO.setNoradId(tleData.getNoradId());
        detailsDTO.setSatelliteName(tleData.getName());
        detailsDTO.setTotalWeightKg(totalWeight);
        detailsDTO.setTotalRecyclablePercentage(recyclablePercentage);
        detailsDTO.setMaterials(materialDTOs);

        return detailsDTO;
    }

    // Done: Metodo para buscar satelites pelo material

    public Set<Satellite> getSatellitesByMaterialType(MaterialType type){

        List<SatelliteMaterial> satelliteMaterials = satelliteMaterialRepository.findByMaterial_MaterialType(type);

        Set<Satellite> satellites = new HashSet<>();

        satelliteMaterials.forEach(sm -> {
            satellites.add(sm.getSatellite());
        });

        return satellites;
    }

    // Done: Metodo para localizar satelite pelo id no BD h2
    public Satellite findSatelliteById(Long noradId){
        Satellite foundSatellite = new Satellite();

        try{
            foundSatellite = satelliteRepository.findById(noradId).get();
            System.out.println("Satelite encontrado com sucesso");
            System.out.println(foundSatellite);
        }
        catch (Exception e){
            System.out.println("Erro ao localizar o satelite");
            System.out.println(e);
        }
        return foundSatellite;
    }

}