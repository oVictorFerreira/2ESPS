package com.curso.bankapi.services;

import com.curso.bankapi.models.Account;
import com.curso.bankapi.models.Customer;
import com.curso.bankapi.repositories.AccountRepository;
import com.curso.bankapi.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AccountService {
    // Done: Injetar dependência

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private CustomerService customerService;

    // Done: Métod0 responsável pela criação de uma conta

    public Account createAccount(Integer customerID){
        //Criando o cliente que sera o dono da conta
            Customer customer = customerService.customerById(customerID);

        //Criando a conta
            Account newAccount = new Account();
            newAccount.setCustomer(customer);

        //Tentativa de gravar a  conta no DB
        try{
            accountRepository.save(newAccount);
            System.out.println("Conta criada com sucesso");
        }
        catch(Exception exception){
            System.out.println("Erro ao criar a conta");
            System.out.println(exception);
        }

        return newAccount;
    }

    // Done: Métod0 responsável por buscar uma conta por número de conta

        public Account accountByAcNumber(UUID acNumber){

        //Criando uma conta vazia para ser populada
            Account foundAccount = new Account();

            try{
                foundAccount = accountRepository.findById(acNumber).get();
                System.out.println(foundAccount);
            }
            catch(Exception exception) {
                System.out.println("Erro ao buscar a conta");
                System.out.println(exception);
            }
        return foundAccount;
    }
    // Done: Métod0 responsável por listar todas as contas

        public List<Account> allAccounts(){
            // Criando lista vazia
            List<Account> accounts = new ArrayList<>();

            //Populando lista
            accountRepository.findAll().forEach(account ->{
                    accounts.add(account);
                    System.out.println();
            });
            return accounts;

        }
    // Done: Métod0 responsável por trazer um saldo por num de conta

        public Float balanceByAcNumber(UUID acNumber){
            Float balance = accountByAcNumber(acNumber).getBalance();

            System.out.println("O saldo da conta é de: R$"+balance);

            return balance;

        }
    // Done: Métod0 responsável por atualizar o saldo de uma conta

        public void updateBalance(Account account, Float newBalance){
            account.setBalance(newBalance);
            accountRepository.save(account);
            System.out.println("Novo saldo é de: R$"+newBalance);

        }
}
