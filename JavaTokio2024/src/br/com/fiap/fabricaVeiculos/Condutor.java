package br.com.fiap.fabricaVeiculos;

public class Condutor {

	private String nomeCondutor;
	private String carteiraCondutor;
	private String cpfCondutor;

	public Condutor(String nomeCondutor, String carteiraCondutor, String cpfCondutor) {
		super();
		this.nomeCondutor = nomeCondutor;
		this.carteiraCondutor = carteiraCondutor;
		this.cpfCondutor = cpfCondutor;
	}

	public String getNomeCondutor() {
		return nomeCondutor;
	}

	public void setNomeCondutor(String nomeCondutor) {
		this.nomeCondutor = nomeCondutor;
	}

	public String getCarteiraCondutor() {
		return carteiraCondutor;
	}

	public void setCarteiraCondutor(String carteiraCondutor) {
		this.carteiraCondutor = carteiraCondutor;
	}

	public String getCpfCondutor() {
		return cpfCondutor;
	}

	public void setCpfCondutor(String cpfCondutor) {
		this.cpfCondutor = cpfCondutor;
	}

}
