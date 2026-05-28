package com.curso.GS2026.models;

import jakarta.persistence.*;


@Entity
public class Operator {

    // Done: Propriedades
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer operatorId;

    private String opName;

    @Enumerated(EnumType.STRING)
    private OperationalRole role;

    private Country country;

    // Done: Construtores

    public Operator(Integer operatorId, String opName, OperationalRole role, Country country) {
        this.operatorId = operatorId;
        this.opName = opName;
        this.role = role;
        this.country = country;
    }

    public Operator() {
    }

    // Done: Getters

    public Integer getOperatorId() {
        return operatorId;
    }

    public String getOpName() {
        return opName;
    }

    public OperationalRole getRole() {
        return role;
    }

    public Country getCountry() {
        return country;
    }

    // Done: Setters

    public void setOpName(String opName) {
        this.opName = opName;
    }

    public void setRole(OperationalRole role) {
        this.role = role;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    // Done: toString

    @Override
    public String toString() {
        return "Operator{" +
                "operatorId=" + operatorId +
                ", opName='" + opName + '\'' +
                ", role=" + role +
                ", country='" + country + '\'' +
                '}';
    }
}
