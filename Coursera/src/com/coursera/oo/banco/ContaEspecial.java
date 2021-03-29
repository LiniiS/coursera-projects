package com.coursera.oo.banco;

public class ContaEspecial extends ContaCorrente {

	int limite;
	
	ContaEspecial(int limite){
		this.limite = limite;
	}
	

	public int sacar(int valor) {
		if(valor > (saldo + limite)) {
			System.out.println("Saldo insuficiente");
			return 0; //n�o consegue sacar
		}else {
			saldo -=valor;
			return valor;
		}
	}
	
}
