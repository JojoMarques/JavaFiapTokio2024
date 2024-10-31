package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Carro extends Veiculo{

	private String marca;
	private String modelo;
	private String anoDeFabricacao;
	private String anoModelo;
	private int renavam;
	private String motor;
	private String tipoDeCambio;
	private float aroDasRodas;
	private float velocidade;
	
	private Condutor condutor;
	private boolean ligado = false;
	private float limiteVelocidade;

	public Carro(String marca, String modelo, String anoDeFabricacao, String anoModelo, int renavam, String motor,
			String tipoDeCambio, float aroDasRodas, float velocidade, Condutor condutor, float limiteVelocidade) {
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
		this.condutor = condutor;
		this.limiteVelocidade = limiteVelocidade;
	}

	public void ligar() {
		if (!this.ligado)
			this.ligado = true;
		else
			System.out.println("o carro J� est� ligado.");
	}

	public void desligar() {
		if (this.ligado && this.velocidade == 0) // velocidade == 0 --> carro parado
			this.ligado = false;
		else
			System.out.println("o carro J� est� desligado.");
	}

	// N�O ENTENDI AS ALTERA��ES
	public float acelerar(float valor) {
		if (this.ligado)
			this.velocidade += valor;
		if (this.velocidade >= this.limiteVelocidade)
			this.velocidade = this.limiteVelocidade; // vai s� at� o limite (meio que o resto que ultrapassa isso, �
														// ignorado)

		return this.velocidade;
	}

	// N�O ENTENDI AS ALTERA��ES
	public void frear(float valor) {
		/*
		 * if (this.ligado && this.velocidade > 0) { //velocidade > 0 --> o carro est�
		 * em movimento if(this.velocidade >= valor) this.velocidade -= valor;
		 * System.out.println("velocidade freando"+this.velocidade); } else if
		 * (!this.ligado) System.out.println("o carro est� desligado."); else
		 * System.out.println("o carro n�o est� acelerado para que seja freado.");
		 */
		if (this.velocidade > 0) {
			this.velocidade -= valor;
			if (this.velocidade < 0) { // a� n�o entra com valor negativo.
				this.velocidade = 0;
			}
		}
	}

	// peguei o modelo do toString
	public void exibirDadosDoCarro() {
		System.out.println("Carro [marca=" + marca + ", modelo=" + modelo + ", anoDeFabricacao=" + anoDeFabricacao
				+ ", anoModelo=" + anoModelo + ", venavam=" + renavam + ", motor=" + motor + ", tipoDeCambio="
				+ tipoDeCambio + ", aroDasRodas=" + aroDasRodas + ", velocidade=" + velocidade + ", nomeDoCondutor="
				+ condutor.getNomeCondutor() + ", ligado=" + ligado + "]");
	}

}
