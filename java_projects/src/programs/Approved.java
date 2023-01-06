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
		
		// Informar a quantidade de alunos
		System.out.print("How many student do you want to know? ");
		int students = sc.nextInt();
		
		// Vetor criado com o tipo 'ApprovedClass', para que consigamos acessar 
		// seus atributos e classes para cada aluno que definirmos
		ApprovedClass student[] = new ApprovedClass[students];
		
		// Variável criada para conseguir concatenar o nome dos alunos aprovados
		String aproved = "";
		
		for (int i=0; i<student.length; i++) {
			System.out.println("Tell us the name. After this, the first and second avaliation from " + (i+1) + " student");
			sc.nextLine();
			
			// Informar o nome
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			// Informar a média do 1º semestre
			System.out.print("1st Semester: ");
			double semester1 = sc.nextDouble();
			
			// Informar a média do 2º semestre
			System.out.print("2nd Semester: ");
			double semester2 = sc.nextDouble();
			
			System.out.println();
			
			// Construtor nos dando a segurança de que cada dado do aluno será informado
			student[i] = new ApprovedClass(name, semester1, semester2);	
			
			// Método da fórmula da média aritmética
			student[i].Average();
			
			// Condição que verifica a média do aluno e sendo verdadeira
			// Nos retorna os nomes dos alunos aprovados
			if (student[i].Average() >= 6.0) {
				aproved += student[i].getName() + "\n";
			}
		}
		
		System.out.println("Aproved students:\n" + aproved);
		sc.close();
	}
}
