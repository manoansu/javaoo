package javaoo.exercicios.applications.classes;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu 
 * Ler um inteiro N (máximo = 10) e uma matriz quadrada de ordem N
 * contendo números inteiros. Mostrar a soma dos elementos acima da
 * diagonal principal. Um exemplo de números acima da diagonal
 * principal é mostrado ao lado (no caso as células com fundo cinza).
 * 
 * 5 2 3 1
 * 8 2 4 5
 * 7 3 1 3
 * 9 12 9 5
 *
 *Qual a ordem da matriz? 4
Elemento [0,0]: 5
Elemento [0,1]: 2
Elemento [0,2]: 3
Elemento [0,3]: 1
Elemento [1,0]: 8
Elemento [1,1]: 2
Elemento [1,2]: 4
Elemento [1,3]: 5
Elemento [2,0]: 7
Elemento [2,1]: 3
Elemento [2,2]: 1
Elemento [2,3]: 3
Elemento [3,0]: 9
Elemento [3,1]: 12
Elemento [3,2]: 9
Elemento [3,3]: 5
SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = 18
 */
public class AcimaDiagonal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, somaAcima;

	    System.out.print("Qual a ordem da matriz? ");
	    n = sc.nextInt();

	    int[][] matriz = new int[n][n];

	    for (int i=0; i<n; i++) {
	        for (int j=0; j<n; j++) {
	        	System.out.printf("Elemento [%d,%d]: ", i, j);
	            matriz[i][j] = sc.nextInt();
	        }
	    }

		somaAcima = 0;
	    for (int i=0; i<n; i++) {
	        for (int j=0; j<n; j++) {
	            if (i < j) {
	                somaAcima = somaAcima + matriz[i][j];
	            }
	        }
	    }

	    System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d\n", somaAcima);
	    
		sc.close();
	}
}
