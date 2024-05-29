package com.example.instance;

public class Eu {

    private static Eu instance = null;
    private Integer idade = null;
    private String nome = null;
    private String sentimento = null;
    private Boolean satisfeito = null;

    private Eu() {}

    public static Eu getInstance(String nome) {
        if (instance == null) {
            instance = new Eu();
            instance.idade = 0;
            instance.nome = nome;
            instance.sentimento = "FOME";
            instance.satisfeito = false;
            System.out.println("Estou nascendo! Me chamo " + instance.nome + " e estou sentindo " + instance.sentimento + "!");
            return instance;
        }
        System.out.println("Meu nome é: " + instance.nome + " e já existo!");
        return instance;
    }

    public void meApresentar() {
        System.out.println("Meu nome é: " + this.nome + " e tenho " + this.idade + " anos!");
    }

    public void falar(String fala) {
        System.out.println("Estou falando: " + fala + "!");
    }

    public void comer() {
        if (this.satisfeito) {
            System.out.println("Estou satisfeito! Não quero comer!");
        } else {
            this.satisfeito = true;
            this.sentimento = "FELIZ";
            System.out.println("Estou comendo! Estou me sentindo " + this.sentimento + "!");
        }
    }

    public void fazerAcao(String acao) {
        System.out.println("Estou fazendo " + acao + "!");
        this.sentimento = "CANSADO";
    }

    public void dormir(){
        if (this.sentimento.equals("CANSADO")) {
            this.sentimento = "DESCANSADO";
            System.out.println("Estou dormindo! Estou me sentindo " + this.sentimento + "!");
        } else {
            System.out.println("Não estou cansado! Não quero dormir!");
        }
    }

    public void sentir(String sentimento) {
        this.sentimento = sentimento;
        System.out.println("Estou sentindo " + this.sentimento + "!");
    }

    public void fazerAniversario() {
        this.idade++;
        if (this.idade < 50){
            this.sentimento = "FELIZ";
        } else {
            this.sentimento = "VELHO";
        }
        System.out.println("Estou mais velho! Fiz " + this.idade + " anos! Estou me sentindo " + this.sentimento + "!");
    }

}
