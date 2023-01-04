package programs;

import java.util.Locale;
import java.util.Scanner;
import classes.ApprovedClass;

/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram 
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir 
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou 
igual a 6.0 (seis). 
*/

public class Approved {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.print("How many student do you want to know? ");
		int moments = sc.nextInt();
		ApprovedClass moment[] = new ApprovedClass[moments];
		
		String aproved = "";
		
		for (int i=0; i<moment.length; i++) {
			System.out.println("Tell us the name, first and second avaliation from " + (i+1) + " student");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("1st Semester: ");
			double semester1 = sc.nextDouble();
			System.out.print("2nd Semester: ");
			double semester2 = sc.nextDouble();
			
			System.out.println();
			moment[i] = new ApprovedClass(name, semester1, semester2);	
			
			moment[i].Average(); // Fórmula da Média Aritmética
			
			if (moment[i].Average() >= 6.0) {
				aproved += moment[i].getName() + "\n";
			}
		}
		
		System.out.println("Aproved students:\n" + aproved);
		sc.close();
	}
}
