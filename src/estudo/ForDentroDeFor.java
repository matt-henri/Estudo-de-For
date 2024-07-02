package estudo;

import java.util.Scanner;

public class ForDentroDeFor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		
		for (int linha = 1; linha <= 5; linha++) {
			for( int coluna = 1; coluna <= linha; coluna++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		sc.close();
	}
}
