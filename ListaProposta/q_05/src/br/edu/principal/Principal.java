package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double preço, preçoFinal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço do produto: ");
		preço=sc.nextDouble();
		
		preçoFinal = preço - (preço * 10/100);
		
		System.out.println("O preço com o desconto de 10% fica "+preçoFinal+" reais.");
	}

}
