package exercicios_estrutura_repeticao_for;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int number = sc.nextInt();
		
		int factorialNumber = 1;
		for (int i = number; i > 0; i--) {
			factorialNumber *= i;
		}
		
		System.out.println(factorialNumber);
		
		sc.close();
	}

}
