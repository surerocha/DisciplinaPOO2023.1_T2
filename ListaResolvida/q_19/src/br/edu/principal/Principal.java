package br.edu.principal;

import java.util.Scanner;

public class Principal {

public static void main(String[] args) {
	double altura, peso;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite sua altura: ");
	altura=sc.nextDouble();
	
	System.out.println("Digite seu peso: ");
	peso=sc.nextDouble();
	
	if (altura<1.20) {
		if (peso<=60) 
			System.out.println("Você pertence ao grupo A");
		
		if ((peso>60) && (peso<=90)) 
			System.out.println("Você pertence ao grupo D");
		
		if (peso > 90) 
			System.out.println("Você pertence ao grupo G");
	}
	
	if ((altura>=1.20)&&(altura<=1.70)) {
		if (peso<=60) 
			System.out.println("Você pertence ao grupo B");
		
		if ((peso>60) && (peso<=90)) 
			System.out.println("Você pertence ao grupo E");
		
		if (peso > 90) 
			System.out.println("Você pertence ao grupo H");
	}
	if (altura>1.70) {
		if (peso<=60) 
			System.out.println("Você pertence ao grupo C");
		
		if ((peso>60) && (peso<=90)) 
			System.out.println("F");
		
		if (peso > 90) 
			System.out.println("I");
	}
}
}
