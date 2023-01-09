package programs;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Tamanho da matriz
		System.out.println("Set the array size!");
		int n = sc.nextInt();
		
		// Valores de cada posição da matriz
		System.out.println("Now, define the values of each position.");
		int[][] mat = new int[n][n];
		
		int count = 0;
		
		// Estrutura de repetição para ler cada posição da matriz
		// Para em seguida nos retornar a Diagonal Principal 
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				
				// Condição para ler e contabilizar os valores menores que zero
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.print("Main diagonal: ");

		// Estrutura para ler a Diagonal Principal
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}

		System.out.println();

		System.out.print("Negative numbers = " + count);
		sc.close();
	}
}
