package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int senha;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		senha=sc.nextInt();
		
		if (senha == 4531) {
			System.out.println("Acesso permitido.");
		}
		else {
			System.out.println("Acesso negado.");
		}
		sc.close();
	}

}
