package br.edu.fatecpg.restaurante.view;

import br.edu.fatecpg.restaurante.model.Pedido;
import br.edu.fatecpg.restaurante.model.Restaurante;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        Pedido p1 = new Pedido(1);
        Pedido p2 = new Pedido(2);

        restaurante.reservar(p1, 9);
        restaurante.reservar(p2, 9);

        restaurante.exibirPedidos();
    }
}

