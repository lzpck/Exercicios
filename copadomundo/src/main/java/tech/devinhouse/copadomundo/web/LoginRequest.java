package tech.devinhouse.copadomundo.web;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginRequest {

    @NotEmpty(message = "campo.obrigatorio")
    private String email;

    @NotEmpty(message = "campo.obrigatorio")
    private String senha;

}
