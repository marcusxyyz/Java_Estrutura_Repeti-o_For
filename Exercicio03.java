package exercicios_estrutura_repeticao_for;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many tests will it be? ");
		int quantityTests = sc.nextInt();
		
		double averageExams = 0;
		for (int i = 0; i < quantityTests; i++) {
			System.out.print("First Exam: ");
			double firstExam = sc.nextDouble();
			System.out.print("Second Exam: ");
			double secondExam = sc.nextDouble();
			System.out.print("Third Exam: ");
			double thridExam = sc.nextDouble();
			
			averageExams = (firstExam * 2.0 + secondExam * 3.0 + thridExam * 5.0) / 10.0;
			System.out.printf("AVERAGE = %.1f%n", averageExams);
			System.out.println();
		}
		
		
		sc.close();
	}

}
