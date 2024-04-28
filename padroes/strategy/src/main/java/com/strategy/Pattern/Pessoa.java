package com.strategy.Pattern;

import com.strategy.Pattern.Pergunta;

public class Pessoa implements Pergunta, Avaliacao{
    private Avaliacao avaliacao;
    private Pergunta pergunta;
    private String name;
    private int idade;

    public Pessoa(String name, int idade){
        this.name = name;
        this.idade = idade;
    }

    public Pessoa(){}

    public void setName(String name){
        this.name = name;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getName(){
        return this.name;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }

    public int getIdade(){
        return this.idade;
    }

    public void perguntar(String algo){
        pergunta.algo = algo;
        pergunta.perguntar();
    }

    public void aplicarAvaliacao(){
        avaliacao.avaliar();
    }

    public void fazerAvaliacao(){
        avaliacao.avaliar();
    }


    @Override
    public void avaliar() {
        System.out.println(this.idade);
    }
}
