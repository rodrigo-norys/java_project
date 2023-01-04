package programs;

import java.util.Locale;
import java.util.Scanner;
import classes.PersonalDataClass;

/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa 
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número 
de homens. 
*/

public class PersonalData {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people do you want to know? ");
		int moments = sc.nextInt();
		PersonalDataClass moment[] = new PersonalDataClass [moments];
		
		double higher = 0.0;
		double smaller = 10000.0;
		double femaleHeight = 0.0;
		double countFemaleHeight = 0.0;
		int countMaleHeight = 0;
		
		for (int i=0; i<moment.length; i++) {
			System.out.print("Height of " + (i+1) + " person: ");
			double height = sc.nextDouble();
			System.out.print("Gender of " + (i+1) + " person: ");
			char gender = sc.next().charAt(0);
			System.out.println();
			
			moment[i] = new PersonalDataClass(height, gender);
			
			// Condição para saber o maior
			if (moment[i].getHeight() > higher) {
				higher = moment[i].getHeight();
			}
			
			// Condição para saber o menor
			if (moment[i].getHeight() < smaller && moment[i].getHeight() < 10000.0){
				smaller = moment[i].getHeight();
			}
			
			// Condição para média da altura das mulheres
			if (moment[i].getGender() == 'f' || moment[i].getGender() == 'F') {
				countFemaleHeight += 1;
				
				femaleHeight += moment[i].getHeight();
				femaleHeight = femaleHeight / countFemaleHeight;
			}
			
			// Condição para calcular a quantidade de homens
			if (moment[i].getGender() == 'm' || moment[i].getGender() == 'M') {
				countMaleHeight += 1;
			}
			
		}
		sc.close();
		System.out.println("A maior altura é: " + higher + "\nA menor altura é: " + smaller + "\nA média da altura das mulheres é: " + femaleHeight + "\nO número de homens é: " + countMaleHeight);
	}
}
