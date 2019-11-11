package br.com.bandtec.bookstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.bandtec.bookstore.domain.Livro;
import br.com.bandtec.bookstore.domain.Opniao;

@Service
public class LivroService {
	private List<Livro> livros;
	private List<Opniao> opnioes = new ArrayList<Opniao>();

	public List<Livro> buscarPorTema(String tema) {
		List<Livro> resultados = new ArrayList<Livro>();
		for (Livro livro : todosLivros()) {
			if(livro.comTema(tema)) {
				resultados.add(livro);
			}
		}
		return resultados;
	}
	
	private List<Livro> todosLivros(){
		List<Livro> livros = new ArrayList<Livro>();
		
		livros.add(new Livro("50 tons de azul", "Comedia"));
		livros.add(new Livro("A morte do JavaScripto", "Historia"));
		livros.add(new Livro("Kotlin ou Java", "TI"));
		livros.add(new Livro("PALAMEIRAS UM CAMPEÃO INCOMPREENDIDO", "Historia"));
		return livros;
	}
	
	public void adicionarOpniao(Opniao opniao) {
		opnioes.add(opniao);
	}
}
