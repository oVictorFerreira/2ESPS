package com.curso.GS2026.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Satellite {

    // Done: Propriedades
    @Id
    private Long noradId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "operatorId")
    private Operator operator;

    private Status status;

    // Done: Construtores

    public Satellite(Long noradId, String name, Operator operator, Status status) {
        this.noradId = noradId;
        this.name = name;
        this.operator = operator;
        this.status = status;
    }

    public Satellite() {
    }

    // Done: Getters

    public Long getNoradId() {
        return noradId;
    }

    public String getName() {
        return name;
    }

    public Operator getOperator() {
        return operator;
    }

    public Status getStatus() {
        return status;
    }

    // Done: Setters


    public void setNoradId(Long noradId) {
        this.noradId = noradId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    // Done: toString

    @Override
    public String toString() {
        return "Satellite{" +
                "noradId=" + noradId +
                ", name='" + name + '\'' +
                ", operator=" + operator +
                ", status=" + status +
                '}';
    }
}
