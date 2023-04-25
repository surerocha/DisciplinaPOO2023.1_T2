package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double PrecoAtual, ValorDesconto, NovoPreco;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o preço atual do produto: ");
		PrecoAtual=sc.nextDouble();
		
		System.out.println("O preço atual: "+PrecoAtual);
		
		if (PrecoAtual <= 30) {
			ValorDesconto = 0;
			NovoPreco = PrecoAtual;
			System.out.println("O valor do desconto: "+ValorDesconto);
			System.out.println("O novo preço: "+NovoPreco);
		}
		if ((PrecoAtual > 30) && (PrecoAtual <= 100)) {
			ValorDesconto = (10/100) * PrecoAtual;
			NovoPreco = PrecoAtual - ValorDesconto;
			System.out.println("O valor do desconto: "+ValorDesconto);
			System.out.println("O novo preço: "+NovoPreco);
		}
		if (PrecoAtual > 100) {
			ValorDesconto = (15/100) * PrecoAtual;
			NovoPreco = PrecoAtual - ValorDesconto;
			System.out.println("O valor do desconto: "+ValorDesconto);
			System.out.println("O novo preço: "+NovoPreco);
		}
		sc.close();
	}
}
