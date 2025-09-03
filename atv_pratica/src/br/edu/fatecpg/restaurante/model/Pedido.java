package br.edu.fatecpg.restaurante.model;
import java.util.ArrayList;

public class Pedido {
    private int numero;
    private int numMesa;
    private ArrayList<ItemPedido> itens;

    public Pedido(int numero) {
        this.numero = numero;
        this.itens = new ArrayList<>();
    }

    public void addPedido(ItemPedido item){
        itens.add(item);
    }

    public void remPedido(ItemPedido item){
        itens.remove(item);
    }

    public void reservarMesa(int numMesa){
        this.numMesa = numMesa;
    }

    public double calTotalPedido (){
        double total = 0;
        for(ItemPedido item : itens){
            total += item.calcularSubTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido #" + numero + " - mesa " + numMesa + " - Total: R$ " + calTotalPedido();
    }
}
