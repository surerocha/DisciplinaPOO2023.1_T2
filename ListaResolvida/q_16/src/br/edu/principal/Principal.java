package br.edu.principal;

import java.util.Scanner;

public class Principal 

public static void main(String[] args) {
	
	double pre, novoPre = 0, venda;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Qual o pre�o atual do produto? ");
	pre=sc.nextDouble();
	
	System.out.println("Qual a venda mensal do produto? ");
	venda=sc.nextDouble();
	
	if ((venda<500) || (pre<30)) {
	novoPre=pre+(0.10*pre);
	System.out.println("O pre�o novo do produto �: "+ novoPre);
	}
	
	  if (((venda>=500) && (venda<1200)) || ((pre>=30) && (pre<80))) {
		novoPre = pre+(15/100*pre);
		System.out.println("O pre�o novo do produto �: "+novoPre);
		if ((venda>1200) || (pre>=80)) {
			novoPre= pre - (0.20*pre);
			System.out.println("O pre�o novo do produto �: "+novoPre);
		}
	  }
}