package classes;

public class OverloadClass {
	public String name;
	public double price;
	public int quantity;
	
	public OverloadClass() {
/* Podemos também utilizar a sobrecarga para chamar o Construtor padrão */
		}	
	
	public OverloadClass(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		}
	public OverloadClass(String name, double price) {
/* A sobrecarga se trata de poder instanciar o mesmo método mais de uma vez.
 * Neste caso será para iniciar o nosso programa com a quantidade valendo ZERO!
 * O método poderia ficar das seguintes maneiras:
 * this.quantity = 0;
 * Retirando o quantity como parâmetro, pois por padrão um atributo do tipo int, tem '0' como valor
*/		
		this.name = name;
		this.price = price;
		}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
