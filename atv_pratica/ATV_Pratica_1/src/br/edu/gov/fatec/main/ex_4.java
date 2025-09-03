package br.edu.gov.fatec.main;
import java.util.Scanner;

public class ex_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = scan.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i) );
		}
		scan.close();
	}

}
