package com.curso.bankapi;

import com.curso.bankapi.models.Customer;
import com.curso.bankapi.services.AccountService;
import com.curso.bankapi.services.CustomerService;
import com.curso.bankapi.services.TransactionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class BankapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankapiApplication.class, args);

        testador();
    }

    //ZONA DE TESTE ++++++++++++++++++++++++++++++++++++++++++++
    //DONE: Injetar Serviços - Application está fora do MVC!!! Injetar por construtores
    private static CustomerService customerService;
    private static AccountService accountService;
    private static TransactionService transactionService;

    public BankapiApplication(CustomerService customerService, AccountService accountService, TransactionService transactionService) {
        this.customerService = customerService;
        this.accountService = accountService;
        this.transactionService = transactionService;
    }

    static void testador(){

        //DONE: Testar servicos de Customer
        //Criando um customer
        Customer customerA = new Customer("Maria Francisca", "111.111.111-11");
        //customerService.createCustomer(customerA);

        //Buscando um customer por id
        //customerService.customerById(3);

        //Listando todos os customers
        //customerService.allCustomers();

        //TODO: Testar serviços de Account
        //Criando uma conta
        //accountService.createAccount(2);

        //Buscando uma conta por num de conta
        //accountService.accountByAcNumber(UUID.fromString("ef19d3fd-cd22-4b19-80f6-5bfc24836b02"));

        //Listando todas as contas
        //accountService.allAccounts();

        //TODO: Testar Serviços de Transactions
        //transactionService.deposit(UUID.fromString("ef19d3fd-cd22-4b19-80f6-5bfc24836b02"), 1000.0f);
        //transactionService.withdraw(UUID.fromString("ef19d3fd-cd22-4b19-80f6-5bfc24836b02"), 250.0f);
        //transactionService.listByAccount(UUID.fromString("ef19d3fd-cd22-4b19-80f6-5bfc24836b02"));
    }

    //ZONA DE TESTE ++++++++++++++++++++++++++++++++++++++++++++
}