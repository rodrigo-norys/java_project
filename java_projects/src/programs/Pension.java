package programs;

import java.util.Locale;
import java.util.Scanner;

import classes.PensionClass;

public class Pension {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int moments = sc.nextInt();	
		PensionClass[] moment = new PensionClass[10];

		for (int i = 1; i <= moments; i++) {
			System.out.println();
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("E-mail: ");
			String email = sc.next();

			System.out.print("Room: ");
			int room = sc.nextInt(); // Como os quartos vão ser as posições dos vetores, não precisamos atribui lo na
										// classe

			moment[room] = new PensionClass(name, email); // Instanciando a variável room como posição
		}

		for (int i = 0; i < 10; i++) {
			if (moment[i] != null) {
				System.out.println();
				System.out.print(i + ":" + moment[i].getName() + ", " + moment[i].getEmail());
			}
		}
		sc.close();
	}
}

/**
 * int [] array = new int [] {x}; //invoking sort() method of the Arrays class
 * Arrays.sort(array); System.out.println("Elements of array sorted in ascending
 * order: "); //prints array using the for loop for (int j = 0; j <
 * array.length; j++) { System.out.println(array[j]); }
 **/