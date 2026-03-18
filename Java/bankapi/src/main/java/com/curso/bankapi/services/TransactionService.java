package com.curso.bankapi.services;

import com.curso.bankapi.models.Account;
import com.curso.bankapi.models.Transaction;
import com.curso.bankapi.models.TransactionType;
import com.curso.bankapi.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TransactionService {

    //DONE: Injetar DPs
    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private AccountService accountService;

    //DONE: Métod0 para transação do tipo deposito
    public Transaction deposit(UUID acNumber, Float amout){
        //Indicando a conta a ser utilizada na transação
        Account account = accountService.accountByAcNumber(acNumber);

        //CRiando novo saldo
        Float newBalance = account.getBalance() + amout;

        //CRiando a transação a ser salva
        Transaction transaction = new Transaction(amout, TransactionType.DEPOSIT, account);

        //Tentativa de salvar a transação no Db
        try{
            //Atualizando saldo
            accountService.updateBalance(account, newBalance);

            //Salvando a transação no banco
            transactionRepository.save(transaction);
            System.out.println("Deposito efetuado com sucesso.");
        }
        catch (Exception exception){
            System.out.println("Erro ao efetuar transação:");
            System.out.println(exception);
        }

        return transaction;
    }

    //DONE: Métod0 para transação do tipo saque
    public Transaction withdraw(UUID acNumber, Float amout){
        //Indicando a conta a ser utilizada na transação
        Account account = accountService.accountByAcNumber(acNumber);

        //CRiando novo saldo
        Float newBalance = account.getBalance() - amout;

        //CRiando a transação a ser salva
        Transaction transaction = new Transaction(amout, TransactionType.WITHDRAW, account);

        //Tentativa de salvar a transação no Db
        try{
            //Atualizando saldo
            accountService.updateBalance(account, newBalance);

            //Salvando a transação no banco
            transactionRepository.save(transaction);
            System.out.println("Saque efetuado com sucesso.");
        }
        catch (Exception exception){
            System.out.println("Erro ao efetuar transação:");
            System.out.println(exception);
        }

        return transaction;
    }

    //DONE: Métod0 para listar todas as transações por num de conta
    public List<Transaction> listByAccount(UUID acNumber){

        //Criando lista vazia
        List<Transaction> transactions = new ArrayList<>();

        //Populando
        transactionRepository.findByAccountAcNumber(acNumber).forEach(transaction -> {
            transactions.add(transaction);
            System.out.println(transaction);
        });

        return transactions;
    }
}
