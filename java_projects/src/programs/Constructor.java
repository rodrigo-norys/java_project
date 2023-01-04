package programs;

import java.util.Locale;
import java.util.Scanner;
import classes.ConstructorClass;

public class Constructor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");	
		String name = sc.nextLine(); // Variável temporária.
		
		System.out.print("Price: ");
		double price = sc.nextDouble(); // Variável temporária.
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt(); // Variável temporária.
		
/* Aqui o Construtor segue na sua função de nos obrigar a utilizar todos os atributos do objeto.
 * Do contrário, um erro seria retornado no programa.
 */
		ConstructorClass constructorClass = new ConstructorClass(name, price, quantity);
		System.out.println();
		
		System.out.println("Product data: " + constructorClass);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		constructorClass.addProducts(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + constructorClass);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		constructorClass.removeProducts(quantity);
		System.out.println();
		
		System.out.println("Updated data: " + constructorClass);
		sc.close();
	}
}