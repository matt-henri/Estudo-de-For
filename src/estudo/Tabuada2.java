package estudo;

import java.util.Scanner;

public class Tabuada2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			System.out.println(i + " x " + n + " = " + (n * i));
		}
		
		
		
		
		
		sc.close();
	}
}
