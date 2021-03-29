package com.coursera.oo.compra;

public class Compra {

	protected double valorCompra;
	protected double totalCompra;
	
	public Compra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double total() {
		totalCompra = valorCompra;
		return totalCompra;
	}

	public double getTotalCompra() {
		return totalCompra;
	}

}
