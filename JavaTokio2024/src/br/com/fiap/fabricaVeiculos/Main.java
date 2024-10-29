package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Main {

	@SuppressWarnings("deprecation") // a data só tá funcionando com isso.
	public static void main(String[] args) {

		/*
		 * String marca, String modelo, String anoDeFabricacao, String anoModelo, String
		 * renavam, String motor, String tipoDeCambio, String aroDasRodas, float
		 * velocidade, String nomeDoCondutor
		 */

		Carro carro1 = new Carro("Toyota", "Corolla", new Date(120, 0, 1), new Date(121, 0, 1), 1234567890, "2.0 Flex",
				"Automático", 17.0f, 0.0f, "João Silva", 300);

		// ligando
		carro1.ligar();

		// acelerando
		carro1.acelerar(140);

		// exibindo dados
		carro1.exibirDadosDoCarro();

		// freando
		carro1.frear(100);

		Caminhao caminhao1 = new Caminhao("Volvo", "FH 540", new Date(120, 0, 1), new Date(121, 0, 1), 1234567890,
				"D16K", "Automático", 22f, 120, 6, 2000.0f, 1500.0f, "Granel", "João Silva", 90);

		caminhao1.carregar(100);
		caminhao1.exibirDadosDoCarro();
		caminhao1.acelerar(100);
	}
}
