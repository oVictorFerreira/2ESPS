package com.curso.bankapi.models;

import jakarta.persistence.*;

@Entity @Table(name = "transacoes")
public class Transaction {
    //Done: Propriedades
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_transacao")
    private Integer tsNumber;

    @Column(name = "quantia")
    private Float amount;

    @Column(name = "tipo")
    @Enumerated(EnumType.STRING) //Especificando valor do enum como string
    private TransactionType type;

    @ManyToOne @JoinColumn(name = "conta")
    private Account account;

    //Done: Construtores

    public Transaction(Float amount, TransactionType type, Account account) {
        this.amount = amount;
        this.type = type;
        this.account = account;
    }

    public Transaction() {
    }

    //Todo: Getters e setters
    public Integer getTsNumber() {
        return tsNumber;
    }

    public Float getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    public Account getAccount() {
        return account;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    //Todo: Sobrescrita toString

    @Override
    public String toString() {
        return "Transactions{" +
                "tsNumber=" + tsNumber +
                ", amount=" + amount +
                ", type=" + type +
                ", account=" + account +
                '}';
    }
}
