package com.projeto;

public class Funcionario {

	String nome;
	String departamento;
	double salario;
	String rg;
	Data data;

	void recebeAumento(double porcAumento) {
		this.salario += this.salario * porcAumento;
	}

	double calculaGanhoAnual() {
		return this.salario *= 12;
	}

	void mostraInformacoes() {

		System.out.println("\nDetalhes do funcionário:\n");
		System.out.println("Nome: " + nome);
		System.out.println("Departamento: " + departamento);
		System.out.println("RG: " + rg);
		System.out.println("Salário: R$ " + salario);
		System.out.println("--");

		recebeAumento(0.1);
		this.data.mostraData();

		System.out.println("Salário com aumento: R$ " + salario);
		System.out.println("Ganho anual: R$ " + calculaGanhoAnual());

	}

}
