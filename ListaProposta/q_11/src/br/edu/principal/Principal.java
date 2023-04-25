package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(" # Cálculo da área de um losango # ");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("\nDigite a medida da maior diagonal do losango: ");
		double d_maior = sc.nextDouble();

		System.out.println ("\nDigite a medida da menor diagonal do losango: ");
		double d_menor= sc.nextDouble();
		
		double area = (d_maior * d_menor) / 2;
		System.out.println("\nA área desse losango é igual a " + area); 
		}
     }
	