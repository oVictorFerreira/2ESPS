package com.curso.GS2026.models;

import jakarta.persistence.*;

@Entity
public class Material {

    // Done: Propriedades

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer materialId;

    private String materialName;

    private Boolean recyclable;

    @Enumerated(EnumType.STRING)
    private ReusableFor reusableFor;

    @Enumerated(EnumType.STRING)
    private MaterialType materialType;

    // Done: Construtores

    public Material() {
    }

    public Material(Integer materialId, String materialName, Boolean recyclable, ReusableFor reusableFor, MaterialType materialType) {
        this.materialId = materialId;
        this.materialName = materialName;
        this.recyclable = recyclable;
        this.reusableFor = reusableFor;
        this.materialType = materialType;
    }

    // Done: Getters

    public Integer getMaterialId() {
        return materialId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public Boolean getRecyclable() {
        return recyclable;
    }

    public ReusableFor getReusableFor() {
        return reusableFor;
    }

    public MaterialType getMaterialType() {
        return materialType;
    }

    // Done: Setters

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public void setRecyclable(Boolean recyclable) {
        this.recyclable = recyclable;
    }

    public void setReusableFor(ReusableFor reusableFor) {
        this.reusableFor = reusableFor;
    }

    public void setMaterialType(MaterialType materialType) {
        this.materialType = materialType;
    }

    // Done: toString

    @Override
    public String toString() {
        return "Material{" +
                "materialId=" + materialId +
                ", materialName='" + materialName + '\'' +
                ", recyclable=" + recyclable +
                ", reusableFor='" + reusableFor + '\'' +
                ", materialType=" + materialType +
                '}';
    }
}