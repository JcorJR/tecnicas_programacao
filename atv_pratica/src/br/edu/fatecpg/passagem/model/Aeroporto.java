package br.edu.fatecpg.passagem.model;

import br.edu.fatecpg.restaurante.model.ItemPedido;
import br.edu.fatecpg.restaurante.model.Pedido;

import java.util.ArrayList;

public class Aeroporto {
    private ArrayList<Voo> voos;

    public Aeroporto() {
        voos = new ArrayList<>();
    }

    public void addVoo(Voo v){
        voos.add(v);
    }

    public void remVoo(Voo v){
        voos.remove(v);
    }

    public Voo buscarVoo (String numero){
        for (Voo v : voos){
            if(v.toString().contains(numero)){
                return v;
            }
        }
        return null;
    }

    public void exibirVoos(){
        System.out.println("Lista de Pedidos");
        for (Voo v : voos)    {
            System.out.println(v);
        }
    }
}
