package programs;

import java.util.Locale;
import java.util.Scanner;
import classes.Vector2Class;

public class Vector2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Vector2Class[] vect = new Vector2Class[n];
		
		for (int i = 0; i < vect.length; i++) { // length fica melhor usado para ler o tamanho do vetor, do que utilizar a variável 'n' no caso.
			sc.nextLine(); // Aquele nextline declarado após um nextint para consumir o espaço em branco.
			
			String name = sc.nextLine(); 
			double price = sc.nextDouble();
			
			vect[i] = new Vector2Class(name, price); // Declarando os atributos a cada posição do vetor.
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			
			sum += vect[i].getPrice(); // O GET vai fazer a nossa fórmula funcionar somente no price.
			
		}
		
		double avg = sum / vect.length; // length utilizado para fazer a média aritmética.
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}
}
