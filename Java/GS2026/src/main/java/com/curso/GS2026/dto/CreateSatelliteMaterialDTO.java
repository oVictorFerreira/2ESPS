package com.curso.GS2026.dto;

public class CreateSatelliteMaterialDTO {

    private Integer materialId;

    private Double totalWeightKg;

    private Double recyclablePercentage;

    private String structuralArea;

    public CreateSatelliteMaterialDTO() {
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Double getTotalWeightKg() {
        return totalWeightKg;
    }

    public void setTotalWeightKg(Double totalWeightKg) {
        this.totalWeightKg = totalWeightKg;
    }

    public Double getRecyclablePercentage() {
        return recyclablePercentage;
    }

    public void setRecyclablePercentage(Double recyclablePercentage) {
        this.recyclablePercentage = recyclablePercentage;
    }

    public String getStructuralArea() {
        return structuralArea;
    }

    public void setStructuralArea(String structuralArea) {
        this.structuralArea = structuralArea;
    }
}