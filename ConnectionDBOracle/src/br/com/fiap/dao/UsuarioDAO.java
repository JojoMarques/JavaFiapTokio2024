package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Usuario;

public class UsuarioDAO {
//dao: objeto de acesso a dados (a ponte entre a conexão e o objeto da classe)

	private Connection connection; // variável pra guardar a conexão

	public UsuarioDAO() {
		super();
		this.connection = new ConnectionFactory().conectar(); // criando a conexão e chamando o método conectar
	}

	// criar os métodos de CRUD:

	/// insert:
	public void insert(Usuario usuario) {
		String sql = "insert into usuario (nome, email, dataCadastro) values (?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			// smtm.setTipo(indice, o valor que vou passar)
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setDate(3, usuario.getDataCadastro());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/// delete:
	public void delete(Long id) {
		String sql = "delete  from usuario where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setLong(1, id);

			// executando e fechando
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/// update:
	public void update(Usuario usuario) {
		String sql = "update usuario set nome=?, email=?, dataCadastro=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			// smtm.setTipo(indice, o valor que vou passar)
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setDate(3, usuario.getDataCadastro());
			stmt.setLong(4, usuario.getId());

			// executando e fechando
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/// selectAll:
	public List<Usuario> selectAll() {
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		String sql = "select * from usuario order by nome";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery(); // ele já executa, por isso tá sem o stmt.execute()
			while (rs.next()) { /*
								 * enquanto tiver registros aqui, vou montar um objeto (pego eles e monto um
								 * objeto) --> while, pq eu nçao sei quantos dados eu tenho na minha tabela
								 * 
								 * qnd trago os dados da tabela, eu to com os dados dentro do rs, aí agora
								 * preciso transformar esses dados em objeto no insert, eu pego os dados do meu
								 * objeto e gravo na tabela na busca (select), eu obtenho os dados e transformo
								 * em objteos
								 */

				/* MÉTODO ANTIGO (QUANDO CRIAVA O CONSTRUTOR PRA PASSAR TODOS OS PARÂMETROS

				puxando os dados de lá 
				long id = rs.getLong("id"); 
				String nome = rs.getString("nome"); 
				String email = rs.getString("email"); 
				Date dataCadastro = rs.getDate("dataCadastro");
				 */

				// MÉTODO NOVO (USANDO O CONSTRUTOR VAZIO)
				Usuario usuario = new Usuario(); // já constroi o objeto vazio
				// puxa e já seta os dados no objeto.
				usuario.setId(rs.getLong("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setDataCadastro(rs.getDate("dataCadastro"));

				/*
				 * construindo o objeto e passando os dados puxados Usuario usuario = new
				 * Usuario(id, nome, email, dataCadastro);
				 */
				listaUsuarios.add(usuario);
				/*
				 * se fosse com construtor vazio: Usuario usuario = new Usuario(); ...
				 * usuario.set
				 */
			}
			stmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaUsuarios;
	}

	/// selectById:
	public Usuario selectById(long id) {
		Usuario usuario = new Usuario();
		String sql = "select * from usuario where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) { // msm sendo só um dado de retorno, usa o while por conta do executeQuery (sla, ele disse)
				usuario.setId(rs.getLong("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setEmail(rs.getString("email"));
				usuario.setDataCadastro(rs.getDate("dataCadastro"));
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}
}
