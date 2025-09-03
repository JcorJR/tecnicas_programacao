package br.edu.fatecpg.restaurante.model;

public class ItemPedido {
    private String nomePrato;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String nomePrato, int quantidade, double precoUnitario) {
        this.nomePrato = nomePrato;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularSubTotal(){
        return quantidade * precoUnitario;
    }

    @Override
    public String toString() {
        return nomePrato + " x" + quantidade + " - R$" + precoUnitario;
    }
}
