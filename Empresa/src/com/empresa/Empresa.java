package com.empresa;

public class Empresa {
	
	String nomeEmpresa;
	
	Funcionario[] empregados;
		
	void adiciona(Funcionario funcionario) {
		
		for(int i = 0; i <= this.empregados.length; i++) {
			
			if(this.empregados[i] == null) {
				this.empregados[i] = funcionario;
			} else {
				continue;
			}
			
		}
		
	}

}