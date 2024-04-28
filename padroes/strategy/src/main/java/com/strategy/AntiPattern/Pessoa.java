package com.strategy.AntiPattern;

public class Pessoa {
    private String name;
    private Integer idade;

    public void setName(String name){
        this.name = name;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public String getName(){
        return this.name;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public void perguntarAlgo(String algo){
        System.out.println("Perguntando " + algo);
    }

    public void aplicarAvaliacao(String materia){
        System.out.println("Aplicando avaliação de " + materia);
    }

    public void fazerAvaliacao(String materia){
        System.out.println("Fazendo avaliação de " + materia);
    }
}
