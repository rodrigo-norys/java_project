package programs;

import java.util.Scanner;
import java.util.Locale;
import classes.ProductClass;

public class Product {
	public static void main(String[] args) {

		ProductClass productClass = new ProductClass();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data!");
		System.out.print("Name: ");
		productClass.name = sc.nextLine();

		System.out.print("Price: $");
		productClass.price = sc.nextDouble();

		System.out.print("Quantity in stock: ");
		productClass.quantity = sc.nextInt();

		System.out.println("Product data: " + productClass);
		System.out.println();

		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		productClass.addProductInStock(quantity);
		System.out.println();

		System.out.println("Updated data: " + productClass);
		System.out.println();

		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		productClass.removeProduct(quantity);
		System.out.println();

		System.out.println("Updated data: " + productClass);

		sc.close();
	}
}
