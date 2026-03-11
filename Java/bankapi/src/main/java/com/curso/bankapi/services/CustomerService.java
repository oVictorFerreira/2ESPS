package com.curso.bankapi.services;

import com.curso.bankapi.models.Customer;
import com.curso.bankapi.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // Isso indica produçao de regra de negócio
public class CustomerService {

    // Done: Injetar dependecia

    @Autowired
    private CustomerRepository customerRepository;

    // Done: Métod0 para criar um novo cliente

    public Customer createCustomer(Customer customer) {
        //Fazendo a tentativa de salvar um novo cliente

        try{
            customerRepository.save(customer);
            System.out.println("Cliente criado com sucesso");
        }
        catch(Exception exception){
            System.out.println("Erro ao criar o cliente.");
            System.out.println(exception);
        }

        return customer;
    }
    // Done: Métod0 para buscar um cliente por Id

    public Customer customerById(Integer customerId) {
        //Criando um cliente vazio
        Customer foundCustomer = new Customer();
        try{
            //Tentativa de popular
            foundCustomer =  customerRepository.findById(customerId).get();
            System.out.println("Cliente encontrado com sucesso");
            System.out.println(foundCustomer);
        }
        catch(Exception exception){
            System.out.println("Erro ao encontrar o cliente:");
            System.out.println(exception);
        }

        return foundCustomer;
    }

    // Done: Métod0 para listar todos os clientes

    public List<Customer> allCustomers() {
        //Criando uma lista vazia
        List<Customer> customers = new ArrayList<>();

        //Populando lista
        customerRepository.findAll().forEach(customer ->{
            customers.add(customer);
            System.out.println(customer);
        });

        return customers;
    }

}
