package estudo;

import java.util.Scanner;

public class Fatorial {

		public static long calculoFatorial(int numero) {
			if (numero == 0 || numero == 1) {
				return 1;
			} else {
				return numero * calculoFatorial(numero-1);
			}
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite um número inteiro não negativo: ");
			int numero = sc.nextInt();
			
			if (numero < 0) {
				System.out.println("Número inválido. Digite um número não negativo:");
			} else {
				long resultado = calculoFatorial(numero);
				System.out.println("O Fatorial de " + numero + " é: " + resultado);
			}
			
			
			
			sc.close();
		}
		


}
