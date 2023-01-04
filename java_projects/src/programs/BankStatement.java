package programs;

import java.util.Locale;
import java.util.Scanner;

import classes.BankStatementClass;

public class BankStatement {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankStatementClass bankStatementClass; // Variável criada fora da condição para podermos acessar o que for declarado dentro do if

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine(); // Foi utilizado apenas para consumir o espaço que o nextint de cima deixou, sendo necessário fazer um em seguida
		String holder = sc.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bankStatementClass = new BankStatementClass(number, holder, initialDeposit); // Sobrecarga para condição verdadeira
		} else {
			bankStatementClass = new BankStatementClass(number, holder); // Sobrecarga para condição falsa
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(bankStatementClass);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bankStatementClass.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(bankStatementClass);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		bankStatementClass.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(bankStatementClass);

		sc.close();
	}
}
