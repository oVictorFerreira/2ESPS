package com.curso.bankapi.services;

import com.curso.bankapi.models.Account;
import com.curso.bankapi.models.Customer;
import com.curso.bankapi.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AccountService {

    //DONE: Injetar DPs
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private CustomerService customerService;

    //DONE: Métod0 responsável pela criação de uma conta
    public Account createAccount(Integer customerId){

        //Buscando o cliente que será o dono da conta
        Customer customer = customerService.customerById(customerId);

        //Criando a conta
        Account newAccount = new Account();
        newAccount.setCustomer(customer);

        //Tentavida de gravar a conta no DB
        try{
            accountRepository.save(newAccount);
            System.out.println("Conta criada com suceso.");
        }
        catch (Exception exception){
            System.out.println("Erro ao criar a conta:");
            System.out.println(exception);
        }

        return newAccount;
    }

    //DONE: Métod0 responsável por buscar uma conta por num de conta
    public Account accountByAcNumber(UUID acNumber){

        //Criando uma conta vazia para ser populada
        Account foundAccount = new Account();

        //Tentativa de popular a conta
        try{
            foundAccount = accountRepository.findById(acNumber).get();
            System.out.println(foundAccount);
        } catch (Exception exception) {
            System.out.println("Erro ao buscar conta:");
            System.out.println(exception);
        }

        return foundAccount;
    }

    //DONE: Métod0 responsável por listar todas as contas
    public List<Account> allAccounts(){

        //Criando lista vazia para popular
        List<Account> accounts = new ArrayList<>();

        //Populando a lista
        accountRepository.findAll().forEach(account -> {
            accounts.add(account);
            System.out.println(account);
        });

        return accounts;
    }

    //DONE: Métod0 responsável por trazer um saldo por num de conta
    public Float balanceByAcNumber(UUID acNumber){

        Float balance = accountByAcNumber(acNumber).getBalance();

        System.out.println("O Saldo da conta é de: " + balance);

        return balance;
    }

    //DONE: Métod0 responsável por atualizar o saldo de uma conta
    public void updateBalance(Account account, Float newBalance){
        account.setBalance(newBalance);
        accountRepository.save(account);
        System.out.println("Novo saldo é de: " + newBalance);
    }
}
