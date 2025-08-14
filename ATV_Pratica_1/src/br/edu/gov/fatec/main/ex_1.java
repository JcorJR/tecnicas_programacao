package br.edu.gov.fatec.main;
import java.util.Scanner;

public class ex_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = scan.nextInt();
		
		if(num < 0) {
			System.out.println("Esse numero é negativo");
		}else {
			System.out.println("Esse numero é positivo");
		}
		
		scan.close();
	}

}
