package exercicios_estrutura_repeticao_for;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int in=0, out=0;
		
		System.out.print("How many numbers will be entered: ");
		int quantity = sc.nextInt();
		
		for (int i=0; i < quantity; i++) {
			System.out.print("Input Number: ");
			int entryNumber = sc.nextInt();
			
			if (entryNumber >= 10 && entryNumber <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		
		System.out.println(in + " In");
		System.out.println(out + " Out");
		
		sc.close();
	}

}
