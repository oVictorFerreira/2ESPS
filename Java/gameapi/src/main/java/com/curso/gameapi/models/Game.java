package com.curso.gameapi.models;

import jakarta.persistence.*;

import java.time.Year;

@Entity // Responsável por levar uma classe como entidade para o DB
public class Game {

    // Propriedades
    @Id // Indica Chave primária - PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica campo auto-gerado
    private Integer id;


    @Column // Indica um campo/coluna em uma entidade
    private String title;


    @Column
    private String publisher;


    @Column
    private String gender;


    @Column
    private Year releaseyear;

    // Construtores - - MENOS ID PQ QUEM CUIDA É O BANCO DE DADOS

    public Game(String title, String publisher, String gender, Year releaseyear) {
        this.title = title;
        this.publisher = publisher;
        this.gender = gender;
        this.releaseyear = releaseyear;
    }

    public Game() {

    }

    // Getters

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGender() {
        return gender;
    }

    public Year getYear() {
        return releaseyear;
    }


    // Setters - MENOS ID PQ QUEM CUIDA É O BANCO DE DADOS

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setYear(Year year) {
        this.releaseyear = releaseyear;
    }


    // Metodos sobrescritos


    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", gender='" + gender + '\'' +
                ", year=" + releaseyear +
                '}';
    }
}
