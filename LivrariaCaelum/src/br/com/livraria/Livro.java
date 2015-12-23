package br.com.livraria;

public class Livro {

	String nomeLivro;
	String descricaoLivro;
	double valorLivro;
	String isbnLivro;
	Autor autor;

	void mostraDetalhesLivro() {

		System.out.println("Detalhes do livro:\n");
		System.out.println("Nome: " + nomeLivro);
		System.out.println("Descrição: " + descricaoLivro);
		System.out.println("Valor: R$ " + valorLivro);
		System.out.println("ISBN: " + isbnLivro);
		
		autor.mostraDetalhesAutor();

	}

}
