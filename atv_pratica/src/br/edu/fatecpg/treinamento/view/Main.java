package br.edu.fatecpg.treinamento.view;

import br.edu.fatecpg.treinamento.model.Aluno;
import br.edu.fatecpg.treinamento.model.Treinamento;
import br.edu.fatecpg.treinamento.model.TreinamentoOnline;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Zéca",10);
        Aluno b = new Aluno("Zé",2);

        TreinamentoOnline to = new TreinamentoOnline(255,"Arqueduque Frans Ferdinand","CYTHON", "HTTPS://escolarealsoaceitapix");

        to.addAluno(a);
        to.addAluno(b);
        to.calcularMediaAlunos();
    }
}
