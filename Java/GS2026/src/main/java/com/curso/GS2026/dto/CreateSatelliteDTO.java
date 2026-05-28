package com.curso.GS2026.dto;

import com.curso.GS2026.models.Status;

public class CreateSatelliteDTO {

    private Long noradId;

    private Integer operatorId;

    private Status status;

    public CreateSatelliteDTO(Long noradId, Integer operatorId, Status status) {
        this.noradId = noradId;
        this.operatorId = operatorId;
        this.status = status;
    }

    public Long getNoradId() {
        return noradId;
    }

    public void setNoradId(Long noradId) {
        this.noradId = noradId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CreateSatelliteDTO{" +
                "noradId=" + noradId +
                ", operatorId=" + operatorId +
                ", status=" + status +
                '}';
    }
}
