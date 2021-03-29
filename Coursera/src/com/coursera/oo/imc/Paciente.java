package com.coursera.oo.imc;

public class Paciente {
	private double peso; // quilos
	private double altura; // metros

	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public double calcularIMC(double peso, double altura) {
		double IMC = this.peso / (this.altura * this.altura);
		return IMC;
	}

	public void diagnostico(double IMC) {
		
		boolean imcBaixoPesoMuitoGrave = IMC < 16.00;
		boolean imcBaixoPesoGrave = IMC >= 16.00 && IMC <= 16.99;
		boolean imcBaixoPeso = IMC >= 17 && IMC <= 18.4;
		boolean imcPesoNormal = IMC >= 18.50 && IMC <= 24.99;
		boolean imcSobrepeso = IMC >= 25 && IMC <= 29.99;
		boolean imcObesidadeGrauUm = IMC >= 30 && IMC <= 34.99;
		boolean imcObesidadeGrauDois = IMC >= 35 && IMC <= 39.99;
		boolean imcObesidadeGrauTres = IMC >= 40;
		
		
		if (imcBaixoPesoMuitoGrave) {
			System.out.println("Baixo peso muito grave = IMC abaixo de 16 kg/m�");
		} else if (imcBaixoPesoGrave) {
			System.out.println("Baixo peso grave = IMC entre 16 e 16,99 kg/m�");
		} else if (imcBaixoPeso) {
			System.out.println("Baixo peso = IMC entre 17 e 18,49 kg/m�");
		} else if (imcPesoNormal) {
			System.out.println("Peso normal = IMC entre 18,50 e 24,99 kg/m�");
		} else if (imcSobrepeso) {
			System.out.println("Sobrepeso = IMC entre 25 e 29,99 kg/m�");
		} else if (imcObesidadeGrauUm) {
			System.out.println("Obesidade grau I = IMC entre 30 e 34,99 kg/m�");
		} else if (imcObesidadeGrauDois) {
			System.out.println("Obesidade grau II = IMC entre 35 e 39,99 kg/m�");
		} else if (imcObesidadeGrauTres) {
			System.out.println("Obesidade grau III (obesidade m�rbida) = IMC igual ou maior que 40 kg/m�");
		} else {
			System.out.println("N�o foi poss�vel diagnosticar o IMC");
		}
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}
	
	
}
