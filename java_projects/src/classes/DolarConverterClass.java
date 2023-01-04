/*
Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por 
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda 
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.
*/

package classes;

public class DolarConverterClass {

	public static double dollarToReal(double dollarPrice, double amount) {
		return dollarPrice * amount + dollarPrice * amount * 0.06;
	}
}
