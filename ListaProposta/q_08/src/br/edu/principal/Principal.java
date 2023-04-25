package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(" # Conversão do peso de Kg para g # ");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("\nDigite seu peso em Kg (quilogramas): ");
		double pkg = sc.nextDouble();
		
		double pg = pkg*1000;
		System.out.println("\nSeu peso em gramas é igual a: " + pg + "g");
		}
    }

