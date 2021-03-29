package com.coursera.oo.produtos;

public class Produto {

	@SuppressWarnings("unused")
	private String nome;
	protected Integer codigo;
	private double preco;

	public Produto(Integer codigo, String nome, double preco) {
		if (codigo == null) {
			throw new NullPointerException("Código do produto não pode ser nulo");
		}
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof Produto) {
			return this.codigo.equals(object);
		}
		return false;
	}

	@Override // melhorar o espalhamento para reduzir colisões e garantir o mesmo hashcode pra equals objects
	public int hashCode() {
		return this.codigo.hashCode();

	}

	public double getPreco() {
		return preco;
	}

}
