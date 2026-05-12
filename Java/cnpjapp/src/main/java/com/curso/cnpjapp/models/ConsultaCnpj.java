package com.curso.cnpjapp.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


// Fixme - Erro: Anottations lombok abaixo e import de lombok.*

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ConsultaCnpj {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // FIXME - Utiliza-se long pela quantidade de cartacteres permitidos.
    private Long id;

    // Fixme - Não há annotations do JPA pois não desejamos mudar os nomes das colunas
    private String cnpj;

    // Fixme - Não há annotations do JPA pois não desejamos mudar os nomes das colunas
    private String razaoSocial;

    // Fixme - Não há annotations do JPA pois não desejamos mudar os nomes das colunas
    private String statusConsulta;

    // Fixme - Não há annotations do JPA pois não desejamos mudar os nomes das colunas
    private LocalDateTime dataConsulta;
}