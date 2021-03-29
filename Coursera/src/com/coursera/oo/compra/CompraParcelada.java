package com.coursera.oo.compra;

public class CompraParcelada extends Compra {
	
	private int qntidadeParcelas;
	private int taxaJuros;
	
	public CompraParcelada(double valorCompra, int qntidadeParcelas, int taxaJuros) {
		super(valorCompra);
		this.qntidadeParcelas = qntidadeParcelas;
		this.taxaJuros = taxaJuros;
	}
	
	@Override
	public double total() {
		this.totalCompra = this.valorCompra * Math.pow((1 + taxaJuros), qntidadeParcelas );
		return this.totalCompra;
	}
	

}
