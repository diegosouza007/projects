package br.com.livraria;

public class CadastroDeLivros {

	public static void main(String[] args) {

		Autor autor1 = new Autor();
		autor1.nomeAutor = "Rodrigo Turini";
		autor1.emailAutor = "rodrigo.turini@caelum.com.br";
		autor1.cpfAutor = "123.456.789.8";

		Livro livro1 = new Livro();
		livro1.nomeLivro = "Desbravando Java";
		livro1.descricaoLivro = "Orientação a objetos";
		livro1.valorLivro = 59.90;
		livro1.isbnLivro = "2353-456.789.9";
		
		livro1.autor = autor1;
		livro1.mostraDetalhesLivro();
		
		Autor autor2 = new Autor();
		autor2.nomeAutor = "Paul Deitel";
		autor2.emailAutor = "deitel@deitel.com";
		autor2.cpfAutor = "123.456.789.2";
		
		Livro livro2 = new Livro();
		livro2.nomeLivro = "Java";
		livro2.descricaoLivro = "Como programar 8 ed.";
		livro2.valorLivro = 299.90;
		livro2.isbnLivro = "1324-23154-123-3";
		
		livro2.autor = autor2;
		livro2.mostraDetalhesLivro();
		

	}

}
