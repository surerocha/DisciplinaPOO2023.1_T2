package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double tempCel, tempFa;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da temperatura em Celcius: ");
		tempCel=sc.nextDouble();
		
		tempFa=180 * (tempCel+32)/100;
		
		System.out.println("A temperatura em Fahrenheit fica "+tempFa);
		sc.close();
		
	}

}
