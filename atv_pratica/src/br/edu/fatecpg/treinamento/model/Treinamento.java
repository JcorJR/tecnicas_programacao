package br.edu.fatecpg.treinamento.model;

import br.edu.fatecpg.restaurante.model.ItemPedido;

import java.util.ArrayList;

public class Treinamento {
    private int id;
    private String nomeInstrutor;
    private String liguagemEnsinada;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos;

    public Treinamento(int id, String nomeInstrutor, String liguagemEnsinada) {
        this.id = id;
        this.nomeInstrutor = nomeInstrutor;
        this.liguagemEnsinada = liguagemEnsinada;
        this.alunos = new ArrayList<>();
    }

    public boolean verificarDisponibilidade(){
            return nomeInstrutor  != null && !nomeInstrutor.isEmpty();
    }

    public void definirCargaHr(int horas){
        if(horas >= 4 && horas <= 80) {
            horas += cargaHoraria;
            System.out.println("Carga adicionada com sucesso");
        }else{
            System.out.println("Carga invalida!");
        }
    }

    public boolean verificarUltTreinamento (Aluno a){
        return true;
    }

    public void calcularMediaAlunos(){
        if(alunos.isEmpty()){
            System.out.println("Não a alunos");
        }
        double soma = 0;
        for(Aluno a : alunos){
            soma += a.getNotaFinal();
        }
        System.out.println("Media dos alunos: " + soma / alunos.size());
    }

    public void addAluno(Aluno a){
        alunos.add(a);
    }

    public void remAluno(Aluno a){
        alunos.remove(a);
    }

    @Override
    public String toString() {
        return "Treinamento ID: " + id + " - " + "Nome do instrutor: " + nomeInstrutor + " - " + "Linguagem Ensinada: " + liguagemEnsinada + " - " + "Carga Horaria: " + cargaHoraria + "h";
    }
}
