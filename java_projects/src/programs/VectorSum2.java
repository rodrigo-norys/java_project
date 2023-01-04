package programs;

import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um 
 * terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima 
 * o vetor C gerado. 
 */

public class VectorSum2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		// Lógica para somar as mesmas posições de 2 arrays diferentes.
		System.out.print("How many value do you want to put per Vector? ");
		int moments = sc.nextInt();
		int momentA[] = new int[moments];
		int momentB[] = new int[moments];
		int result = 0;
		
		System.out.println();
		System.out.println("Type the values from Vector A!");
		for (int i=0; i<momentA.length; i++) {
			momentA[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Type the values from Vector B!");
		for (int i=0; i<momentB.length; i++) {
			momentB[i] = sc.nextInt();	
		}

		System.out.println();
		System.out.println("RESULT VECTOR!");
		for (int i=0; i<moments; i++) {
			result = momentA[i] + momentB[i];
			System.out.print(result + "\n");
		}		
	
		sc.close();
	}
}
