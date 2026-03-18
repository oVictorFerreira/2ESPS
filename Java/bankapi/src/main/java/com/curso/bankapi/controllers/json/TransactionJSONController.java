package com.curso.bankapi.controllers.json;
//Todo: Indicar estrutura REST

import com.curso.bankapi.models.Transaction;
import com.curso.bankapi.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/json/transactions")
public class TransactionJSONController {
    // Done: Injeção de DP
    @Autowired
    private TransactionService transactionService;


    // Todo: Métod0 GET - Listar todas as transações por número de conta
    // Endpoint: http://localhost:8080/json/transactions/acNumber
    @GetMapping("/{acNumber}")
    public List<Transaction> getAllTransactionsByAcNumber(@PathVariable UUID acNumber){
        return transactionService.listByAccount(acNumber);
    }


    // Todo: Métod0 POST - Operação de depósito

    // Todo: Métod0 POST - Operação de Saque

}
