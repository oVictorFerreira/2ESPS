package com.curso.bankapi.controllers.json;
//Done: Indicar estrutura REST

import com.curso.bankapi.models.OperationDTO;
import com.curso.bankapi.models.Transaction;
import com.curso.bankapi.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/json/transactions")
public class TransactionJSONController {
    // Done: Injeção de DP
    @Autowired
    private TransactionService transactionService;


    // Done: Métod0 GET - Listar todas as transações por número de conta
    // Endpoint: http://localhost:8080/json/transactions/acNumber
    @GetMapping("/{acNumber}")
    public List<Transaction> getAllTransactionsByAcNumber(@PathVariable UUID acNumber){
        return transactionService.listByAccount(acNumber);
    }



    // Done: Métod0 POST - Operação de depósito
    // Endpoint: http://localhost:8080/json/transactions/deposit
    // Body: {"acNumber":"um num de conta UUID" , "amount":100}
    @PostMapping("/deposit")
    public ResponseEntity<Transaction> postDeposit(@RequestBody OperationDTO dto){
        Transaction transaction = transactionService.deposit(dto.acNumber(), dto.amount());
        return ResponseEntity.status(HttpStatus.CREATED).body(transaction);
    }
    // Done: Métod0 POST - Operação de Saque
    // Endpoint: http://localhost:8080/json/transactions/withdraw
    // Body: {"acNumber":"um num de conta UUID" , "amount":100}
    @PostMapping("/withdraw")
    public ResponseEntity<Transaction> postWithdraw(@RequestBody OperationDTO dto){
        Transaction transaction = transactionService.withdraw(dto.acNumber(), dto.amount());
        return ResponseEntity.status(HttpStatus.CREATED).body(transaction);
    }
}
