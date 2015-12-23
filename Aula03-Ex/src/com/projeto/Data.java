package com.projeto;

public class Data {

	int dia;
	int mes;
	int ano;

	void preencheData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	void mostraData() {

		System.out.println("Data de entrada: " + this.dia + "/" + this.mes + "/" + this.ano);

	}
}
