package programs;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média 
 * aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for 
 * digitado, mostrar a mensagem "NENHUM NUMERO PAR" 
 */

public class EvenNumbersAvrg {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers? ");
		int moments = sc.nextInt();
		double moment[] = new double[moments];
		
		double sum = 0.0;
		double average = 0.0;
		int count = 0;
		
		System.out.println();
		for (int i=0; i<moment.length; i++) {
			System.out.print("Type a number: ");
			moment[i] = sc.nextDouble();

			if (moment[i] % 2 == 0) {
				count += 1;
				sum += moment[i];
				average = sum / count;
			}
		}
		
		if (average != 0) {
			System.out.println("\nEVEN AVERAGE: " + average);	
		}
		else {
			System.out.println("\nANY EVEN NUMBER!");
		}
		sc.close();
	}
}
