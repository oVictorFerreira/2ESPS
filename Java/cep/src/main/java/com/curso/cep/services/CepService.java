package com.curso.cep.services;

import com.curso.cep.models.CepDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClient;

@Service
public class CepService {
    //Propriedades

    //Endereço que será utilizado no consumo

    private final String url = "https://viacep.com.br";

    // Criando um RestClient, responsável por conectar a API em um determinado URL
    private final RestClient restClient = RestClient.create(url);

    //Metod0 responsável por fazer um GET de um CEP na API ViaCEP
    public CepDTO getByCep(String cep){
        CepDTO register = null;
        try{
            // tentativa de preencher o DTO com dados da API
            register = restClient
                    .get() // Indicando o métod0 HTTP
                    .uri("https://viacep.com.br/ws/{cep}/json/", cep)//Indicando o recurso a ser utilizado
                    .retrieve()//Recuperando dados da resposta
                    .onStatus(HttpStatusCode::is4xxClientError, (request, response) -> {
                        throw new RuntimeException("Erro na requisição: " + response.getStatusCode());
                    }) // Caso aconteça um erro 400 (na requisição
                    .onStatus(HttpStatusCode::is5xxServerError, ((request, response) -> {
                        throw new RuntimeException("Erro na resposta do servidor: " + response.getStatusCode());
                    })) // Caso ocorra um erro 500 (do lado do servidor)
                    .body(CepDTO.class); //Trazendo o corpo encontrado para dentro do DTO

            System.out.println(register);
        }
        catch(Exception exception){
            System.out.println(exception);
        }
        return register;
    }
}
