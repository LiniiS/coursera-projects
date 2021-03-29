package com.coursera.oo.acessosData;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

	private String dataNascimento;

	public Pessoa(String dataNascimento) {
		this.dataNascimento = dataNascimento;

	}

	/**
	 * Optou-se por receber uma String e converter pra LocalDate nos métodos
	 * o uso da nova API de datas permite dispensar o uso da classe sugerida pelo
	 * exercicio
	 */
	
	public int getIdade() {
		int idade = 0;
		LocalDate dataNascimentoConvertida = LocalDate.parse(dataNascimento);
		Period periodo = Period.between(dataNascimentoConvertida, LocalDate.now());
		idade = periodo.getYears();
		System.out.println(idade);
		return idade;

	}

	public String getSigno() {
		LocalDate dataNascimentoConvertida = LocalDate.parse(dataNascimento);
		String signo = null;
		
		int dia = dataNascimentoConvertida.getDayOfMonth();
		int mes = dataNascimentoConvertida.getMonthValue();
				
		if((dia > 21 && mes == 3 ) || dia <=20 && mes == 4) {
			signo = "Áries";
		}
		if((dia > 21 && mes == 4 ) || dia <=20 && mes == 5) {
			signo = "Touro";
		}
		if((dia > 21 && mes == 5 ) || dia <=20 && mes == 6) {
			signo = "Gemeos";
		}
		if((dia > 21 && mes == 6 ) || dia <=20 && mes == 7) {
			signo = "Câncer";
		}
		if((dia > 21 && mes == 7 ) || dia <=20 && mes == 8) {
			signo = "Leão";
		}
		if((dia > 21 && mes == 8 ) || dia <=22 && mes == 9) {
			signo = "Virgem";
		}
		if((dia > 23 && mes == 9 ) || dia <=20 && mes == 10) {
			signo = "Libra";
		}
		if((dia > 21 && mes == 10 ) || dia <=22 && mes == 11) {
			signo = "Escorpião";
		}
		if((dia > 23 && mes == 11 ) || dia <=20 && mes == 12) {
			signo = "Sagitário";
		}
		if((dia > 21 && mes == 3 ) || dia <=20 && mes == 4) {
			signo = "Capricórnio";
		}
		if((dia > 20 && mes == 1 ) || dia <=18 && mes == 2) {
			signo = "Aquário";
		}
		if((dia > 19 && mes == 2 ) || dia <=20 && mes == 3) {
			signo = "Peixes";
		}
	
		return signo;
	}
}