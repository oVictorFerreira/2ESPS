package com.curso.cep.models;

public record CepDTO(
        String cep,
        String logradouro,
        String bairro,
        String localidade,
        String uf
) {
}
