package com.curso.bankapi.controllers.json;


import com.curso.bankapi.models.Customer;
import com.curso.bankapi.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Done: Indicação dos annotations necessarios
@RestController // Indica Controllers com endpoint JSON
@RequestMapping("/json/customers") //Raiz de customer - mapeamento dos corredores

public class CustomerJSONController {


    // Done: Injeção de DPS
    @Autowired
    private CustomerService customerService;
    // Done: Metod0 GET - Listar todos os customers
    //Endpoint: http://localhost:8080/json/customers
    @GetMapping //Indica endpoint com o métod0 GET
    public List<Customer> getAllCustomers() {
        return customerService.allCustomers();
    }


    // Done: Métod0 GET - Buscar customer por ID
    //Endpoint: http://localhost:8080/json/customers/customerId
    @GetMapping("/{customerId}")
    //@PathVartiable indica uma propriedade que pode ser passada por meio de uma URI
    public Customer getCustomerById(@PathVariable Integer customerId) {
        return customerService.customerById(customerId);
    }

    // Done: Métod0 POST - Criar novo Customer
    // Endpoint: http://localhost:8080/json/customers/create
    // Body: {"name":"Joaquim José", "cpf":"000.000.000-00"}

    @PostMapping("/create")
    public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(customer);

    }
}