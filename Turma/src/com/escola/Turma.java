package com.escola;

public class Turma {

		Aluno[] aluno;
		
	void imprimeNotas() {
		for(int x = 0 ; x < this.aluno.length ; x++) {
			Aluno aluno = this.aluno[x];
			if(aluno == null) continue;
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Nota: " + aluno.getNota());
			System.out.println("--");
		}
	}
	
	//void adicionaAluno() {
		
	//}
		
}
