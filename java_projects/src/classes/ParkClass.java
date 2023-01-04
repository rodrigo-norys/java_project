package classes;

public class ParkClass {
	/* Constantes dos valores dos brinquedos  */
	private static double RODAGIGANTE = 10.00;		// (1) - R$ 10,00
	private static double CARROSSEL = 20.00;		// (2) - R$ 20,00
	private static double MONTANHARUSSA = 30.00;	// (3) - R$ 30,00
	private static double KART = 40.00;			    // (4) - R$ 40,00
	
	private String nome;
	private int idade;
	private String cpf;
	private double saldo;
	
	public ParkClass(String nome, int idade, String cpf, double creditoInicial) { // Contstrutor utilizado na condição VERDADEIRA caso seja necessário acrescer crédito
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		credito(creditoInicial); // Incialmente o saldo e o creditoInicial são ZERO, logo faz sentido substituir o atributo saldo pelo método credito().
	}
	
	public ParkClass(String nome, int idade, String cpf) { // Construtor utilizado na condição FALSA caso o cliente não queria acrescer crédito.
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() { // Não teremos o "set" pois o CPF será algo imutável, sendo necessário preencher corretamente na hora do cadastro.
		return cpf;
	}

	public double getSaldo() { // O saldo é a mesma coisa, só sera alterado mediante as funções da classe.
		return saldo;
	}
	
	/* Método para acrescer crédito no cartão do cliente. Ele é utilizado para definir o valor para o saldo. */
	public void credito(double creditoInicial) {
		saldo += creditoInicial;
	}
	
	public void cobrarBrinquedo(int decisaoBrinquedo) {
		if (decisaoBrinquedo == 1) {
			saldo -= RODAGIGANTE;
		}
		else if (decisaoBrinquedo == 2) {
			saldo -= CARROSSEL;
		}
		else if (decisaoBrinquedo == 3) {
			saldo -= MONTANHARUSSA;
		}
		else if (decisaoBrinquedo == 4) {
			saldo -= KART;
		}
		else if (decisaoBrinquedo == 5) {
			System.out.println(nome + " seu saldo continua o mesmo!");
		}
	}
	
	public String toString() {
		return "Nome: "
				+ nome
				+ ", CPF: "
				+ cpf
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
	}
}