package com.curso.bankapi.controllers.view;

import com.curso.bankapi.models.Customer;
import com.curso.bankapi.services.AccountService;
import com.curso.bankapi.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Done: Indicação de controller visual + caminhos
@Controller
@RequestMapping("/view/accounts")
public class AccountViewController {
    //Done: Injeção DPS
    @Autowired
    AccountService accountService;

    @Autowired
    CustomerService customerService;

    // Done: Métod0 GET para indicar pagina que lista todas as contas
    @GetMapping
    public String getAllAccountsForm(Model model){
        model.addAttribute("accounts", accountService.allAccounts());
        return "accounts/list";
    }

    // Done: Métod0 GET para indicar pagina para criar nova conta

    @GetMapping("/create")
    public String createAccountForm(Model model){
        model.addAttribute("customers", customerService.allCustomers());
        return "accounts/create";
    }

    // Done: Métod0 POST para criar nova conta por CustomerId

    @PostMapping("/create")
    public String createAccountView(@RequestParam Integer customerId){
        accountService.createAccount(customerId);
        return "redirect:/view/accounts";
    }

}
