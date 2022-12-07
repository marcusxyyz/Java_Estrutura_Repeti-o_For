package exercicios_estrutura_repeticao_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many pairs will be entered: ");
		int quantityPairs = sc.nextInt();
		
		double division = 0;
		for (int i=0; i < quantityPairs; i++) {
			System.out.print("First: ");
			double first = sc.nextInt();
			System.out.print("Second: ");
			double second = sc.nextInt();
			
			if (second == 0) {
				System.out.println("No division by zero.");
			}
			else {
				division = first / second;
				System.out.println("Division " + division);
			}
		}
		
		sc.close();
	}

}
