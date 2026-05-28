package com.curso.GS2026.controllers;

import com.curso.GS2026.dto.CreateSatelliteDTO;
import com.curso.GS2026.dto.CreateSatelliteMaterialDTO;
import com.curso.GS2026.dto.SatelliteDetailsDTO;
import com.curso.GS2026.models.MaterialType;
import com.curso.GS2026.models.Satellite;
import com.curso.GS2026.models.SatelliteMaterial;
import com.curso.GS2026.models.Status;
import com.curso.GS2026.services.SatelliteMaterialService;
import com.curso.GS2026.services.SatelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/satellites")
public class SatelliteController {

    // Injeção de DPs
    @Autowired
    private SatelliteService satelliteService;

    @Autowired
    private SatelliteMaterialService satelliteMaterialService;

    // Done: Metodo GET - Buscar satelite por operador
    // Endpoint: http://localhost:8080/api/satellite/
    @GetMapping("/operator/{operatorId}")
    public List<Satellite> getSatelliteByOperator(@PathVariable Integer operatorId){
        return satelliteService.getByOperator(operatorId);
    }

    // Done: Metodo GET - Buscar satélites por status
    // Endpoint: http://localhost:8080/api/satellites/status/{status}
    @GetMapping("/status/{status}")
    public List<Satellite> getSatelliteByStatus(@PathVariable Status status){
        return satelliteService.getByStatus(status);
    }

    // Done: Metodo POST - Salvar os satelites encontrados na api
    // Endpoint: http://localhost:8080/api/satellites/create
    // Body: {"noradId":25544, "operatorId":1, "status":"ACTIVE"}
    @PostMapping("/create")
    public ResponseEntity<Satellite> postSatelliteFromTle(@RequestBody CreateSatelliteDTO dto){
        Satellite satellite = satelliteService.createSatelliteFromTle(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(satellite);
    }

    // Done: Metodo POST - Vincular materiais ao satelite
    // Endpoint: http://localhost:8080/api/satellites/{noradId}/materials
    // Body: {"materialId": 1, "totalWeightKg": 35000, "recyclablePercentage": 88, "structuralArea": "PressureModules"}
    @PostMapping("/{noradId}/materials")
    public ResponseEntity<SatelliteMaterial> addMaterialToSatellite(@PathVariable Long noradId, @RequestBody CreateSatelliteMaterialDTO dto){

        SatelliteMaterial satelliteMaterial = satelliteMaterialService.registerSatelliteMaterial(noradId, dto.getMaterialId(), dto.getTotalWeightKg(), dto.getRecyclablePercentage(), dto.getStructuralArea());

        return ResponseEntity.status(HttpStatus.CREATED).body(satelliteMaterial);
    }

    // Done: Metodo GET - Visualizar todas as informações do satelite
    // Endpoint: http://localhost:8080/api/satellites/
    @GetMapping("/id/{noradId}")
    public SatelliteDetailsDTO getSatelliteById(@PathVariable Long noradId){
        return satelliteService.getCompleteSatelliteDetails(noradId);
    }

    // Done: Metodo GET - Buscar satelites pelo tipo do material
    // Endpoint: http://localhost:8080/api/satellites/material/{type}
    @GetMapping("/material/{type}")
    public Set<Satellite> getSatelliteByMaterial(@PathVariable MaterialType type){
        return satelliteService.getSatellitesByMaterialType(type);
    }

}
