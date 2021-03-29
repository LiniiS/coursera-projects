package com.coursera.oo.compra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestaCompraParcelada {

	//Crie testes de unidade para 1, 2, 5 e 10 parcelas.
	@Test
	void testeUmaParcela() {
		//valor, qntParcela, taxaJuros (2% a.m.)
		Compra compra = new CompraParcelada(100, 1, 2);
		compra.total();
		assertEquals(300, compra.getTotalCompra());
	}
	
	@Test
	void testeDuasParcelas() {
		Compra compra = new CompraParcelada(100, 2, 2);
		compra.total();
		assertEquals(900, compra.getTotalCompra());
	}
	
	@Test
	void testeCincoParcelas() {
		Compra compra = new CompraParcelada(100, 5, 2);
		compra.total();
		assertEquals(24300, compra.getTotalCompra());
	}
	@Test
	void testeDezParcelas() {
		Compra compra = new CompraParcelada(100, 10, 2);
		compra.total();
		assertEquals(5904900, compra.getTotalCompra());
	}
}
