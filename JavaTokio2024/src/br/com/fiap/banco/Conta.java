package br.com.fiap.banco;

import java.util.Date;

public abstract class Conta {

	// muda pra protected pra poder herdar os atributos
	protected Cliente cliente;
	protected String numeroConta;
	protected Date dataAbertura = new Date();
	protected float saldoCliente;

	public Conta(Cliente cliente, String numeroConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
	}

	public Conta(Cliente cliente, String numeroConta, float saldoCliente) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.saldoCliente = saldoCliente;
	}

	public boolean Sacar(double valor) throws SaldoInsuficiente {
		if (this.saldoCliente >= valor) {
			this.saldoCliente -= valor;
			return true;
		} else
			throw new SaldoInsuficiente("Saldo insuficiente");
	}

	public void Depositar(float valor) {
		this.saldoCliente += valor;
	}

	public float ConsultarSaldo() {
		return this.saldoCliente;
	}

	// indica aqui em cima que esse trecho gera exceção
	public void Transferir(float valor, Conta contaDestino) throws SaldoInsuficiente {
		if (this.saldoCliente >= valor) {

			// adicionando o valor na conta destino
			float saldoContaDestino = contaDestino.ConsultarSaldo();
			contaDestino.Depositar(valor);

			// retirando o valor da conta atual
			this.Sacar(valor);
		} else
			throw new SaldoInsuficiente("Saldo insuficiente");
	}

	public abstract void exibirSaldo();

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
