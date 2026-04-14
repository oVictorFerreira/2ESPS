package com.challenge.cp5.services;

import com.challenge.cp5.models.FeriadoDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class FeriadoService {

    private final RestClient restClient;

    public FeriadoService(RestClient restClient) {
        this.restClient = restClient;
    }


    public List<FeriadoDTO> buscarPorAno(Integer ano) {
        return restClient.get()
                .uri("/{ano}", ano)
                .retrieve()
                .body(new ParameterizedTypeReference<List<FeriadoDTO>>() {});
    }
}