/*
 * Description: Este programa foi feito com base nas explicações do livro "Desbravando Java e OO" da série Caelum.
 * Author: Diego Souza
 * Date: 21/12/2015 6:20 PM
*/

package br.com.livraria;

public class Autor {
	
	String nomeAutor;
	String emailAutor;
	String cpfAutor;
	
	void mostraDetalhesAutor(){
		
		System.out.println("Detalhes autor:\n");
		System.out.println("Autor: " + nomeAutor);
		System.out.println("E-mail: " + emailAutor);
		System.out.println("CPF: " + cpfAutor);
		
	}

}
