package br.edu.gov.fatec.main;
import java.util.Scanner;

public class ex_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Digite um numero: ");
		int num = scan.nextInt();
		int soma = 0;
		int impar = 1;
		
		for(int i = 0; i <= num; i++) {
			soma += impar;
			impar += 2;
		}
		
		 System.out.println("A soma dos primeiros " + num + " números ímpares é: " + soma);
	     scan.close();
		
	}

}

