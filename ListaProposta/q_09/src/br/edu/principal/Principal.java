package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double baseMenor, baseMaior, altura, areaTrapezio;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor da base menor? ");
		baseMenor=sc.nextDouble();
		
		System.out.println("Qual o valor da base maior? ");
		baseMaior=sc.nextDouble();
		
		System.out.println("Qual o valor da altura? ");
		altura=sc.nextDouble();
		
		areaTrapezio = ((baseMaior + baseMenor) * altura)/2;
		
		System.out.println("A área desse trapézio vale "+areaTrapezio);
	}

}
