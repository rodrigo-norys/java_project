package programs;

import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, 
 * mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos 
 * os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 
 */

public class BelowAverage {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type the quantity of number that you want to know: ");
		int moments = sc.nextInt();
		double moment[] = new double[moments];
		
		double sum = 0.0;
		double media = 0.0;
		
		System.out.println();
		for (int i=0; i<moment.length; i++) {
			System.out.print("Type a number: ");
			moment[i] = sc.nextDouble();
			
			sum += moment[i];
			media = sum / moment.length;
		}
		
		System.out.println();
		System.out.printf("AVERAGE FROM VECTOR: %.3f", media);
		System.out.println("");
		
		System.out.println("NUMBERS BELOW AVERAGE!");
		for (int i=0; i<moment.length; i++) {
			if (moment[i] < media) {
				System.out.printf("%.1f\n", moment[i]);
			}
		}
		
		sc.close();
	}
}
