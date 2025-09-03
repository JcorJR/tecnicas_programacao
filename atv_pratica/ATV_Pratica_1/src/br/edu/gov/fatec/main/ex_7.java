package br.edu.gov.fatec.main;
import java.util.Scanner;

public class ex_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int num = scan.nextInt();
		
		if(num < 18) {
			System.out.println("Menor de idade!");
		}else if(num < 60) {
			System.out.println("VELHO!");
		}else {
			System.out.println("Adulto!");
		}
		scan.close();
	}

}
