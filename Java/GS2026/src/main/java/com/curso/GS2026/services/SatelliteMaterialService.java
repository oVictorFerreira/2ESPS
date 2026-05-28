package com.curso.GS2026.services;

import com.curso.GS2026.dto.TleApiDTO;
import com.curso.GS2026.models.Material;
import com.curso.GS2026.models.Satellite;
import com.curso.GS2026.models.SatelliteMaterial;
import com.curso.GS2026.repositories.SatelliteMaterialRepository;
import com.curso.GS2026.repositories.SatelliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class SatelliteMaterialService {

    //Injeção de DPs
    @Autowired
    private SatelliteRepository satelliteRepository;

    @Autowired
    private SatelliteMaterialRepository satelliteMaterialRepository;

    @Autowired
    private SatelliteService satelliteService;

    @Autowired
    private MaterialService materialService;

    // Done: Metodo que trás os materias do satelite
    public List<SatelliteMaterial> getBySatellite(Long noradId){
        List<SatelliteMaterial> satelliteMaterials =
                satelliteMaterialRepository
                        .findBySatellite_NoradId(noradId);

        satelliteMaterials.forEach(sm ->
                System.out.println(sm));

        return satelliteMaterials;
    }

    // Done: Metodo que calcula peso total do satelite

    public Double calculateTotalWeight(Long noradId){
        List<SatelliteMaterial> satelliteMaterials =
                satelliteMaterialRepository.findBySatellite_NoradId(noradId);

        return satelliteMaterials.stream()
                .mapToDouble(SatelliteMaterial::getTotalWeightKg)
                .sum();
    }

    // Done: Metodo que calcula o indice de reciclabilidade do satelite
    public Double calculateRecyclablePercentage(Long noradId){
        List<SatelliteMaterial> satelliteMaterials =
                satelliteMaterialRepository.findBySatellite_NoradId(noradId);

        return satelliteMaterials.stream()
                .mapToDouble(SatelliteMaterial::getRecyclablePercentage)
                .average()
                .orElse(0.0);
    }


    // Done: Metodo que apresenta o material predominante no satelite
    public Material getMainMaterial(Long noradId){
        List<SatelliteMaterial> materials =
                satelliteMaterialRepository.findBySatellite_NoradId(noradId);

        SatelliteMaterial mainMaterial = materials.stream()
                .max(Comparator.comparing(SatelliteMaterial::getTotalWeightKg)) // "Pegue o SatelliteMaterial que possui o maior totalWeightKg"
                .orElseThrow(() -> new RuntimeException("Nenhum material encontrado para este satélite."));

        return mainMaterial.getMaterial();
    }

    // Done: Metodo para vincular material ao satelite

    public SatelliteMaterial registerSatelliteMaterial(
            Long noradId,
            Integer materialId,
            Double totalWeightKg,
            Double recyclablePercentage,
            String structuralArea){

        Satellite satellite =
                satelliteService.findSatelliteById(noradId);

        Material material =
                materialService.materialById(materialId);

        SatelliteMaterial satelliteMaterial =
                new SatelliteMaterial();

        satelliteMaterial.setSatellite(satellite);

        satelliteMaterial.setMaterials(material);

        satelliteMaterial.setTotalWeightKg(totalWeightKg);

        satelliteMaterial.setRecyclablePercentage(
                recyclablePercentage);

        satelliteMaterial.setStructuralArea(structuralArea);

        satelliteMaterialRepository.save(satelliteMaterial);

        System.out.println(
                "Material vinculado ao satélite com sucesso.");

        return satelliteMaterial;
    }

}