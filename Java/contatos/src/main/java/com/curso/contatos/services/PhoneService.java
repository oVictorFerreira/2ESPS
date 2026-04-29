package com.curso.contatos.services;

import com.curso.contatos.models.Phone;
import com.curso.contatos.repos.PhoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneService {
    // Injeçao DP
    @Autowired
    private PhoneRepo phoneRepo;

    //Metodo para criar um novo registro
    public Phone insertPhone(Phone newPhone) {
        try{
            phoneRepo.save(newPhone);
            System.out.println("Criado com sucesso");
            System.out.println(newPhone);
        }
        catch(Exception exception){
            System.out.println("Erro ao inserir phone");
            System.out.println(exception);
        }


        return newPhone;
    }
}
