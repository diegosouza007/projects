/*
 * Description: Programa criado a partir dos conhecimentos obtidos pelo Curso de programação em Java.
 * Author: Diego Souza
 * Date: 
*/
package br.com.programa;

public class Programa {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		conta1.nome = "Diego Souza";
		conta1.conta = "1045278-8";
		conta1.agencia = 3680;
		conta1.saldo = 4000.00;
		
		Conta conta2 = new Conta();
		
		conta2.nome = "Ana Alice";
		conta2.conta = "1055858-8";
		conta2.agencia = 3420;
		conta2.saldo = 8000.00;
		
		// Operações
		conta1.deposita(1000.00);
		conta1.saca(100.00);
		conta1.transfere(conta2, 200.00);
		conta2.saca(300.00);
		
		// Mostrando informações da primeira conta
		System.out.println("Bem vindo(a), " + conta1.nome + "!");
		System.out.println("\nNúmero da conta: " + conta1.conta);
		System.out.println("Número da agência: " + conta1.agencia);
		System.out.println("Saldo da conta: R$ " + conta1.saldo);
		System.out.println("--");
		
		// Mostrando informações da segunda conta
		System.out.println("Bem vindo(a), " + conta2.nome + "!");
		System.out.println("\nNúmero da conta: " + conta2.conta);
		System.out.println("Número da agência: " + conta2.agencia);
		System.out.println("Saldo da conta: R$ " + conta2.saldo);
		System.out.println("--");
		
	}

}
