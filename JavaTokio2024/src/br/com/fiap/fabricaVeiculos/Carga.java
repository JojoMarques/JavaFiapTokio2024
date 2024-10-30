package br.com.fiap.fabricaVeiculos;

public class Carga {
	private float qtdCargaSuportada;
	private float qtdCargaAbastecida;
	private String tipoCargaAbastecida;

	public Carga(float qtdCargaSuportada, float qtdCargaAbastecida, String tipoCargaAbastecida) {
		super();
		this.qtdCargaSuportada = qtdCargaSuportada;
		this.qtdCargaAbastecida = qtdCargaAbastecida;
		this.tipoCargaAbastecida = tipoCargaAbastecida;
	}

	public float getQtdCargaSuportada() {
		return qtdCargaSuportada;
	}

	public void setQtdCargaSuportada(float qtdCargaSuportada) {
		this.qtdCargaSuportada = qtdCargaSuportada;
	}

	public float getQtdCargaAbastecida() {
		return qtdCargaAbastecida;
	}

	public void setQtdCargaAbastecida(float qtdCargaAbastecida) {
		this.qtdCargaAbastecida = qtdCargaAbastecida;
	}

	public String getTipoCargaAbastecida() {
		return tipoCargaAbastecida;
	}

	public void setTipoCargaAbastecida(String tipoCargaAbastecida) {
		this.tipoCargaAbastecida = tipoCargaAbastecida;
	}

}
