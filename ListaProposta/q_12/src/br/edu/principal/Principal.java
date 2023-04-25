package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salMinimo, salFuncionario, qntdSalario;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanto vale o salário mínimo? ");
		salMinimo=sc.nextDouble();
		
		System.out.println("Quanto vale o salário do funcionário? ");
		salFuncionario=sc.nextDouble();
		
		qntdSalario = salFuncionario / salMinimo;
		
		System.out.println("Esse funcionário ganha "+qntdSalario+" salários mínimos.");
	}

}
