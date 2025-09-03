package br.edu.fatecpg.passagem.view;

import br.edu.fatecpg.passagem.model.Aeroporto;
import br.edu.fatecpg.passagem.model.Voo;

public class Main {
    public static void main(String[] args) {


        Aeroporto aeroporto = new Aeroporto();

        Voo v1 = new Voo("BT557", "Porto Alegre", "Salvador", 6);
        Voo v2 = new Voo("AT358", "São Paulo", "Rio de Janeiro", 3);

        aeroporto.addVoo(v1);
        aeroporto.addVoo(v2);

        aeroporto.exibirVoos();
    }
}
