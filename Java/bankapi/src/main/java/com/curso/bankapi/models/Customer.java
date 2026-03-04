package com.curso.bankapi.models;


import jakarta.persistence.*;

@Entity @Table(name = "Clientes")
public class Customer {

    // Done: Propriedades
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cliente")
    private Integer id;

    @Column(name = "nome")
    private String name;

    @Column
    private String cpf;


    // Done: Construtores

    public Customer(String cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    public Customer() {
    }

    // Done: Getters e setters

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Done: sobrescrita de toString


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
