package programs;


/** Foi preciso apenas chamar duas bibliotecas **/
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import classes.Employee2Class;

public class Employee2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee2Class> list = new ArrayList<>(); // Criar a lista baseada na minha classe

		System.out.print("How many employees will be registered? ");
		int registereds = sc.nextInt();

		System.out.println();
		for (int i = 0; i < registereds; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			System.out.println("-------------------");
		
			list.add(new Employee2Class(id, name, salary)); // Adicionar os atributos na minha classe
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id2 = sc.nextInt();
			
		/** Aqui será necessário fazer o foreach para ler todos os IDs que foram inseridos pelo usuário **/
		/** Em seguida, criar a condição para comparar os IDs que foram lidos com o id2 **/
		for (Employee2Class employees : list) {
			if (employees.getId() == id2) {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextInt();
				
				employees.Percentage(percentage); // Isso aqui é a fórmula da porcentagem. Método criado lá na classe
			}
			else {
				System.out.println("This ID doesn't exist!\n");
			}
			System.out.printf(employees.getId() + ", " + employees.getName() + ", %.2f%n", employees.getSalary());
		}
			
		sc.close();
	}
}
