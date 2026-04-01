package com.curso.validados.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.br.CPF;

@Entity
public class Person {

    // Propriedades

    //genérico não aceita tipo primitivo, por isso temos que passar Integer e nao int
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Nome não pode ser em branco.")
    private String name;

    @Min(value =  0, message = "A idade deve ser no mínimo 0.")
    private int age;

    @Email(message = "O e-mail deve ser válido")
    private String email;

    @CPF(message = "O CPF deve ser válido")
    //@Pattern(regexp = "\\d{11}", message = "O CPF deve ter 11 dígitos.")
    private String cpf;

    // Construtores

    public Person(String name, int age, String email,String cpf) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.cpf = cpf;
    }

    public Person() {
    }

    // Getters

    public Integer getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }


    // Setters

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

}
