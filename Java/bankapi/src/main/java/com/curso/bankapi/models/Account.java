package com.curso.bankapi.models;

import jakarta.persistence.*;

import java.util.UUID;
@Entity @Table(name = "contas")
public class Account {

    //Done: Propriedades

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "num_conta")
    private UUID acNumber;
    @Column(name = "saldo")
    private Float balance = 0.0f;


    @ManyToOne @JoinColumn(name = "cliente")
    private Customer customer;


    // Done: Construtores

    public Account(Float balance, Customer customer) {
        this.balance = balance;
        this.customer = customer;
    }

    public Account() {
    }

    // Done: Getters e setters

    public UUID getAcNumber() {
        return acNumber;
    }

    public Float getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Done: Sobrescrita toString()

    @Override
    public String toString() {
        return "Account{" +
                "acNumber=" + acNumber +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }
}
