package com.curso.cnpjapp.models;

// Fixme - DTO otimiza trasação de dados, permtindo transitar diversas informações a partir de um dado X
public record EmpresaDTO(
        String razao_social,
        String nome_fantasia,
        String cnpj
){}
