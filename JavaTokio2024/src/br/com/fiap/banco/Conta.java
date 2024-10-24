package br.com.fiap.banco;

public class Conta {

	private String nomeCliente;
	private String cpfCliente;
	private String numeroConta;
	private float saldoCliente;

	public Conta(String nomeCliente, String cpfCliente, String numeroConta, float saldoCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.numeroConta = numeroConta;
		this.saldoCliente = saldoCliente;
	}

	public void Sacar(float valor) {
		if (this.saldoCliente >= valor) {
			this.saldoCliente -= valor;
			System.out.printf("--> Saque de R$ %.2f efetuado. <-- \n", valor);
		} else
			System.out.println("--> Saldo insuficiente. <--\n");
	}

	public void Depositar(float valor) {
		this.saldoCliente += valor;
	}

	public float ConsultarSaldo() {
		return this.saldoCliente;
	}

	public void Transferir(float valor, Conta contaDestino) {
		if (this.saldoCliente >= valor) {

			// adicionando o valor na conta destino
			float saldoContaDestino = contaDestino.ConsultarSaldo();
			contaDestino.Depositar(valor);

			// retirando o valor da conta atual
			this.Sacar(valor);
		} else
			System.out.println("--> Saldo insuficiente. <--\n");
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

}
