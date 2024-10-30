package br.com.fiap.banco;

public class Conta {

	private Cliente cliente;
	private String numeroConta;
	private float saldoCliente;

	public Conta(Cliente cliente, String numeroConta, float saldoCliente) {
		super();
		this.cliente = cliente;
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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

}
