package br.edu.gov.fatec.main;
import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Insira o primeiro numero: ");
		int num1 = scan.nextInt();
		
		System.out.print("Insira o segundo numero: ");
		int num2 = scan.nextInt();
		
		if(num1 == num2) {
			System.out.println("Os numeros são iguais ");
		}else if(num1 > num2) {
			System.out.print("O primeiro numero é maior que o segundo ");
		}else {
			System.out.print("O segundo numero é maior que o primeiro");
		}
		
		scan.close();
	}

}
