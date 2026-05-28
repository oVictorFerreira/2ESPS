package com.curso.GS2026.dto;

public class SatelliteMaterialDTO {

    // Propriedades

    private String materialName;

    private Double weightKg;

    private Double materialPercentage;

    private Double recyclablePercentage;

    private String reusableFor;

    // Construtores

    public SatelliteMaterialDTO() {
    }

    public SatelliteMaterialDTO(String materialName,
                                Double weightKg,
                                Double materialPercentage,
                                Double recyclablePercentage,
                                String reusableFor) {

        this.materialName = materialName;
        this.weightKg = weightKg;
        this.materialPercentage = materialPercentage;
        this.recyclablePercentage = recyclablePercentage;
        this.reusableFor = reusableFor;
    }

    // Getters

    public String getMaterialName() {
        return materialName;
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public Double getMaterialPercentage() {
        return materialPercentage;
    }

    public Double getRecyclablePercentage() {
        return recyclablePercentage;
    }

    public String getReusableFor() {
        return reusableFor;
    }

    // Setters

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setWeightKg(Double weightKg) {
        this.weightKg = weightKg;
    }

    public void setMaterialPercentage(Double materialPercentage) {
        this.materialPercentage = materialPercentage;
    }

    public void setRecyclablePercentage(Double recyclablePercentage) {
        this.recyclablePercentage = recyclablePercentage;
    }

    public void setReusableFor(String reusableFor) {
        this.reusableFor = reusableFor;
    }

    // toString

    @Override
    public String toString() {
        return "SatelliteMaterialDTO{" +
                "materialName='" + materialName + '\'' +
                ", weightKg=" + weightKg +
                ", materialPercentage=" + materialPercentage +
                ", recyclablePercentage=" + recyclablePercentage +
                ", reusableFor='" + reusableFor + '\'' +
                '}';
    }
}