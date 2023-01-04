package programs;

import java.util.Locale;
import java.util.Scanner;
/* 
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
 * - Imprimir todos os elementos do vetor 
 * - Mostrar na tela a soma e a média dos elementos do vetor 
*/

public class VectorSum {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers do you'll type? ");
		int moment = sc.nextInt();
		double moments[] = new double [moment];
		System.out.println();
		
		for (int i = 0; i < moments.length; i++) {
			System.out.print("Type a number: ");
			moments[i] = sc.nextDouble();
		}
		
		System.out.println("");
		
		double sum = 0.0;
		double average = 0.0;
		
		System.out.print("VALUES: ");
		for (int i = 0; i < moments.length; i++) {
			System.out.print(moments[i] + "  ");
			
			sum += moments[i];
			average = sum / moments.length;
		}
		System.out.println();
		System.out.print("SUM: " + sum + "\n");
		System.out.print("AVERAGE: " + average);
		
		sc.close();
	}
}