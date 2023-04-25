package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double number1, number2, number3, multi;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		number1=sc.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		number2=sc.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		number3=sc.nextDouble();
		
		multi = number1 * number2 * number3;
		
		System.out.println("O resultado da multiplicação desses três números é "+multi);
	}

}
