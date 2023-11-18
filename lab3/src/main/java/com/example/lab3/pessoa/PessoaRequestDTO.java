package com.example.lab3.pessoa;

public record PessoaRequestDTO (
        Long cpf,
        String nome,
        Long telefone,
        Integer idade
) {
}
