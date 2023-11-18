package com.example.lab3.pessoa;

import com.example.lab3.bolsa.BolsaRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "pessoa")
@Entity(name = "pessoa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "cpf")
public class Pessoa {
    @Id
    @Column(name = "cpf", nullable = false)
    private Long cpf;

    @Column(name = "nome", length = 80, nullable = false)
    private String nome;

    @Column(name = "telefone", nullable = false)
    private Long telefone;

    @Column(name = "idade", nullable = false)
    private Integer idade;

    public Pessoa(PessoaRequestDTO data){
        this.cpf = data.cpf();
        this.nome = data.nome();
        this.telefone = data.telefone();
        this.idade = data.idade();
    }
}
