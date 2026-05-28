package com.curso.GS2026.dto;

import java.util.List;

public class SatelliteDetailsDTO {

    // Dados da API TLE

    private Long noradId;

    private String satelliteName;

    // Dados internos

    private Double totalWeightKg;

    private Double totalRecyclablePercentage;

    private List<SatelliteMaterialDTO> materials;

    // Construtores

    public SatelliteDetailsDTO() {
    }

    public SatelliteDetailsDTO(Long noradId,
                               String satelliteName,
                               Double totalWeightKg,
                               Double totalRecyclablePercentage,
                               List<SatelliteMaterialDTO> materials) {

        this.noradId = noradId;
        this.satelliteName = satelliteName;
        this.totalWeightKg = totalWeightKg;
        this.totalRecyclablePercentage = totalRecyclablePercentage;
        this.materials = materials;
    }

    // Getters

    public Long getNoradId() {
        return noradId;
    }

    public String getSatelliteName() {
        return satelliteName;
    }

    public Double getTotalWeightKg() {
        return totalWeightKg;
    }

    public Double getTotalRecyclablePercentage() {
        return totalRecyclablePercentage;
    }

    public List<SatelliteMaterialDTO> getMaterials() {
        return materials;
    }

    // Setters

    public void setNoradId(Long noradId) {
        this.noradId = noradId;
    }

    public void setSatelliteName(String satelliteName) {
        this.satelliteName = satelliteName;
    }

    public void setTotalWeightKg(Double totalWeightKg) {
        this.totalWeightKg = totalWeightKg;
    }

    public void setTotalRecyclablePercentage(Double totalRecyclablePercentage) {
        this.totalRecyclablePercentage = totalRecyclablePercentage;
    }

    public void setMaterials(List<SatelliteMaterialDTO> materials) {
        this.materials = materials;
    }

    // toString

    @Override
    public String toString() {
        return "SatelliteDetailsDTO{" +
                "noradId=" + noradId +
                ", satelliteName='" + satelliteName + '\'' +
                ", totalWeightKg=" + totalWeightKg +
                ", totalRecyclablePercentage=" + totalRecyclablePercentage +
                ", materials=" + materials +
                '}';
    }
}