package br.com.fiap.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection conectar() {
		// jdbc: especificação (a mais antiga e a mais simnples) do Javpara conexão com
		// o BDD.
		// java tem a JPA também (trabalha com frameworks como o Hibernate)
		
		try {
			// "especificação: bdd q vai usar: endereco pra usar o banco: porta (1521).., "usuario", "senha"
			// porta 3601 para acesso local 
			return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "tm14", "03082006");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
