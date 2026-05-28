package com.curso.GS2026.services;

import com.curso.GS2026.models.Material;
import com.curso.GS2026.repositories.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MaterialService {
    // Done: Injeção de DP

    @Autowired
    private MaterialRepository materialRepository;

    // Done: Metodo para listar todos os materiais cadastrados

    public List<Material> allMaterials(){
        // Lista vazia
        List<Material> materials = new ArrayList<>();

        //Populando a lista
        materialRepository.findAll().forEach(material->{
            materials.add(material);
            System.out.println(material);
        });
        return materials;
    }
    // Done: Metodo para buscar um material pelo ID

    public Material materialById(Integer materialId){
        // Criando um material vazio
        Material foundMaterial = new Material();

        try{
            foundMaterial = materialRepository.findById(materialId).get();
            System.out.println("Material encontrado:");
            System.out.println(foundMaterial);
        }
        catch(Exception exception){
            System.out.println("Erro ao encontrar este material.");
            System.out.println(exception);
        }
        return foundMaterial;
    }
    // Done: Metodo para registrar novo material

    public Material newMaterial(Material material){
        try{
            materialRepository.save(material);
            System.out.println("Material salvo com sucesso: ");
            System.out.println(material.getMaterialName());
        }
        catch(Exception exception){
            System.out.println("Erro ao cadastrar este material.");
            System.out.println(exception);
        }
        return material;
    }

    // Done: Metodo para deletar material existente

    public void deleteMaterial(Integer materialId){
        try{
            materialRepository.deleteById(materialId);
            System.out.println("O material de ID: " + materialId + "foi deletado com sucesso.");
        }
        catch (Exception exception){
            System.out.println("Erro ao deletar este material.");
            System.out.println(exception);
        }
    }
}
