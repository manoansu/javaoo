package javaoo.exercicios.applications.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu 
 * Uma lanchonete possui vários produtos. Cada produto possui um código
 * e um preço. Você deve fazer um programa para ler o código e a
 * quantidade comprada de um produto (suponha um código válido), e daí
 * informar qual o valor a ser pago, com duas casas decimais, conforme
 * tabela de produtos ao lado.
 * 
	Código do
	produto 		Preço do produto
 * 	  1 				R$ 5.00
 * 	  2 				R$ 3.50
 * 	  3 				R$ 4.80
 *    4 				R$ 8.90
 *    5 				R$ 7.32
 */
public class Lanchonete {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, qtd;
	    double pagar;

	    System.out.print("Codigo do produto comprado: ");
	    codigo = sc.nextInt();

	    System.out.print("Quantidade comprada: ");
	    qtd = sc.nextInt();

	    pagar = 0;
	    if (codigo == 1) {
	        pagar = qtd * 5.00;
	    }
	    else if (codigo == 2) {
	        pagar = qtd * 3.50;
	    }
	    else if (codigo == 3) {
	        pagar = qtd * 4.80;
	    }
	    else if (codigo == 4) {
	        pagar = qtd * 8.90;
	    }
	    else if (codigo == 5) {
	        pagar = qtd * 7.32;
	    }

	    System.out.printf("Valor a pagar: R$ %.2f\n", pagar);
		sc.close();
	}

}
