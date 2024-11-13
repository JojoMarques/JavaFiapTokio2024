package br.com.fiap.jdbc.teste;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.jdbc.dao.AreaAtuacaoDAO;
import br.com.fiap.jdbc.dao.CandidatoDAO;
import br.com.fiap.jdbc.model.AreaAtuacao;
import br.com.fiap.jdbc.model.Candidato;
import br.com.fiap.jdbc.model.Genero;

public class Teste {

	public static void main(String[] args) {

		CandidatoDAO dao = new CandidatoDAO();

		Genero genero = Genero.fromCodigo("f");
		// Genero genero = Genero.feminino;

		/*
		 * (String nome, Date data_nasc, float tempo_experiencia, String formacao,
		 * String telefone, String email, String endereco, Genero genero
		 */
		
		AreaAtuacaoDAO dao2 = new AreaAtuacaoDAO();
		AreaAtuacao areaAtuacao1 = new AreaAtuacao("T.I");
		dao2.insert(areaAtuacao1);
		
		Candidato candidato1 = new Candidato("Jojo", Date.valueOf("1990-05-15"), 2.0f, "T.I", "(11) 99419-7975",
				"jojo@gmail.com", "Brasil", genero, 1);

		System.out.println(candidato1.getNome());
		// inserir usuários no banco
		dao.insert(candidato1);

		// buscar todos os candidatos
		List<Candidato> lista = new ArrayList<Candidato>();
		lista = dao.selectAll();
		
		for (Candidato candidato : lista) {
			System.out.println("Nome:" + candidato.getNome());
			System.out.println("Email:" + candidato.getEmail());
			System.out.println("Gênero:" + candidato.getGenero());
		}
	}

}
