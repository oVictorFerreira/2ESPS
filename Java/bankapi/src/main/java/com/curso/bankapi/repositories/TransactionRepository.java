package com.curso.bankapi.repositories;

import com.curso.bankapi.models.Account;
import com.curso.bankapi.models.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

    //Todo: método customizado para consulta de transações por num de conta
    List<Transaction> findByAccountAcNumber(UUID acNumber);



}
