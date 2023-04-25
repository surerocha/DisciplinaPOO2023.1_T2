package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double pre, valor_adic = 0, imposto = 0, pre_custo = 0, desconto, novo_pre;
        String tipo, refrig;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preço: ");
        pre = sc.nextDouble();
        System.out.println("Digite o tipo: " + "\nA-Alimentação" + "\nL-Limpeza" + "\nV-Vestuário");
        tipo = sc.next();
        System.out.println("Digite a necessidade de refrigeração : " + "\nS-Precisa de refrigeração"
                + "\nN-Não precisa de refrigeração");
        refrig = sc.next();

        if (refrig.equals("N")) {
            if (tipo.equals("A")) {
                if (pre < 15) {
                    valor_adic = 2;
                } else {
                    valor_adic = 5;
                }
            } else if (tipo.equals("L")) {
                if (pre < 10) {
                    valor_adic = 1.50;
                } else {
                    valor_adic = 2.50;
                }
            } else if (tipo.equals("V")) {
                if (pre < 30) {
                    valor_adic = 3;
                } else {
                    valor_adic = 2.5;
                }
            }

        } else if (refrig.equals("S")) {
            if (tipo.equals("A")) {
                valor_adic = 8;
                System.out.println("Valor adicionado: " + valor_adic);
            } else if (tipo.equals("L") || tipo.equals("V")) {
                valor_adic = 0;
                System.out.println("Valor adicionado: " + valor_adic);
            }
        }

        if (pre < 25) {
            imposto = 0.05 * pre;
        } else {
            imposto = 0.08 * pre;
        }
        pre_custo = pre + imposto;
        System.out.println("O preço de custo: " + pre_custo);

        if (tipo.equals("A") && refrig.equals("N")) {
            desconto = 0.03 * pre_custo;
        } else {
            desconto = 0;
        }
        System.out.println("Desconto: " + desconto);
        novo_pre = pre_custo + valor_adic - desconto;
        System.out.println("Novo preço: " + novo_pre);
        if (novo_pre <= 50) {
            System.out.println("BARATO");
        } else if (novo_pre < 100) {
            System.out.println("NORMAL");
        } else {
            System.out.println("CARO");
        }
    }

}

	

