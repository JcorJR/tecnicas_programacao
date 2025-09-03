package br.edu.fatecpg.treinamento.model;

public class Aluno {
    private String nome;
    private double notaFinal;

    public Aluno (String nome, double notaFinal){
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }
}
