package br.com.fiap.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.factory.ConnectionFactory;
import br.com.fiap.jdbc.model.Candidato;
import br.com.fiap.jdbc.model.Genero;

public class CandidatoDAO {

	/*
	 * private long idCantidato; // primary key private String nome; private Date
	 * data_nasc; private float tempo_experiencia; private String formacao; private
	 * String telefone; private String email; private String endereco; private int
	 * idade; private long idArea; // foreign key private Genero genero;
	 */

	private Connection connection; // variavel de conexao

	public CandidatoDAO() {
		super();
		this.connection = new ConnectionFactory().conectar(); // criando a conexão e chamando o método conectar
	}

	public CandidatoDAO(Connection connection) {
		this.connection = connection;
		}

	public void insert(Candidato candidato) {
		String sql = "insert into candidato (nome, data_nasc, tempo_experiencia, formacao, telefone, email, endereco, idArea, genero) values (?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			// smtm.setTipo(indice, o valor que vou passar)
			stmt.setString(1, candidato.getNome());
			stmt.setDate(2, candidato.getData_nasc());
			stmt.setFloat(3, candidato.getTempo_experiencia());
			stmt.setString(4, candidato.getFormacao());
			stmt.setString(5, candidato.getTelefone());
			stmt.setString(6, candidato.getEmail());
			stmt.setString(7, candidato.getEndereco());
			stmt.setLong(8, candidato.getIdArea());
			stmt.setString(9, candidato.getGenero().name());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(Long idCandidato) {
		String sql = "delete  from candidato where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setLong(1, idCandidato);

			// executando e fechando
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/// update:
	public void update(Candidato candidato) {
		String sql = "update candidato set nome=?, data_nasc=?, tempo_experiencia=?, formacao=?, telefone=?, email=?, endereco=?, idArea=?, genero=? where idCandidato=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			// smtm.setTipo(indice, o valor que vou passar)
			stmt.setString(1, candidato.getNome());
			stmt.setDate(2, candidato.getData_nasc());
			stmt.setFloat(3, candidato.getTempo_experiencia());
			stmt.setString(4, candidato.getFormacao());
			stmt.setString(5, candidato.getTelefone());
			stmt.setString(6, candidato.getEmail());
			stmt.setString(7, candidato.getEndereco());
			stmt.setLong(8, candidato.getIdArea());
			stmt.setString(9, candidato.getGenero().name());
			stmt.setLong(10, candidato.getIdCandidato());

			// executando e fechando
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/// selectAll:
	public List<Candidato> selectAll() {
		List<Candidato> listaCandidatos = new ArrayList<Candidato>();
		String sql = "select * from candidato order by nome";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Candidato candidato = new Candidato();

				candidato.setIdCandidato(rs.getLong("idCandidato"));
				candidato.setNome(rs.getString("nome"));
				candidato.setData_nasc(rs.getDate("data_nasc"));
				candidato.setEmail(rs.getString("email"));
				candidato.setTempo_experiencia(rs.getInt("tempo_experiencia"));
				candidato.setFormacao(rs.getString("formacao"));
				candidato.setEndereco(rs.getString("endereco"));
				candidato.setTelefone(rs.getString("telefone"));
				candidato.setGenero(Genero.valueOf(rs.getString("genero")));

				listaCandidatos.add(candidato);

			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaCandidatos;
	}

	/// selectById:
	public Candidato selectById(long idCandidato) {
		Candidato candidato = new Candidato();
		String sql = "select * from candidato where idCandidato=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, idCandidato);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				candidato.setIdCandidato(rs.getLong("idCandidato"));
				candidato.setNome(rs.getString("nome"));
				candidato.setData_nasc(rs.getDate("data_nasc"));
				candidato.setEmail(rs.getString("email"));
				candidato.setTempo_experiencia(rs.getInt("tempo_experiencia"));
				candidato.setFormacao(rs.getString("formacao"));
				candidato.setEndereco(rs.getString("endereco"));
				candidato.setTelefone(rs.getString("telefone"));
				candidato.setGenero(Genero.valueOf(rs.getString("genero")));
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return candidato;
	}
}
