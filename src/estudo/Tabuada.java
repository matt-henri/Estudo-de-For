package estudo;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro para ver a Tabuada: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < 11; i++) {
			int soma = n * i;
			System.out.println(n + " x " + i + " = " + soma);
		}
		
		
		
		sc.close();
	}
}
