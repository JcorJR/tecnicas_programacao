package br.edu.gov.fatec.main;
import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String senha;

        do {
            System.out.print("Digite a senha: ");
            senha = scan.nextLine();

            if (!senha.equals("Java123")) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senha.equals("Java123"));

        scan.close();
    }
}
