package com.example.lab3.pessoa;

import com.example.lab3.bolsa.Bolsa;

import java.util.Date;

public record PessoaResponseDTO (
    Long cpf,
    String nome,
    Long telefone,
    Integer idade) {

    public PessoaResponseDTO(Pessoa pessoa) {
            this(
                    pessoa.getCpf(),
                    pessoa.getNome(),
                    pessoa.getTelefone(),
                    pessoa.getIdade()
            );
        }
}
