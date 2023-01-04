package programs;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o número de linhas: ");
		int line = sc.nextInt();

		System.out.print("Informe o número de colunas: ");
		int column = sc.nextInt();

		Integer[][] matrix = new Integer[line][column];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println();

		System.out.print("Informe um dos números da matriz: ");
		int matrixNumber = sc.nextInt();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == matrixNumber) {
					System.out.println("Position: (" + i + "," + j + ")");
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matrix[i - 1][j]);
					}
					if (j < matrix[i].length - 1) {
						System.out.println("Right: " + matrix[i][j + 1]);
					}
					if (i < matrix.length - 1) {
						System.out.println("Down: " + matrix[i + 1][j]);
					}
					System.out.println();
				}
			}
		}
		sc.close();
	}
}
