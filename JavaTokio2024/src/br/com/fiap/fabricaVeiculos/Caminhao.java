package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Caminhao {

	private String marca;
	private String modelo;
	private Date anoDeFabricacao = new Date();
	private Date anoModelo = new Date();
	private int renavam;
	private String motor;
	private String tipoDeCambio;
	private float aroDasRodas;
	private int velocidade;
	private int eixos;
	private float qtdCargaSuportada;
	private float qtdCargaAbastecida;
	private String tipoCargaAbastecida;
	private String nomeDoCondutor;
	private boolean ligado = false;
	private int limiteVelocidade;

	public Caminhao(String marca, String modelo, Date anoDeFabricacao, Date anoModelo, int renavam, String motor,
			String tipoDeCambio, float aroDasRodas, int velocidade, int eixos, float qtdCargaSuportada,
			float qtdCargaAbastecida, String tipoCargaAbastecida, String nomeDoCondutor, int limiteVelocidade) {
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
		this.qtdCargaSuportada = qtdCargaSuportada;
		this.qtdCargaAbastecida = qtdCargaAbastecida;
		this.tipoCargaAbastecida = tipoCargaAbastecida;
		this.nomeDoCondutor = nomeDoCondutor;
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
		
		/*if (this.qtdCargaSuportada >= valor)
			this.qtdCargaAbastecida += valor;
		else
			this.qtdCargaAbastecida = this.qtdCargaSuportada;*/
		this.qtdCargaAbastecida += valor;
		if(this.qtdCargaAbastecida > this.qtdCargaSuportada) {
			this.qtdCargaAbastecida = this.qtdCargaSuportada;
		}
	}

	public void descarregar(float valor) {
		/*if (this.qtdCargaAbastecida <= valor)
			this.qtdCargaAbastecida -= valor;*/
		this.qtdCargaAbastecida -= valor;
		if(this.qtdCargaAbastecida < 0) {
			this.qtdCargaAbastecida = 0;
		}
	}

	public void exibirDadosDoCarro() {
		System.out.println("Caminhao [marca=" + marca + ", modelo=" + modelo + ", anoDeFabricacao=" + anoDeFabricacao
				+ ", anoModelo=" + anoModelo + ", renavam=" + renavam + ", motor=" + motor + ", tipoDeCambio="
				+ tipoDeCambio + ", aroDasRodas=" + aroDasRodas + ", velocidade=" + velocidade + ", eixos=" + eixos
				+ ", qtdCargaSuportada=" + qtdCargaSuportada + ", tipoCargaAbastecida=" + tipoCargaAbastecida
				+ ", nomeDoCondutor=" + nomeDoCondutor + ", ligado=" + ligado + ", limiteVelocidade=" + limiteVelocidade
				+ "]");

	}
}
