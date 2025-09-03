package br.edu.fatecpg.treinamento.model;

public class TreinamentoOnline extends Treinamento{
    private String acessoLink;
    public TreinamentoOnline(int id, String nomeInstrutor, String liguagemEnsinada, String acessoLink) {
        super(id, nomeInstrutor, liguagemEnsinada);
        this.acessoLink = acessoLink;
    }

    @Override
    public String toString() {
        return super.toString() + "link de acesso: " + acessoLink;
    }
}
