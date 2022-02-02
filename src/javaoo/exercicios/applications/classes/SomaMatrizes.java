package javaoo.exercicios.applications.classes;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu
 * Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas
 * cada (M e N máximo = 10). Depois, gerar uma terceira matriz C onde cada elemento desta é a soma
 * dos elementos correspondentes das matrizes originais. Imprimir na tela a matriz gerada.
 * Quantas linhas vai ter cada matriz? 2
Quantas colunas vai ter cada matriz? 3
Digite os valores da matriz A:
Elemento [0,0]: 3
Elemento [0,1]: 5
Elemento [0,2]: 2
Elemento [1,0]: 4
Elemento [1,1]: 5
Elemento [1,2]: 1

Digite os valores da matriz B:
Elemento [0,0]: 2
Elemento [0,1]: 4
Elemento [0,2]: 5
Elemento [1,0]: 1
Elemento [1,1]: 8
Elemento [1,2]: 8
MATRIZ SOMA:
5 9 7
5 13 9
 */
public class SomaMatrizes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m, n;

		System.out.print("Quantas linhas vai ter cada matriz? ");
	    m = sc.nextInt();
	    System.out.print("Quantas colunas vai ter cada matriz? ");
	    n = sc.nextInt();

	    int[][] a = new int[m][n];
	    int[][] b = new int[m][n];
	    int[][] c = new int[m][n];

	    System.out.println("Digite os valores da matriz A:");

	    for (int i=0; i<m; i++) {
	        for (int j=0; j<n; j++) {
	        	System.out.printf("Elemento [%d,%d]: ", i, j);
	            a[i][j] = sc.nextInt();
	        }
	    }

	    System.out.println("\nDigite os valores da matriz B:");

	    for (int i=0; i<m; i++) {
	        for (int j=0; j<n; j++) {
	        	System.out.printf("Elemento [%d,%d]: ", i, j);
	            b[i][j] = sc.nextInt();
	        }
	    }

	    for (int i=0; i<m; i++) {
	        for (int j=0; j<n; j++) {
	            c[i][j] = a[i][j] + b[i][j];
	        }
	    }

	    System.out.println("\nMATRIZ SOMA:");

	    for (int i=0; i<m; i++) {
	        for (int j=0; j<n; j++) {
	        	System.out.printf("%d ", c[i][j]);
	        }
	        System.out.println();
	    }

	    
	    sc.close();
	}
}
