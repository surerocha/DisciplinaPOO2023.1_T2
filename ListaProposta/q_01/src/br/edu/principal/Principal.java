package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	
	System.out.println(" # Cálculo da subtração de dois números # ");
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println ("\nDigite o primeiro número da operação (minuendo): ");
	double num1 = sc.nextDouble();
	
	System.out.println ("\nDigite o segundo némero da operação (substraendo): ");
	double num2 = sc.nextDouble();
	
	double resultado = num1 - num2;
	System.out.println("\nO resultado da subtraçãp de" + num1 + "por" + num2 + "é igual a: " + resultado );
	}

}
