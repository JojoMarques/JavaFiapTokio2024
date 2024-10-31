package br.com.fiap.banco;

public class CDB implements Produto {

	@Override
	public double investir(double valor) {
		return valor += valor * 1 / 100;
	}

}
