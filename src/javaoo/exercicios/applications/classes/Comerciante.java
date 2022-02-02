package javaoo.exercicios.applications.classes;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu
 * Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto,
 * mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de
 * venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias
 * proporcionaram:
 * lucro < 10%
 * 10% ≤ lucro ≤ 20%
 * lucro > 20%
 * Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como
 * o lucro total.
 * Serao digitados dados de quantos produtos? 4
Produto 1:
Nome: Feijao
Preco de compra: 10.00
Preco de venda: 11.00
Produto 2:
Nome: Arroz
Preco de compra: 12.00
Preco de venda: 12.80
Produto 3:
Nome: Oleo
Preco de compra: 5.00
Preco de venda: 5.70
Produto 4:
 *
 */
public class Comerciante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, abaixo, entre, acima;
	    double vtotalcompra, vtotalvenda, lucrototal;

	    System.out.print("Serao digitados dados de quantos produtos? ");
	    n = sc.nextInt();

	    String[] nomes = new String[n];
	    double[] pcompra = new double[n];
	    double[] pvenda = new double[n];
	    double[] porcentagemlucros = new double[n];

	    for (int i=0; i<n; i++) {
	    	System.out.printf("Produto %d:\n", i + 1);
	    	System.out.print("Nome: ");
	    	sc.nextLine();
	        nomes[i] = sc.nextLine();
	        System.out.print("Preco de compra: ");
	        pcompra[i] = sc.nextDouble();
	        System.out.print("Preco de venda: ");
	        pvenda[i] = sc.nextDouble();
	     }

	    for (int i=0; i<n; i++) {
	        porcentagemlucros[i] = (pvenda[i] - pcompra[i]) / pcompra[i] * 100.0;
	    }

	    abaixo = 0;
	    entre = 0;
	    acima = 0;

	    for (int i=0; i<n; i++) {
	        if (porcentagemlucros[i] < 10.0) {
	            abaixo++;
	        }
	        else if (porcentagemlucros[i] < 20.0) {
	            entre++;
	        }
	        else {
	            acima++;
	        }
	    }

	    vtotalcompra = 0;
	    vtotalvenda = 0;

	    for (int i=0; i<n; i++) {
	        vtotalcompra = vtotalcompra + pcompra[i];
	        vtotalvenda = vtotalvenda + pvenda[i];
	    }

	    lucrototal = vtotalvenda - vtotalcompra;

	    System.out.println("\nRELATORIO:");
	    System.out.printf("Lucro abaixo de 10%%: %d\n", abaixo);
	    System.out.printf("Lucro entre 10%% e 20%%: %d\n", entre);
	    System.out.printf("Lucro acima de 20%%: %d\n", acima);
	    System.out.printf("Valor total de compra: %.2f\n", vtotalcompra);
	    System.out.printf("Valor total de venda: %.2f\n", vtotalvenda);
	    System.out.printf("Lucro total: %.2f\n", lucrototal);
	    
	    sc.close();
	}
}
