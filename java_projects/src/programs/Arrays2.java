package programs;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Número de linhas
		System.out.print("Input the number of lines: ");
		int line = sc.nextInt();
		
		// Número de colunas
		System.out.print("Input the number of columns: ");
		int column = sc.nextInt();
		
		System.out.println();

		// Informar os valores de cada posição da matriz
		System.out.println("Input the values for each array position:");
		Integer[][] matrix = new Integer[line][column];
		
		// Estrutura para ler cada posição da matriz
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println();

		// Informar um dos valores da matriz
		System.out.print("Input one of the matrix numbers: ");
		int matrixNumber = sc.nextInt();
		
		// Contador criado somente CASO o matrixNumber não exista dentro da matriz
		int count = 0;

		// Estrutura para ler novamente cada posição da matriz, com o adicional
		// Da condição para nos trazer as informações que precisamos
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				
				// Se matrixNumber for igual a um dos valores dentro da matrix[i][j]...
				if (matrixNumber == matrix[i][j]) {
					
					// Retorna a posição do matrixNumber
					System.out.println("Position: (" + i + "," + j + ")");
					
					// Retorna o valor a esquerda se existir
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j - 1]);			
					}
					
					// Retorna o valor acima se existir 
					if (i > 0) {
						System.out.println("Up: " + matrix[i - 1][j]);				
					}
					
					// Retorna o valor a direita se existir
					if (j < matrix[i].length - 1) {
						System.out.println("Right: " + matrix[i][j + 1]);				
					}
					
					// Retorna o valor abaixo se existir
					if (i < matrix.length - 1) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}
					count++;
				}
			}
		}
		
		// Para count == 0, nos trará o valor da condição caso seja falsa
		if (count == 0) {
			System.out.println("This value isn't inside of array!");
		}
		sc.close();
	}
}
