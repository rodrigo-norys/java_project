package programs;

import java.util.Locale;
import java.util.Scanner;

import classes.ParkClass;

public class Park {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ParkClass parkClass; // Objeto criado inicialmente pois precisaremos chamá-la dentro do escopo de um condicional "if".
		
		/* As duas variáveis foram instanciadas com valores iniciais para poderem ser chamadas dentro do condicional "if".*/
		int decisaoBrinquedo = 0;
		double creditoInicial = 0.0;
		
		System.out.print("Informe seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe sua idade: ");
		int idade = sc.nextInt();
		
		System.out.print("Informe seu CPF: ");
		sc.nextLine(); // Isso aqui é só o Java Javando. 
		String cpf = sc.nextLine();
		
		System.out.print("Deseja colocar créditos no seu cartão?(y/n) ");
		char decisaoCredito = sc.next().charAt(0); // Ler um char.
		
		if (decisaoCredito == 'y' || decisaoCredito == 'Y') {
			System.out.println();
			System.out.print("Informe a quantia inicial que deseja creditar: ");
			creditoInicial = sc.nextDouble();
			parkClass = new ParkClass(nome, idade, cpf, creditoInicial); // Chamada do objeto e sobrecarga aplicada na sua melhor forma.
		}
		else {
			parkClass = new ParkClass(nome, idade, cpf); // Chamada do objeto e sobrecarga aplicada na sua melhor forma.
		}
		
		System.out.println();
		System.out.println("--------------------------------------------");
		System.out.println("Dados do cadastro!");
		System.out.print(parkClass); // toString
		System.out.println("\n--------------------------------------------\n");
		
		if (decisaoCredito == 'y' || decisaoCredito == 'Y') {
			System.out.println("Agora, o que acha de comprar tickets e começar a se divertir?");
			System.out.println("Aperte (1) para Roda Gigante: R$ 10,00.\n"
					+ "Aperte (2) para Carrossel: R$ 20,00.\n"
					+ "Aperte (3) para Montanha Russa: R$ 30,00.\n"
					+ "Aperte (4) para Kart: R$ 40,00.\nAperte (5) para sair.");
			decisaoBrinquedo = sc.nextInt();
			parkClass.cobrarBrinquedo(decisaoBrinquedo); // Método dos valores dos brinquedos.
		}
		else {
			System.out.print("Obrigado por fazer parte do nosso Parque. :D");
		}
		System.out.print(parkClass);
		sc.close();
	}
}
