package br.com.fiap.banco;

public class ContaCorrente extends Conta {

	private double saldoInvestimento;

	public ContaCorrente(Cliente cliente, String numeroConta) {
		super(cliente, numeroConta);
	}

}
