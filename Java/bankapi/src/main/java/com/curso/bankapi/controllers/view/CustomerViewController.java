package com.curso.bankapi.controllers.view;

import com.curso.bankapi.models.Customer;
import com.curso.bankapi.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// Done: Indicação de controller visual + caminhos
@Controller
@RequestMapping("/view/customers")
public class CustomerViewController {

    // Done: Injeção das dependências
    @Autowired
    private CustomerService customerService;

    // Done: metod0 - GET para indicar pagina que lista todos os clientes
    @GetMapping
    public String getCustomersView(Model model){
        model.addAttribute("customers", customerService.allCustomers());
        return "customers/list";
    }

    // Done: métod0 GET - para indicar pagina com formulário para criar novo cliente
    @GetMapping("/create")
    public String createCustomerForm(Model model){
        model.addAttribute("customer", new Customer());
        return "customers/create";
    }


    // Done: metod0 POST - para salvar um novoi cliente a partir do formulario
    @PostMapping("/create")
    public String createCustomerView(@ModelAttribute Customer customer){
        customerService.createCustomer(customer);
        return "redirect:/view/customers";
    }

}
