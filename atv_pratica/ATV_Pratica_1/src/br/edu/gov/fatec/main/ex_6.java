package br.edu.gov.fatec.main;
import java.util.Scanner;

public class ex_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = scan.nextInt();
		
		if(num < 0) {
			System.out.println("Um fatorial não pode ser de um numero negativo!");
		}else {
			long fatorial = 1;
			for(int i = 1; i <= num; i++) {
				
				fatorial *= num;
			}
			
			System.out.println("Fatorial de " + num + " é: " + fatorial);
		}
		scan.close();
		
	}

}
