package programs;

import java.util.Locale;
import java.util.Scanner;
import classes.HeightClass;

/*
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
 * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
 * bem como os nomes dessas pessoas caso houver. 
 */

public class Height {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people do you want to know about? ");
		int moments = sc.nextInt();
		HeightClass vect [] = new HeightClass[moments];
		
		double sum = 0.0;
		double average = 0.0;
		int below16 = 0;
		double percentage = 0.0;
		String peopleBelow16 = ""; // <-- I Wild possible gambiarra appears. Depois de muito tempo pensando, foi a forma que achei pra não repetir o mesmo for 2x.
		
		// 'for' para nos trazer as informações da quantidade de pessoas 'moments'.
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Data from " + (i + 1) + " person:");
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Age: ");
			int age = sc.nextInt();
			
			System.out.print("Height: ");
			double height = sc.nextDouble();
			System.out.println();
			
			vect[i] = new HeightClass(name, age, height);		
		}
		
		// Apenas separei esta outra parte em outro 'for', afim de deixar o código um pouco mais limpo.
		for (int i = 0; i < vect.length; i++) {
			// Esse 'if' verifica a quantidade de pessoas menores de 16 anos e nos traz também os nomes.			
			if (vect[i].getAge() < 16) {
				below16 += 1;		
				peopleBelow16 += "\n" + vect[i].getName();
				  
			}
			
			// Fórmulas da soma, média e porcentagem.
			sum += vect[i].getHeight();
			average = sum / vect.length;
			percentage = (below16 * 100.0 / vect.length);
		}

		System.out.printf("Average height: %.2fm", average);
		System.out.printf("\nPeople below 16 years: %.0f%%", percentage);
		System.out.println(peopleBelow16);
		sc.close();
	}
}
