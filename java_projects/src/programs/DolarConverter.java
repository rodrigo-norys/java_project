package programs;

import java.util.Locale;
import java.util.Scanner;
import classes.DolarConverterClass;

public class DolarConverter {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.print("What is the dollar price? ");
    double dollarPrice = sc.nextDouble();
    
    System.out.print("How many dollars will be bought?");
    double amount = sc.nextDouble();
    
    double result = DolarConverterClass.dollarToReal(dollarPrice, amount);
    
    System.out.printf("Amount to be paid in reais = %.2f", result);
    sc.close();
  }
}