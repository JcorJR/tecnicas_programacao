package br.edu.gov.fatec.main;
import java.util.Scanner;

public class ex_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[5];

        System.out.println("Digite 5 nomes:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scan.nextLine();
        }

        System.out.print("Digite mais um nome para verificar se já foi inserido: ");
        String busca = scan.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < 5; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome '" + busca + "' já foi inserido.");
        } else {
            System.out.println("O nome '" + busca + "' não está na lista.");
        }

        scan.close();
    }
}

