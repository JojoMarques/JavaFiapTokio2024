package br.com.fiap.fabricaVeiculos;

public class Caminhao {

	private String marca;
	private String modelo;
	private String anoDeFabricacao;
	private String anoModelo;
	private int renavam;
	private String motor;
	private String tipoDeCambio;
	private float aroDasRodas;
	private int velocidade;
	private int eixos;
	private Carga carga;
	private Condutor condutor;
	private boolean ligado = false;
	private int limiteVelocidade;

	public Caminhao(String marca, String modelo, String anoDeFabricacao, String anoModelo, int renavam, String motor,
			String tipoDeCambio, float aroDasRodas, int velocidade, int eixos, Carga carga, Condutor condutor,
			int limiteVelocidade) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoDeFabricacao = anoDeFabricacao;
		this.anoModelo = anoModelo;
		this.renavam = renavam;
		this.motor = motor;
		this.tipoDeCambio = tipoDeCambio;
		this.aroDasRodas = aroDasRodas;
		this.velocidade = velocidade;
		this.eixos = eixos;
		this.carga = carga;
		this.condutor = condutor;
		this.limiteVelocidade = velocidade;
	}

	public void ligar() {
		if (!this.ligado)
			this.ligado = true;
		else
			System.out.println("o caminhão JÁ está ligado.");
	}

	public void desligar() {
		if (this.ligado && this.velocidade == 0)
			this.ligado = false;
		else
			System.out.println("o caminhão JÁ está desligado.");
	}

	public float acelerar(float valor) {
		if (this.ligado)
			this.velocidade += valor;
		if (this.velocidade >= limiteVelocidade)
			this.velocidade = limiteVelocidade;

		return this.velocidade;
	}

	public void frear(float valor) {
		if (this.velocidade > 0) {
			this.velocidade -= valor;
			if (this.velocidade < 0) {
				this.velocidade = 0;
			}
		}
	}

	public void carregar(float valor) {

		/*
		 * if (this.qtdCargaSuportada >= valor) this.qtdCargaAbastecida += valor; else
		 * this.qtdCargaAbastecida = this.qtdCargaSuportada;
		 */
		float qtdCargaAbastecida = this.carga.getQtdCargaAbastecida();

		this.carga.setQtdCargaAbastecida(valor + qtdCargaAbastecida);
		if (this.carga.getQtdCargaAbastecida() > this.carga.getQtdCargaSuportada()) {
			this.carga.setQtdCargaAbastecida(this.carga.getQtdCargaSuportada());
		}
	}

	public void descarregar(float valor) {
		/*
		 * if (this.qtdCargaAbastecida <= valor) this.qtdCargaAbastecida -= valor;
		 */
		float qtdCargaAbastecida = this.carga.getQtdCargaAbastecida();

		this.carga.setQtdCargaAbastecida(qtdCargaAbastecida - valor);
		if (this.carga.getQtdCargaAbastecida() < 0) {
			this.carga.setQtdCargaAbastecida(0);
		}
	}

	public void exibirDadosDoCarro() {
		System.out.println("Caminhao [marca=" + marca + ", modelo=" + modelo + ", anoDeFabricacao=" + anoDeFabricacao
				+ ", anoModelo=" + anoModelo + ", renavam=" + renavam + ", motor=" + motor + ", tipoDeCambio="
				+ tipoDeCambio + ", aroDasRodas=" + aroDasRodas + ", velocidade=" + velocidade + ", eixos=" + eixos
				+ ", qtdCargaSuportada=" + carga.getQtdCargaSuportada() + ", tipoCargaAbastecida="
				+ carga.getQtdCargaAbastecida() + ", nomeDoCondutor=" + condutor.getNomeCondutor() + ", ligado="
				+ ligado + ", limiteVelocidade=" + limiteVelocidade + "]");

	}
}
