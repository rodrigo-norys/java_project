package programs;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
 * e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
*/

public class Negatives {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers do you want to type? " );
		int moment = sc.nextInt();
		int moments[] = new int[moment];
		System.out.println();
		
		for (int i = 0; i < moments.length; i++) {
			
			System.out.print("Type a number: ");
			moments[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NÚMEROS NEGATIVOS");

		for (int i = 0; i < moments.length; i++) {
			
			if (moments[i] < 0) {
				System.out.println(moments[i]);
			}

		}
		sc.close();
	}
}
