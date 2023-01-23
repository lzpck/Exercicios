package tech.devinhouse.copadomundo.web;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SelecaoResponse {

    private String sigla;
    private String nome;
    private String grupo;
    private LocalDateTime dataCadastro;

}
