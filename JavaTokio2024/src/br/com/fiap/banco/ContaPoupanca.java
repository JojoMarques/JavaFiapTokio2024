package br.com.fiap.banco;

public class ContaPoupanca extends Conta {

	private float saldoDeAplicacao;

	public ContaPoupanca(Cliente cliente, String numeroConta, float saldoDeAplicacao) {
		super(cliente, numeroConta);
		this.setSaldoDeAplicacao(saldoDeAplicacao);
	}

	@Override
	public void exibirSaldo() {
		// TODO Auto-generated method stub
		
	}

	public float getSaldoDeAplicacao() {
		return saldoDeAplicacao;
	}

	public void setSaldoDeAplicacao(float saldoDeAplicacao) {
		this.saldoDeAplicacao = saldoDeAplicacao;
	}
}
