package com.curso.bankapi;

import com.curso.bankapi.services.AccountService;
import com.curso.bankapi.services.CustomerService;
import com.curso.bankapi.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankapiApplication.class, args);
	}

    //-------------------- Zona de Teste ------------------------
    // Done: Injetar serviços -- Application esta fora do MVC então nao funciona o @Autowired, tem q fazer por contructor
    private CustomerService customerService;
    private AccountService accountService;
    private TransactionService transactionService;

    public BankapiApplication(TransactionService transactionService, AccountService accountService, CustomerService customerService) {
        this.transactionService = transactionService;
        this.accountService = accountService;
        this.customerService = customerService;
    }

    // Todo: testar serviços de Customer

    // Todo: Testar serviços de Account

    // Todo: Testar serviços de transactions
    //-------------------- Zona de Teste ------------------------
}
