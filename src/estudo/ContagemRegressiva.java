package estudo;

import java.util.Scanner;

public class ContagemRegressiva {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número para começar a contagem regressiva: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int soma = n - i;
			System.out.println(soma);
		}
		
		System.out.println("Contagem regressiva finalizada!");
		
		
		sc.close();
	}
}
