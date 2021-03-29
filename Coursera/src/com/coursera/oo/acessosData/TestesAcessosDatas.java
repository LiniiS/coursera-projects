package com.coursera.oo.acessosData;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestesAcessosDatas {

	@Test
	void testPessoaA() {

		Pessoa pessoaA = new Pessoa("2000-08-20");
		int idade = pessoaA.getIdade();
		assertEquals(idade, 20);
	}

	@Test
	void testPessoaB() {

		Pessoa pessoaB = new Pessoa("1991-12-20");
		int idade = pessoaB.getIdade();
		assertEquals(idade, 29);
	}

	@Test
	void testPessoaC() {

		Pessoa pessoaC = new Pessoa("2010-03-10");
		int idade = pessoaC.getIdade();
		assertEquals(idade, 11);
	}
	//Teste dos Signos
	@Test 
	void testSignoPessoaA(){
		Pessoa pessoaA = new Pessoa("2000-08-20");
		String signo = pessoaA.getSigno();
		assertEquals(signo, "Leão");
	}
	@Test 
	void testSignoPessoaB(){
		Pessoa pessoaB = new Pessoa("1991-12-20");
		String signo = pessoaB.getSigno();
		assertEquals(signo, "Sagitário");
	}
	@Test 
	void testSignoPessoaC(){
		Pessoa pessoaC = new Pessoa("2010-03-10");
		String signo = pessoaC.getSigno();
		assertEquals(signo, "Peixes");
	}

	
}
