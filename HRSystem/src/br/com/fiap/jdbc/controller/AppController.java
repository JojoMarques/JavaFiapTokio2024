package br.com.fiap.jdbc.controller;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.jdbc.dao.AreaAtuacaoDAO;
import br.com.fiap.jdbc.dao.CandidatoDAO;
import br.com.fiap.jdbc.factory.ConnectionFactory;

public class AppController {

	private static AppController instance;
	private Connection connection;
	private CandidatoDAO candidatoDAO;
	private AreaAtuacaoDAO areaDAO;

	// construtor privado ára Singleton
	private AppController() throws SQLException {
		// instãncias das conexões e dos DAOS (fornecendo a conexão pra eles)
		this.connection = new ConnectionFactory().conectar();
		this.candidatoDAO = new CandidatoDAO(connection);
		this.areaDAO = new AreaAtuacaoDAO(connection);
	}

	// método para obter a instância única do AppController
	public static AppController getInstance() throws SQLException {
		if (instance == null) {
			instance = new AppController();
		}
		return instance;
	}

	// método para fechar a conexão quando o AppController não for mais necessário
	public void closeConnection() throws SQLException {
		if (connection != null && connection.isClosed()) {
			connection.close();
		}
		
		// reescrever os métodos.
	}
}
