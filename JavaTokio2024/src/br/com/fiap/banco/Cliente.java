package br.com.fiap.banco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private String nomeCliente;
	private String cpfCliente;
	private String enderecoCliente;
	private Date dataNasc = new Date();
	private String email;

	public Cliente(String nomeCliente, String cpfCliente, String enderecoCliente, String email, String dataNasc) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
		this.enderecoCliente = enderecoCliente;
		this.email = email;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		// converte de String --> Date

		// ctrl + shift + o (importa o que falta)
		try {
			this.dataNasc = format.parse(dataNasc);
		} catch (ParseException e) {
			System.err.println("Formato de data inválido" + dataNasc);
			e.printStackTrace();
		}

	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getEnderecoCliente() {
		return enderecoCliente;
	}

	public void setEnderecoCliente(String enderecoCliente) {
		this.enderecoCliente = enderecoCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

}
