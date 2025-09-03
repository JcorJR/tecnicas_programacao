package br.edu.fatecpg.treinamento.model;

import java.util.ArrayList;

public class TreinamentoPresencial extends Treinamento {
    private String local;
    public TreinamentoPresencial(int id, String nomeInstrutor, String liguagemEnsinada, String local, int cargaHoraria, ArrayList<Aluno> alunos) {
        super(id, nomeInstrutor, liguagemEnsinada);
        this.local = local;
    }

    @Override
    public String toString() {
        return super.toString() + "Local: " + local;
    }
}
