package com.coursera.oo.produtos;

public class ProdutoComTamanho extends Produto {

	@SuppressWarnings("unused")
	private String tamanho;

	public ProdutoComTamanho(Integer codigo, String nome, double preco, String tamanho) {
		super(codigo, nome, preco);
		this.tamanho = tamanho;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof ProdutoComTamanho)) {
			return false;
		}
		ProdutoComTamanho novoProdutoComTamanho = (ProdutoComTamanho) object;
		if (this.hashCode() == novoProdutoComTamanho.hashCode()) {
			return true;
		} else {
			return false;

		}
	}
	@Override 
	public int hashCode() {
		
		return this.codigo.hashCode();

	}

}
