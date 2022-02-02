package javaoo.exercicios.applications.classes;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu 
 * Ler uma matriz quadrada de ordem N (máximo = 10), contendo números reais. Em seguida, fazer as
seguintes ações:
a) calcular e imprimir a soma de todos os elementos positivos da matriz.
b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
d) imprimir os elementos da diagonal principal da matriz.
e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir
a matriz alterada.

Qual a ordem da matriz? 3
Elemento [0,0]: 7.0
Elemento [0,1]: -8.0
Elemento [0,2]: 10.0
Elemento [1,0]: -2.0
Elemento [1,1]: 3.0
Elemento [1,2]: 5.0
Elemento [2,0]: 11.0
Elemento [2,1]: -15.0
Elemento [2,2]: 4.0
SOMA DOS POSITIVOS: 40.0
Escolha uma linha: 1
LINHA ESCOLHIDA: -2.0 3.0 5.0
Escolha uma coluna: 2
COLUNA ESCOLHIDA: 10.0 5.0 4.0
DIAGONAL PRINCIPAL: 7.0 3.0 4.0
MATRIZ ALTERADA:
7.0 64.0 10.0
4.0 3.0 5.0
11.0 225.0 4.0
 *
 */

public class MatrizGeral {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, indlinha, indcoluna;
	    double somapositivos;

	    System.out.print("Qual a ordem da matriz? ");
	    n = sc.nextInt();

	    double[][] matriz = new double[n][n];

	    for (int i=0; i<n; i++) {
	        for (int j=0; j<n; j++) {
	        	System.out.printf("Elemento [%d,%d]: ", i, j);
	            matriz[i][j] = sc.nextDouble();
	        }
	    }

	    somapositivos = 0;
	    for (int i=0; i<n; i++) {
	        for (int j=0; j<n; j++) {
	            if (matriz[i][j] > 0) {
	                somapositivos = somapositivos + matriz[i][j];
	            }
	        }
	    }

	    System.out.printf("\nSOMA DOS POSITIVOS: %.1f\n\n", somapositivos);

	    System.out.print("Escolha uma linha: ");
		indlinha = sc.nextInt();

		System.out.print("LINHA ESCOLHIDA: ");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f ", matriz[indlinha][i]);
	    }

	    System.out.printf("\n\nEscolha uma coluna: ");
		indcoluna = sc.nextInt();

		System.out.print("COLUNA ESCOLHIDA: ");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f ", matriz[i][indcoluna]);
	    }

	    System.out.printf("\n\nDIAGONAL PRINCIPAL: ");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f ", matriz[i][i]);
	    }

	    for (int i=0; i<n; i++) {
	        for (int j=0; j<n; j++) {
	            if (matriz[i][j] < 0) {
	                matriz[i][j] = Math.pow(matriz[i][j], 2);
	            }
	        }
	    }

		System.out.println("\n\nMATRIZ ALTERADA:");

	    for (int i=0; i<n; i++) {
	        for (int j=0; j<n; j++) {
	        	System.out.printf("%.1f ", matriz[i][j]);
	        }
			System.out.println();
	    }
		sc.close();
	}
}
