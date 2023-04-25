package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tipo,valorI,calct1,calct2;
		
		//PERGUNTANDO O TIPO DE INVESTIMENTO. 
			
		 Scanner sc = new Scanner (System.in);
			  
		      System.out.println("Digite o tipo de investimento desejado.");
			  System.out.println("\n# Digite: 1 para Poupança.");
			  System.out.println("\n# Digite: 2 para Fundos de renda fixa.");
			  tipo = sc.nextDouble();
		   
			 
		//PERGUNTANDO O VALOR DO INVESTIMENTO. 
		 
		      System.out.println("\nDigite o valor do seu investimento:");
		       valorI = sc.nextDouble();
		       
		   if (tipo==1) {
			   System.out.println("\nO valor do rendimento da Poupança é de 3%.");
			   calct1 = valorI * 0.3;
			   System.out.println("\nO valor corrigido do seu investimento é de:" + (calct1+valorI) );}
			   
		   else if  (tipo==2) {
				   System.out.println("\nO valor do rendimento dos Fundos de renda fixa é de 4%.");
				   calct2 = valorI * 0.4;
				   System.out.println("\nO valor corrigido do seu investimento é de: " + (calct2+valorI) );

					  
				   }

		
	}

}
