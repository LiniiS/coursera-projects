package com.coursera.oo.produtos;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	private Map<Produto, Integer> carrinhoDeCompras = new HashMap<>();
	private  double totalCompra = 0;
	private  int totalProdutosNoCarrinho;
	

	public void adicionaProduto(Produto produto, int qntdadeItensProduto) {
		if(carrinhoDeCompras.containsKey(produto)) {
			carrinhoDeCompras.put(produto, qntdadeItensProduto += qntdadeItensProduto);
		}else carrinhoDeCompras.put(produto, qntdadeItensProduto);
		totalProdutosNoCarrinho += qntdadeItensProduto;		
	}
	
	public void removeProduto(Produto produto, int qntdadeItensProduto) {
		if(carrinhoDeCompras.containsKey(produto)) {
			carrinhoDeCompras.remove(produto);
			totalProdutosNoCarrinho -=qntdadeItensProduto;
			System.out.println("Produto removido!");
		}
	}
	
	public double valorTotalDaCompra(){
		for(Produto produto : carrinhoDeCompras.keySet()) {
			totalCompra = produto.getPreco() * totalProdutosNoCarrinho;
		}
		return totalCompra;
	}
	
	public  int getTotalProdutosNoCarrinho() {
		return totalProdutosNoCarrinho;
	}
	public  void setTotalProdutosNoCarrinho(int totalProdutosNoCarrinho) {
		this.totalProdutosNoCarrinho = totalProdutosNoCarrinho;
	}
	public Map<Produto, Integer> getCarrinhoDeCompras() {
		return carrinhoDeCompras;
	}
	public  double getTotalCompra() {
		return totalCompra;
	}
	
	
}
