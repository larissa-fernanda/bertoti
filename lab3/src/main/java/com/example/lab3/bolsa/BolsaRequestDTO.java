package com.example.lab3.bolsa;

import java.util.Date;
public record BolsaRequestDTO(
        Long cpf_pessoa,
        String tipo_sanguineo,
        String cidade,
        Date data_doacao,
        Date data_saida
) {
}
