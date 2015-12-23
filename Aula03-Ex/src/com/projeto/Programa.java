package com.projeto;

public class Programa {

	public static void main(String[] args) {

		Funcionario func1 = new Funcionario();
		func1.nome = "Paulo Guimalhães";
		func1.departamento = "Marketing";

		Data data1 = new Data();
		func1.data = data1;

		data1.preencheData(7, 7, 2007);
		func1.rg = "456456-5665-555";
		func1.salario = 1200.00;

		func1.mostraInformacoes();

		Funcionario func2 = new Funcionario();
		func2.nome = "Paola Andrade";
		func2.departamento = "Informática";

		Data data2 = new Data();
		func2.data = data2;

		func2.data.preencheData(5, 5, 2005);
		func2.rg = "56456-2131-332";
		func2.salario = 1500.00;

		func2.mostraInformacoes();

	}

}
