package programs;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
 * tela todos os números pares, e também a quantidade de números pares. 
 */

public class Even {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers do you want to read? ");
		int moments = sc.nextInt();
		int moment[] = new int [moments];
		System.out.println();
		
		for (int i=0; i<moment.length; i++) {
			System.out.print("Type a number: ");
			moment[i] = sc.nextInt();
		}
		
		System.out.println();
		
		int count = 0;
		
		System.out.println("EVEN NUMBERS:");
		for (int i=0; i<moment.length; i++) {
			if (moment[i] % 2 == 0) {
				System.out.print(moment[i] + "  ");
				count += 1;
			}
		}
		System.out.print("\n\nEVEN QUANTITY: " + count);
		sc.close();
	}
}
