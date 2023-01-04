package classes;

public class EncapsulationClass {
	/*
	 * Todos os atributos devem ser privados a partir de agora, assim gerando mais
	 * segurança ao nosso programa, pois só poderão ser acessados pelos getters e
	 * setters.
	 */
	private String name;
	private double price;
	private int quantity;

	/* Constructors */
	public EncapsulationClass() {
	}

	public EncapsulationClass(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public EncapsulationClass(String name, double price) {
		this.name = name;
		this.price = price;
	}

	/* Encapsulation */
	/*
	 * Os Getters vão servir para acessar os nomes dos atributos, como por exemplo
	 * quando houver necessidade de ter um output e tal atributo
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * Nós teremos somente o método GET devido ao nosso atributo quantidade, só
	 * poder ser acessado através da leitura inicial de um valor que é solicitado ao
	 * usuário e depois pelos métodos da nossa classe, o que protege mais ainda
	 * nosso programa de possivelmente o atributo quantity ser acessado manualmente.
	 */
	public int getQuantity() {
		return quantity;
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
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
