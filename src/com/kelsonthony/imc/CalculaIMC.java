package com.kelsonthony.imc;

import java.util.Scanner;

public class CalculaIMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		double peso = entrada.nextDouble();
		System.out.println();
		System.out.println("Digite a altura: ");
		double altura = entrada.nextDouble();
		System.out.println();
		
		double imc = peso / (altura * altura);
		System.out.println("Seu IMC é: " + imc);
	}
}
