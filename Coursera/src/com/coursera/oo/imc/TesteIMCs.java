package com.coursera.oo.imc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteIMCs {

	@Test
	void testeBaixoPesoMuitoGrave() {
		Paciente p = new Paciente(43.5,1.66);
		double resultadoPaciente = p.calcularIMC(p.getPeso(), p.getAltura());
		assertEquals(15.78, resultadoPaciente, Math.abs(15.78 - resultadoPaciente));
	}
	@Test
	void testeBaixoPesoGrave() {
		Paciente p = new Paciente(18.3,1.05);
		double resultadoPaciente = p.calcularIMC(p.getPeso(), p.getAltura());
		assertEquals(16.59, resultadoPaciente, Math.abs(16.59 - resultadoPaciente));
	}
	@Test
	void testeBaixoPeso() {
		Paciente p = new Paciente(48.6,1.67);
		double resultadoPaciente = p.calcularIMC(p.getPeso(), p.getAltura());
		assertEquals(17.42, resultadoPaciente, Math.abs(17.42 - resultadoPaciente));
	}
	@Test
	void testePesoNormal() {
		Paciente p = new Paciente(52.3,1.66);
		double resultadoPaciente = p.calcularIMC(p.getPeso(), p.getAltura());
		assertEquals(18.97, resultadoPaciente, Math.abs(18.97 - resultadoPaciente));
	}
	@Test
	void testeSobrepeso() {
		Paciente p = new Paciente(79.4,1.65);
		double resultadoPaciente = p.calcularIMC(p.getPeso(), p.getAltura());
		assertEquals(29.16, resultadoPaciente, Math.abs(29.16 - resultadoPaciente));
	}
	@Test
	void testeObesidadeI() {
		Paciente p = new Paciente(87.3,1.62);
		double resultadoPaciente = p.calcularIMC(p.getPeso(), p.getAltura());
		assertEquals(33.26, resultadoPaciente, Math.abs(33.26 - resultadoPaciente));
	}
	@Test
	void testeObesidadeII() {
		Paciente p = new Paciente(99.3,1.64);
		double resultadoPaciente = p.calcularIMC(p.getPeso(), p.getAltura());
		assertEquals(36.91, resultadoPaciente, Math.abs(36.91 - resultadoPaciente));
	}
	@Test
	void testeObesidadeIII() {
		Paciente p = new Paciente(115.3,1.65);
		double resultadoPaciente = p.calcularIMC(p.getPeso(), p.getAltura());
		assertEquals(42.35, resultadoPaciente, Math.abs(42.35 - resultadoPaciente));
	}
}