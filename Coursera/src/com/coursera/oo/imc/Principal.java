package com.coursera.oo.imc;

public class Principal {
	public static void main(String[] args) {

		Paciente p1 = new Paciente(43.5,1.66); //15.78
		Paciente p2 = new Paciente(18.3,1.05); //16.59
		Paciente p3 = new Paciente(48.6,1.67); //17.42
		Paciente p4 = new Paciente(52.3,1.66); //18.97
		Paciente p5 = new Paciente(79.4,1.65); //29.16
		Paciente p6 = new Paciente(87.3,1.62); //33.26
		Paciente p7 = new Paciente(99.3,1.64); //36.91
		Paciente p8 = new Paciente(115.3,1.65); //42.35
		
		System.out.println("Diagnostico Paciente 1:");
		double resultadoP1 = p1.calcularIMC(p1.getPeso(), p1.getAltura());
		p1.diagnostico(resultadoP1);
		System.out.println(resultadoP1);
		
		System.out.println("\nDiagnostico Paciente 2:");
		double resultadoP2 = p2.calcularIMC(p2.getPeso(), p2.getAltura());
		p2.diagnostico(resultadoP2);
		System.out.println(resultadoP2);
		
		System.out.println("\nDiagnostico Paciente 3:");
		double resultadoP3 = p3.calcularIMC(p3.getPeso(), p3.getAltura());
		p3.diagnostico(resultadoP3);
		System.out.println(resultadoP3);
		
		System.out.println("\nDiagnostico Paciente 4:");
		double resultadoP4 = p4.calcularIMC(p4.getPeso(), p4.getAltura());
		p4.diagnostico(resultadoP4);
		System.out.println(resultadoP4);
		
		System.out.println("\nDiagnostico Paciente 5:");
		double resultadoP5 = p5.calcularIMC(p5.getPeso(), p5.getAltura());
		p5.diagnostico(resultadoP5);
		System.out.println(resultadoP5);
		
		System.out.println("\nDiagnostico Paciente 6:");
		double resultadoP6 = p6.calcularIMC(p6.getPeso(), p6.getAltura());
		p6.diagnostico(resultadoP6);
		System.out.println(resultadoP6);
		
		System.out.println("\nDiagnostico Paciente 7:");
		double resultadoP7 = p7.calcularIMC(p7.getPeso(), p7.getAltura());
		p7.diagnostico(resultadoP7);
		System.out.println(resultadoP7);
		
		System.out.println("\nDiagnostico Paciente 8:");
		double resultadoP8 = p8.calcularIMC(p8.getPeso(), p8.getAltura());
		p8.diagnostico(resultadoP8);
		System.out.println((resultadoP8));
	
	}
}
