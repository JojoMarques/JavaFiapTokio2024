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

		// criando o dao para candidato
		CandidatoDAO dao = new CandidatoDAO();

		Genero feminino = Genero.fromCodigo("f");
		Genero masculino = Genero.fromCodigo("m");
		// Genero genero = Genero.feminino;

		/*
		 * (String nome, Date data_nasc, float tempo_experiencia, String formacao,
		 * String telefone, String email, String endereco, Genero genero
		 */

		// criando o dao para área atuação
		AreaAtuacaoDAO dao2 = new AreaAtuacaoDAO();

		// criando uma área atuação
		AreaAtuacao areaAtuacao1 = new AreaAtuacao("T.I");
		AreaAtuacao areaAtuacao2 = new AreaAtuacao("F1");

		// inserindo uma área atuação
		dao2.insert(areaAtuacao1);
		dao2.insert(areaAtuacao2);

		Candidato candidato1 = new Candidato("Jojo", Date.valueOf("2006-08-03"), 2.0f, "T.I", "(11) 99419-7975",
				"jojo@gmail.com", "Brasil", feminino, 1);
		Candidato candidato2 = new Candidato("Carlinhos", Date.valueOf("1994-09-01"), 2.0f, "T.I", "(11) 95555-5555",
				"cabron@gmail.com", "Espanha", masculino, 2);

		// inserir usuários no banco
		dao.insert(candidato1);
		dao.insert(candidato2);

		// buscar todos os candidatos
		List<Candidato> candidatos = new ArrayList<Candidato>();

		System.out.println("\tCandidatos:");
		candidatos = dao.selectAll();

		for (Candidato candidato : candidatos) {
			System.out.println("Nome:" + candidato.getNome());
			System.out.println("Email:" + candidato.getEmail());
			System.out.println("Gênero:" + candidato.getGenero());
		}

		// buscar todos os candidatos
		List<AreaAtuacao> areas = new ArrayList<AreaAtuacao>();

		System.out.println("\tÁreas de atuação:");
		areas = dao2.selectAll();

		for (AreaAtuacao area : areas) {
			System.out.println("Nome:" + area.getNome());
		}

		// buscando candidato por ID
		System.out.println("\tCandidatos por ID:");

		Candidato teste = new Candidato();
		teste = dao.selectById(6);
		System.out.println(teste.getNome());

		// atualizando candidato
		System.out.println("\tCandidato atualizado:");
		candidato2.setEmail("sainzz@gmail.com");
		candidato2.setGenero(feminino);
		dao.update(candidato2);

		teste = dao.selectById(6);
		System.out.println(candidato2.getEmail());

	}

}
