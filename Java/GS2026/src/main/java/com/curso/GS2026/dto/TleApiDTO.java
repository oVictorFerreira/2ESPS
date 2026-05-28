package com.curso.GS2026.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TleApiDTO {

    @JsonProperty("satelliteId")
    private Long noradId;

    private String name;

    public TleApiDTO() {
    }

    public Long getNoradId() {
        return noradId;
    }

    public void setNoradId(Long noradId) {
        this.noradId = noradId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TleApiDTO{" +
                "noradId=" + noradId +
                ", name='" + name + '\'' +
                '}';
    }
}