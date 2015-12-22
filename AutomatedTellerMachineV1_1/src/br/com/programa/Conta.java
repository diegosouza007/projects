package br.com.programa;

public class Conta {

	String nome;
	String conta;
	int agencia;
	double saldo;

	void deposita(double valorASerDepositado) {

		this.saldo += valorASerDepositado;

	}

	void saca(double valorASerSacado) {

		if (this.saldo >= valorASerSacado) {

			this.saldo -= valorASerSacado;

		} else {

			System.out.println("Valor insuficiente para sacar!");

		}

	}

	void transfere(Conta destino, double valorASerTransferido) {

		if (this.saldo >= valorASerTransferido) {

			this.saldo -= valorASerTransferido;
			destino.saldo += valorASerTransferido;

		} else {

			System.out.println("Valor insuficienbte para transferir!");

		}

	}

}
