package br.edu.gov.fatec.main;
import java.util.Scanner;

public class ex_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("O numero é par");
		}else {
			System.out.println("O numero é impar");
		}
		
		scan.close();
	}

}
