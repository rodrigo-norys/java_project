package classes;

public class ConstructorClass {
	public String name;
	public double price;
	public int quantity;
	
	public ConstructorClass(String name, double price, int quantity) {
/* O this serve para diferenciar o atributo do objeto do parâmetro do Construtor. */
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
