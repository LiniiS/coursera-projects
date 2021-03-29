package com.coursera.oo.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TesteCC {



	@Test
	public void deposito() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		assertEquals(cc.saldo,200);

	}

	@Test
	public void saque() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		int valorSacado = cc.sacar(50);
		assertEquals(valorSacado,50);
	}

	@Test
	public void saqueMaiorQueSaldo() {
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(200);
		int valorSacado = cc.sacar(250);
		assertEquals(cc.saldo,200);
		assertEquals(valorSacado,0);

	}
}
