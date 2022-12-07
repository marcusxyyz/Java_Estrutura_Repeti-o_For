package exercicios_estrutura_repeticao_for;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
			System.out.println(i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3));
		}
		
		
		sc.close();
	}

}
