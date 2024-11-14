package br.com.fiap.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.factory.ConnectionFactory;
import br.com.fiap.jdbc.model.AreaAtuacao;

public class AreaAtuacaoDAO {

	private Connection connection; // variavel de conexao

	public AreaAtuacaoDAO() {
		super();
		this.connection = new ConnectionFactory().conectar(); // criando a conexão e chamando o método conectar
	}

	public AreaAtuacaoDAO(Connection connection) {
		this.connection = connection;
	}

	public void insert(AreaAtuacao areaAtuacao) {
		String sql = "insert into area_atuacao (nome) values (?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			// smtm.setTipo(indice, o valor que vou passar)
			stmt.setString(1, areaAtuacao.getNome());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(Long idArea) {
		String sql = "delete from area_atuacao where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setLong(1, idArea);

			// executando e fechando
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/// update:
	public void update(AreaAtuacao areaAtuacao) {
		String sql = "update area_atuacao set nome=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			// smtm.setTipo(indice, o valor que vou passar)
			stmt.setString(1, areaAtuacao.getNome());

			// executando e fechando
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/// selectAll:
	public List<AreaAtuacao> selectAll() {
		List<AreaAtuacao> listaAreasAtuacoes = new ArrayList<AreaAtuacao>();
		String sql = "select * from area_atuacao order by nome";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				AreaAtuacao areaAtuacao = new AreaAtuacao();

				areaAtuacao.setIdArea(rs.getLong("idArea"));
				areaAtuacao.setNome(rs.getString("nome"));

				listaAreasAtuacoes.add(areaAtuacao);

			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaAreasAtuacoes;
	}

	/// selectById:
	public AreaAtuacao selectById(long idArea) {
		AreaAtuacao areaAtuacao = new AreaAtuacao();
		String sql = "select * from area_atuacao where id=?";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, idArea);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				areaAtuacao.setIdArea(rs.getLong("idArea"));
				areaAtuacao.setNome(rs.getString("nome"));

			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return areaAtuacao;
	}

}
