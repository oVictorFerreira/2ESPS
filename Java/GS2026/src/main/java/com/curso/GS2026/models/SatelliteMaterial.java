package com.curso.GS2026.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class SatelliteMaterial {

    // Done: Propriedades

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer satelliteMaterialId;

    @ManyToOne
    @JoinColumn(name = "noradId")
    private Satellite satellite;

    @ManyToOne
    @JoinColumn(name = "materialId")
    private Material material;

    private Double totalWeightKg;

    private Double recyclablePercentage;

    private String structuralArea;

    // Construtores

    public SatelliteMaterial() {
    }

    public SatelliteMaterial(Integer satelliteMaterialId, Satellite satellite, Material material, Double totalWeightKg, Double recyclablePercentage, String structuralArea) {
        this.satelliteMaterialId = satelliteMaterialId;
        this.satellite = satellite;
        this.material = material;
        this.totalWeightKg = totalWeightKg;
        this.recyclablePercentage = recyclablePercentage;
        this.structuralArea = structuralArea;
    }

    // Done: Getters

    public Integer getSatelliteMaterialId() {
        return satelliteMaterialId;
    }

    public Satellite getSatellite() {
        return satellite;
    }

    public Material getMaterial() {
        return material;
    }

    public Double getTotalWeightKg() {
        return totalWeightKg;
    }

    public Double getRecyclablePercentage() {
        return recyclablePercentage;
    }

    public String getStructuralArea() {
        return structuralArea;
    }

    // Done: Setters

    public void setSatelliteMaterialId(Integer satelliteMaterialId) {
        this.satelliteMaterialId = satelliteMaterialId;
    }

    public void setSatellite(Satellite satellite) {
        this.satellite = satellite;
    }

    public void setMaterials(Material material) {
        this.material = material;
    }

    public void setTotalWeightKg(Double totalWeightKg) {
        this.totalWeightKg = totalWeightKg;
    }

    public void setRecyclablePercentage(Double recyclablePercentage) {
        this.recyclablePercentage = recyclablePercentage;
    }

    public void setStructuralArea(String structuralArea) {
        this.structuralArea = structuralArea;
    }

    // Done: toString

    @Override
    public String toString() {
        return "SatelliteMaterial{" +
                "satelliteMaterialId=" + satelliteMaterialId +
                ", satellite=" + satellite +
                ", material=" + material +
                ", totalWeightKg=" + totalWeightKg +
                ", recyclablePercentage=" + recyclablePercentage +
                ", structuralArea='" + structuralArea + '\'' +
                '}';
    }
}