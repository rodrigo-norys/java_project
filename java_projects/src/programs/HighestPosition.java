package programs;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
 * o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
 * considerando a primeira posição como 0 (zero). 
 */

public class HighestPosition {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many number do you want to show? ");
		int moments = sc.nextInt();
		int moment[] = new int [moments];	
		
		System.out.println();
		for (int i=0; i<moment.length; i++) {
			System.out.print("Type a number: ");
			moment[i] = sc.nextInt();	
		}
		
		// Lógica para encontrar o maior valor da posição e a posição de maior valor. 
		int biggestValue = moment[0];
		int biggestPosition = 0;	
		
		for (int i=0; i<moment.length; i++) {
			if (moment[i] > biggestValue) {
				biggestValue = moment[i];
				biggestPosition = i;
			}
		}
		
		System.out.println();
		System.out.print("BIGGEST VALUE = " + biggestValue + "\n");
		System.out.print("POSITION OF BIGGEST VALUE = " + biggestPosition);
		
		sc.close();
	}
}
