package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double preco, categoria, NovoPreco, ValorAumento, ValorImposto;
        String situacao;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço: ");
        preco = sc.nextDouble();

        System.out.println("Digite a categoria (1, 2, 3): ");
        categoria = sc.nextDouble();

        System.out.println("Digite a situação (R e N): ");
        situacao = sc.next();

        if ((categoria == 2) || (situacao.equals("R"))) {
            ValorImposto = (5.0 / 100) * preco;
            System.out.println("Valor do imposto: " + ValorImposto);
        } else {
            ValorImposto = (8.0 / 100) * preco;
            System.out.println("Valor do imposto: " + ValorImposto);
        }

        if (preco <= 25) {
            if (categoria == 1) {
                ValorAumento = (5.0 / 100) * preco;
                System.out.println("Valor do aumento: " + ValorAumento);
                NovoPreco = preco + ValorAumento - ValorImposto;
                System.out.println("Valor do novo preço: " + NovoPreco);
                if (NovoPreco <= 50) {
                    System.out.println("Barato.");
                } else if ((NovoPreco > 50) && (NovoPreco < 120)) {
                    System.out.println("Normal.");
                } else {
                    System.out.println("Caro.");
                }
            } else if (categoria == 2) {
                ValorAumento = (8.0 / 100) * preco;
                System.out.println("Valor do aumento: " + ValorAumento);
                NovoPreco = preco + ValorAumento - ValorImposto;
                System.out.println("Valor do novo preço: " + NovoPreco);
                if (NovoPreco <= 50) {
                    System.out.println("Barato.");
                } else if ((NovoPreco > 50) && (NovoPreco < 120)) {
                    System.out.println("Normal.");
                } else {
                    System.out.println("Caro.");
                }
            } else if (categoria == 3) {
                ValorAumento = (10.0 / 100) * preco;
                System.out.println("Valor do aumento: " + ValorAumento);
                NovoPreco = preco + ValorAumento - ValorImposto;
                System.out.println("Valor do novo preço: " + NovoPreco);
                if (NovoPreco <= 50) {
                    System.out.println("Barato.");
                } else if ((NovoPreco > 50) && (NovoPreco < 120)) {
                    System.out.println("Normal.");
                } else {
                    System.out.println("Caro.");
                }
            }
        } else if (preco > 25) {
            if (categoria == 1) {
                ValorAumento = (12.0 / 100) * preco;
                System.out.println("Valor do aumento: " + ValorAumento);
                NovoPreco = preco + ValorAumento - ValorImposto;
                System.out.println("Valor do novo preço: " + NovoPreco);
                if (NovoPreco <= 50) {
                    System.out.println("Barato.");
                }
                else if ((NovoPreco > 50) && (NovoPreco < 120)) {
					System.out.println("Normal.");
				}
				else {
					System.out.println("Caro.");
				}
			}
			else if (categoria == 2) {
				ValorAumento = 0.15*preco;
				System.out.println("Valor do aumento: "+ValorAumento);
				NovoPreco = preco + ValorAumento - ValorImposto;
				System.out.println("Valor do novo preço: "+NovoPreco);
				if (NovoPreco <= 50) {
					System.out.println("Barato.");
				}
				else if ((NovoPreco > 50) && (NovoPreco < 120)) {
					System.out.println("Normal.");
				}
				else {				}
			}
			else if (categoria == 3) {
				ValorAumento = (18/100)*preco;
				System.out.println("Valor do aumento: "+ValorAumento);
				NovoPreco = preco + ValorAumento - ValorImposto;
				System.out.println("Valor do novo preço: "+NovoPreco);
				if (NovoPreco <= 50) {
					System.out.println("Barato.");
				}
				else if ((NovoPreco > 50) && (NovoPreco < 120)) {
					System.out.println("Normal.");
				}
				else {
					System.out.println("Caro.");
				}
			}
		}
		sc.close();  
	} 
}

