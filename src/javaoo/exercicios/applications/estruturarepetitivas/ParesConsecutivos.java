package javaoo.exercicios.applications.estruturarepetitivas;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu
 * O programa deve ler um valor inteiro X indefinidas vezes. (O programa ir� parar quando o valor de X
 * for igual a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X,
 * se for par. Se o valor de entrada for 4, por exemplo, a sa�da deve ser 40, que � o resultado da opera��o:
 * 4+6+8+10+12, enquanto que se o valor de entrada for 11, por exemplo, a sa�da deve ser 80, que � a
 * soma de 12+14+16+18+20.
 *
 */
public class ParesConsecutivos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, soma;

	    System.out.print("Digite um numero inteiro: ");
	    x = sc.nextInt();

	    while (x != 0) {
	        if (x % 2 != 0) {
	            x++;
	        }

	        soma = 5 * x + 20;
	        System.out.printf("SOMA = %d\n", soma);

	        System.out.print("Digite um numero inteiro: ");
			x = sc.nextInt();
	    }
		sc.close();
	}
}
