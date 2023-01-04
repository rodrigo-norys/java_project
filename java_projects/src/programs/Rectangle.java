package programs;

import java.util.Scanner;
import java.util.Locale;
import classes.RectangleClass;

public class Rectangle {
	public static void main(String[] args) {

		RectangleClass rectangleClass = new RectangleClass();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rectangle width and height:");
		rectangleClass.width = sc.nextDouble();
		rectangleClass.height = sc.nextDouble();
		System.out.println(rectangleClass);

		sc.close();
	}
}
