package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		
		// CALCULO DA MÉDIA ARTIMÉTICA 
		
		double nota1;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		
		nota1 = sc.nextDouble();
		
	    double nota2;
		
		System.out.println("Digite a segunda nota: ");
		
		nota2 = sc.nextDouble();
		
		double media;
		media = (nota1 + nota2)/2;
		
		if (( media >= 0) && (media < 4)){
			System.out.println("Sua média aritmética foi: " + media + " Você foi REPROVADO, sinto muito.");}
			
		else if ((4 <= media) && (media < 7)) {
			System.out.println("Sua média aritmética foi: " + media+ " Você terá que realizar um EXAME.");}
			
		else if ((7 <= media) && (media <= 10)) {
			System.out.println("Sua média aritmética foi: " + media+ " Você foi APROVADO, parabéns!");}
		
		
			else {
				System.out.println("Sua média aritmética foi: " + media + ". Não é possível indicar sua situação, pois sua média não está dentro do intervalo de notas análisadas." + "\nUm erro foi detectado, por favor digite suas notas novamente!");}
 
	
			}
}

