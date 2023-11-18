package com.example.lab3.bolsa;

import java.util.Date;

public record BolsaResponseDTO(
        Long Codigo,
        Long cpf,
        String tipo_sanguineo,
        String cidade,
        Date data_doacao,
        Date data_saida) {

    public BolsaResponseDTO(Bolsa bolsa) {
        this(
                bolsa.getCodigo(),
                bolsa.getCpf_pessoa(),
                bolsa.getTipoSanguineo(),
                bolsa.getCidade(),
                bolsa.getDataDoacao(),
                bolsa.getDataSaida()
        );
    }
}
