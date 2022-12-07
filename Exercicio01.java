package exercicios_estrutura_repeticao_for;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int number = sc.nextInt();
		
		for (int i = 0; i <= number; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
