package br.edu.gov.fatec.main;
import java.util.Scanner;
public class ex_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 - Calcular a área do quadrado");
		System.out.println("2 - Calcular a área do circulo");
		System.out.println();
		int num = scan.nextInt();
		
		if(num == 1) {
			double A;
			
			System.out.println("Insira o valor de l1: ");
			double l1 = scan.nextDouble();
			
			System.out.println("Insira o valor de l2: ");
			double l2 = scan.nextDouble();
				
			System.out.println("A área do quadrado é: " + (A = l1 * l2));
		
		}else if(num == 2) {
			double A;
			
			System.out.print("Insira o valor do raio: ");
			double r = scan.nextDouble();
			
			System.out.println("A área do quadrado é: " + (A = 3.14 * r));
		}else {
			
		}
		
		scan.close();

	}

}
