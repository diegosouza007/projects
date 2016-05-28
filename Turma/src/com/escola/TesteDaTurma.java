//Trabalhando com Arrays, encapsulamento, bibliotecas e métodos.

package com.escola;

import java.util.Scanner;

public class TesteDaTurma {

	public static void main(String[] args) {
		
		int num;
	
		Turma turma = new Turma();
		turma.aluno = new Aluno[10];
		
		System.out.println("Deseja cadastrar um aluno? (1-SIM / 2-NÃO)");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		
		if(1 == num) {
			// Forma para cadastrar o nome do Aluno
			String nome;
			System.out.println("Informe o nome do primeiro aluno: ");
			Scanner user = new Scanner(System.in);
			nome = user.nextLine();
			turma.aluno[0] = new Aluno();
			turma.aluno[0].setNome(nome);
			
			// Forma para cadastrar a nota do Usuário
			double nota;
			System.out.println("Agora digite a nota deste Aluno: ");
			nota = user.nextDouble();
			turma.aluno[0].setNota(nota);
					
			turma.imprimeNotas();
			
		} else {
			System.out.println("Obrigado por usar o programa!");
		}

	}

}
