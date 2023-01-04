package programs;

import java.util.Locale;
import java.util.Scanner;

import classes.OlderClass;

/*
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes 
 * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome 
 * da pessoa mais velha. 
 */

public class Older {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people do you want to know? ");
		int moments = sc.nextInt();
		OlderClass moment[] = new OlderClass[moments];	
		
		for (int i=0; i<moment.length; i++) {
			System.out.println("Data from " + (i + 1) + " person.");
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Age: ");
			int age = sc.nextInt();
			
			System.out.println();
			
			moment[i] = new OlderClass(name, age);			
		}

		int older = 0;
		older = moment[0].getAge();
		
		String olderPerson = "";
		olderPerson = moment[0].getName();
		
		for (int i=0; i<moment.length; i++) {	
			if (moment[i].getAge() > older) {
				older = moment[i].getAge();
				olderPerson = moment[i].getName();
			}
		}
		
		System.out.print("OLDEST PERSON: ");
		System.out.print(olderPerson);
		sc.close();
	}
}
