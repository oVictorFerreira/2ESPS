package com.curso.GS2026.controllers;

import com.curso.GS2026.models.Material;
import com.curso.GS2026.services.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materials")
public class MaterialController {
    // Injeção de DPs
    @Autowired
    private MaterialService materialService;

    // Done: Metodo GET - Listar todos os materiais cadastrados
    @GetMapping
    public List<Material> getAllMaterials(){
        return materialService.allMaterials();
    }

    // Done: Metodo GET - Buscar um material pelo ID
    //Endpoint: http://localhost:8080/api/materials/id/{materialId}
    @GetMapping("/id/{materialId}")
    public Material getMaterialById(@PathVariable Integer materialId){
        return materialService.materialById(materialId);
    }

    // Done: Metodo POST - Registrar novo material
    // Body: {"materialName":"Titanium","recyclable":true,"reusableFor":"STRUCTURAL_COMPONENTS", "materialType":"METAL"}
    @PostMapping("/create")
    public ResponseEntity<Material> postMaterial(@RequestBody Material material){
        materialService.newMaterial(material);
        return ResponseEntity.status(HttpStatus.CREATED).body(material);
    }

    // Done:  Metodo DELETE - Deletar material existente
    //Endpoint: http://localhost:8080/api/materials/delete/{materialId}
    @DeleteMapping("/delete/{materialId}")
    public ResponseEntity<Void> deleteMaterial(@PathVariable Integer materialId){
        materialService.deleteMaterial(materialId);
        return ResponseEntity.noContent().build();
    }

}
