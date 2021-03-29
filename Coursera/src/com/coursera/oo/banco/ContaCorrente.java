package com.coursera.oo.banco;

public class ContaCorrente {

	int saldo;
	public int sacar(int valor) {
		if(valor > saldo) {
			System.out.println("Saldo insuficiente");
			return 0; //não consegue sacar
		}else {
			saldo -=valor;
			return valor;
		}
	}
	public void depositar(int valor) {
		saldo += valor;
	}
}
