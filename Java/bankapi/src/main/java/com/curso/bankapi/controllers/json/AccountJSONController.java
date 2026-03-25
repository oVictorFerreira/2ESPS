package com.curso.bankapi.controllers.json;


import com.curso.bankapi.models.Account;
import com.curso.bankapi.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

// Done: Indicar estrutura REST

@RestController
@RequestMapping("/json/accounts")
public class AccountJSONController {
    //Done: Injeção das DPs
    @Autowired
    private AccountService accountService;

    // Done: métod0 GET - listar todas as contas
    //Endpoint: http://localhost:8080/json/accounts
    @GetMapping
    public List<Account> getAllAccounts(){
        return accountService.allAccounts();
    }

    // Done: Métod0 GET - buscar conta por número de conta
    //Endpoint: http://localhost:8080/json/accounts/acNumber
    @GetMapping("/{acNumber}")
    public Account getAccountByAcNumber(@PathVariable UUID acNumber){
        return accountService.accountByAcNumber(acNumber);
    }

    // Done: Métod0 GET - Buscar Saldo por número de conta
    //Endpoint: http://localhost:8080/json/accounts/acNumber/balance
    @GetMapping("/{acNumber}/balance")
    public Float getBalanceByAcNumber(@PathVariable UUID acNumber){
        return accountService.balanceByAcNumber(acNumber);
    }


    // Done: métod0 POST - Criar nova conta
    //Endpoint: http://localhost:8080/json/accounts/create/customerId
    @PostMapping("create/{customerId}")
    public ResponseEntity<Account> postAccount(@PathVariable Integer customerId){
        Account account = accountService.createAccount(customerId);
        return ResponseEntity.status(HttpStatus.CREATED).body(account);
    }
}
