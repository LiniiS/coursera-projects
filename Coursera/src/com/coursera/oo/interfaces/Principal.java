package com.coursera.oo.interfaces;

public class Principal {

	public static void main(String[] args) {
		Barulhento[] barulhentos = new Barulhento[10];
		
		barulhentos[0] = new Cachorro();
		barulhentos[1] = new Bateria();
		barulhentos[2] = new Cachorro();
		barulhentos[3] = new Carro();
		barulhentos[4] = new Cachorro();
		barulhentos[5] = new Bateria();
		barulhentos[6] = new Carro();
		barulhentos[7] = new Bateria();
		barulhentos[8] = new Vuvuzela();
		barulhentos[9] = new Carro();
		
		sons(barulhentos);

	}

	public static void sons(Barulhento[] barulhentos) {
		for(Barulhento barulhento : barulhentos) {
			//chama o método específico de cada classe
			System.out.println(barulhento.fazerBarulho());
		}
	}
}
