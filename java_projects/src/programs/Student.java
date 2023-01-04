package programs;

import java.util.Scanner;
import java.util.Locale;
import classes.StudentClass;

public class Student {
	public static void main(String[] args) {

		StudentClass studentClass = new StudentClass();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		studentClass.name = sc.nextLine();
		studentClass.score1 = sc.nextDouble();
		studentClass.score2 = sc.nextDouble();
		studentClass.score3 = sc.nextDouble();
		System.out.println();

		System.out.println(studentClass);

		if (studentClass.finalScore() > 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", studentClass.reproved());
		}
		sc.close();
	}
}