package com.coursera.oo.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TesteCE extends TesteCC {


	@Test
	public void saqueMaiorQueSaldo() {
		ContaCorrente cc = new ContaEspecial(100);
		cc.depositar(200);
		int valorSacado = cc.sacar(350);
		assertEquals(200, cc.saldo);
		assertEquals(0, valorSacado);	
	}

	@Test
	public void saqueMaiorQueSaldoDentroDoLimite() {
		ContaCorrente cc = new ContaEspecial(100);
		cc.depositar(200);
		int valorSacado = cc.sacar(250);
		assertEquals(-50, cc.saldo);
		assertEquals(250, valorSacado);
		
	}
}
