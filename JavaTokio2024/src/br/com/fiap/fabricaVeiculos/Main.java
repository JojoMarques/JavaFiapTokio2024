package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		/*
		 * String marca, String modelo, String anoDeFabricacao, String anoModelo, String
		 * renavam, String motor, String tipoDeCambio, String aroDasRodas, float
		 * velocidade, String nomeDoCondutor
		 */

		Condutor condutor1 = new Condutor("João da Silva", "111.222-3", "123.321.123-12");
		Carro carro1 = new Carro("Toyota", "Corolla", "01/01/2022", "01/01/2023", 1234567890, "2.0 Flex", "Automático",
				17.0f, 0.0f, condutor1, 300);

		// ligando
		carro1.ligar();

		// acelerando
		carro1.acelerar(140);

		// exibindo dados
		carro1.exibirDadosDoCarro();

		// freando
		carro1.frear(100);

		Carga carga1 = new Carga(100, 0, "Granel");
		Caminhao caminhao1 = new Caminhao("Volvo", "FH 540", "01/01/2020", "01/01/2021", 1234567890, "D16K",
				"Automático", 22f, 120, 6, carga1, condutor1, 90);

		caminhao1.carregar(100);
		caminhao1.exibirDadosDoCarro();
		caminhao1.acelerar(100);
	}
}
