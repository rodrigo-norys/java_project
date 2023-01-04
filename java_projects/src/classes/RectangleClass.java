/*
Fazer um programa para ler os valores da largura e altura 
de um retângulo. Em seguida, mostrar na tela o valor de 
sua área, perímetro e diagonal. Usar uma classe como 
mostrado no projeto ao lado.
*/
package classes;

public class RectangleClass {

	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return (width * 2) + (height * 2);
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

	public String toString() {
		return String.format("AREA = %.2f\n", area()) + String.format("PERIMETER = %.2f\n", perimeter())
				+ String.format("DIAGONAL = %.2f", diagonal());
	}
}
