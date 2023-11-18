package com.example.lab3.bolsa;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Table(name = "bolsa")
@Entity(name = "bolsa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "codigo")

public class Bolsa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Long codigo;

    @Column(name = "cpf_pessoa")
    private Long cpf_pessoa;

    @Column(name = "tipo_sanguineo", length = 10, nullable = false)
    private String tipoSanguineo;

    @Column(name = "cidade", length = 100, nullable = false)
    private String cidade;

    @Column(name = "data_doacao", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataDoacao;

    @Column(name = "data_saida")
    @Temporal(TemporalType.DATE)
    private Date dataSaida;

    public Bolsa(BolsaRequestDTO data){
        this.cpf_pessoa = data.cpf_pessoa();
        this.tipoSanguineo = data.tipo_sanguineo();
        this.cidade = data.cidade();
        this.dataDoacao = data.data_doacao();
        this.dataSaida = data.data_saida();
    }
}
