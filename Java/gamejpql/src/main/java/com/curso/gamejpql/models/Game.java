package com.curso.gamejpql.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.Year;

@Entity
public class Game {

    // Propriedades
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String publisher;
    private String gender;
    private Year releaseYear;

    // Construtores

    public Game(String title, String publisher, String gender, Year releaseYear) {
        this.title = title;
        this.publisher = publisher;
        this.gender = gender;
        this.releaseYear = releaseYear;
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

    public Year getReleaseYear() {
        return releaseYear;
    }

    // Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setReleaseYear(Year releaseYear) {
        this.releaseYear = releaseYear;
    }

    // toString


    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", gender='" + gender + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
