package javaoo.exercicios.applications.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu 
 * Uma lanchonete possui v�rios produtos. Cada produto possui um c�digo
 * e um pre�o. Voc� deve fazer um programa para ler o c�digo e a
 * quantidade comprada de um produto (suponha um c�digo v�lido), e da�
 * informar qual o valor a ser pago, com duas casas decimais, conforme
 * tabela de produtos ao lado.
 * 
	C�digo do
	produto 		Pre�o do produto
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
