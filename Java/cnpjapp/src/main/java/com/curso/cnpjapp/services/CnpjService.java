package com.curso.cnpjapp.services;

import com.curso.cnpjapp.models.ConsultaCnpj;
import com.curso.cnpjapp.models.EmpresaDTO;
import com.curso.cnpjapp.repositories.ConsultaCnpjRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.time.LocalDateTime;

//Fixme - Não há imports no cnpjservice
@Service
public class CnpjService {

    @Autowired
    private ConsultaCnpjRepository repository;

    private final RestClient restClient = RestClient.builder()
            .baseUrl("https://minhareceita.org")
            .build();

    public EmpresaDTO consultar(String cnpj) {

        EmpresaDTO empresa = null;

        try {

            empresa = restClient
                    .get()
                    .uri("/{cnpj}", cnpj)
                    .retrieve()
                    .body(EmpresaDTO.class);

            salvarConsulta(
                    cnpj,
                    empresa.razao_social(),
                    "CNPJ Ativo"
            );

        } catch (Exception e) {

        }

        System.out.println(empresa);

        return empresa;
    }

    private void salvarConsulta(String cnpj,
                                String razaoSocial,
                                String status) {

        // Fixme - Fluent api - CnpjService
        ConsultaCnpj consulta = ConsultaCnpj.builder()
                .cnpj(cnpj)
                .razaoSocial(razaoSocial)
                .statusConsulta(status)
                .dataConsulta(LocalDateTime.now())
                .build();

        repository.save(consulta);
    }
}