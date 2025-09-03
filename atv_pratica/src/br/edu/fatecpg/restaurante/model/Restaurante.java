package br.edu.fatecpg.restaurante.model;

import java.util.ArrayList;

public class Restaurante {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Integer> mesaOcupada;

    public Restaurante (){
        pedidos = new ArrayList<>();
        mesaOcupada = new ArrayList<>();
    }

    public boolean reservar (Pedido pedido, int numMesa){
        if (mesaOcupada.contains(numMesa)) {
            System.out.println("A mesa "+numMesa+" já está ocupada");
            return false;
        }else {
            pedido.reservarMesa(numMesa);
            pedidos.add(pedido);
            mesaOcupada.add(numMesa);
            System.out.println("Mesa " + numMesa + " adicionada");
            return true;
        }
    }

    public void liberarmesa(int numMesa){
        mesaOcupada.remove(numMesa);
        System.out.println("Mesa removida");
    }

    public void exibirPedidos(){
        System.out.println("Lista de Pedidos");
        for (Pedido p : pedidos)    {
            System.out.println(p);
        }
    }
}
