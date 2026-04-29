package com.curso.contatos.models;

import jakarta.persistence.*;

@Entity
@Table(name = "telefones")
public class Phone {
    // Propriedades

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false)
    private String name;

    @Column(name = "numero",  nullable = false)
    private String phoneNum;

    // Construtores

    public Phone(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public Phone() {
    }

    //Getters

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }


    // toString


    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
