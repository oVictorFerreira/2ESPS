package com.curso.bankapi.services;

import com.curso.bankapi.models.Account;
import com.curso.bankapi.models.Transaction;
import com.curso.bankapi.models.TransactionType;
import com.curso.bankapi.repositories.CustomerRepository;
import com.curso.bankapi.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TransactionService {

    // Done: Injetar DPs

    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private AccountService accountService;

    // Done: Metod0 para transação do tipo depósito

    public Transaction deposit(UUID acNumber, Float amount) {
        // indicando a conta a ser utilizada na transação
        Account account = accountService.accountByAcNumber(acNumber);

        // Criando novo saldo

        Float newBalance = account.getBalance() + amount;

        // Criando a transação a ser salva
        Transaction transaction = new Transaction(amount, TransactionType.DEPOSIT, account);

        // Tentativa de salvar a transação no DB
        try{
            //Atualizando saldo
            accountService.updateBalance(account, newBalance);

            //Salvando a trasação no banco

            transactionRepository.save(transaction);

            System.out.println("Depósito realizado com sucesso.");
            System.out.println(transaction);
        }
        catch(Exception exception){
            System.out.println("Erro ao depositar");
            System.out.println(exception);
        }
        return transaction;
    }

    // Done: Métod0 para transação do tipo saque

    public Transaction withdraw(UUID acNumber, Float amount) {
        // indicando a conta a ser utilizada na transação
        Account account = accountService.accountByAcNumber(acNumber);

        // Criando novo saldo

        Float newBalance = account.getBalance() - amount;

        // Criando a transação a ser salva
        Transaction transaction = new Transaction(amount, TransactionType.WITHDRAW, account);

        // Tentativa de salvar a transação no DB
        try{
            //Atualizando saldo
            accountService.updateBalance(account, newBalance);

            //Salvando a trasação no banco

            transactionRepository.save(transaction);

            System.out.println("Saque realizado com sucesso.");
            System.out.println(transaction);
        }
        catch(Exception exception){
            System.out.println("Erro ao sacar");
            System.out.println(exception);
        }
        return transaction;
    }

    // Done: Métod0 para listar todas as transações por número de conta

    public List<Transaction> listByAccount(UUID acNumber) {
        //Criando uma lista vazia
        List<Transaction> transactions = new ArrayList<>();

        // Populando a lista
        transactionRepository.findByAccountAcNumber(acNumber).forEach(transaction ->{
            transactions.add(transaction);
            System.out.println(transaction);
        });

        return transactions;
    }
}
