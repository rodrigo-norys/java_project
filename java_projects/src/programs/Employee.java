package programs;

import java.util.Scanner;
import java.util.Locale;
import classes.EmployeeClass;

public class Employee {
  public static void main(String[] args) {

    EmployeeClass employeeClass = new EmployeeClass();

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Name: ");
    employeeClass.name = sc.nextLine();
    
    System.out.print("Gross salary: ");
    employeeClass.grossSalary = sc.nextDouble();
    
    System.out.print("Tax: ");
    employeeClass.tax = sc.nextDouble();
    System.out.println();
    
    System.out.println("Employee: " + employeeClass);
    System.out.println();

    // Momento onde o salário bruto é modificado tendo o 'percentage' como parâmetro
    System.out.print("Which percentage to increase salary? ");
    double percentage = sc.nextDouble();
    employeeClass.increaseSalary(percentage);
    
    System.out.println();
    System.out.println("Updated data: " + employeeClass);
    
    sc.close();
  }
}
