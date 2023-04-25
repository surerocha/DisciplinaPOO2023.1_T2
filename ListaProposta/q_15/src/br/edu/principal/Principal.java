package br.edu.principal;
import java. util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double sal, conta1, conta2, RestoSal, SomaConta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do seu salário mensal: ");
		sal = sc.nextDouble();
		System.out.println("Digite o valor da primeira conta atrasada: ");
		conta1 = sc.nextDouble();
		System.out.println("Digite o valor da segunda conta atrasada: ");
		conta2 = sc.nextDouble();
		
		conta1 = conta1 + (conta1 * 0.02);
	    conta2 = conta2 + (conta2 * 0.02);
	    SomaConta = conta1 + conta2;
	    RestoSal = sal - SomaConta;
	    System.out.println("Valor que restará do salário: "+RestoSal);
	    sc.close();
	}
}