package javaoo.exercicios.applications.classes;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu
 * Ler um inteiro N e uma matriz quadrada de ordem N (máximo = 10). Mostrar qual o maior elemento
 * de cada linha. Suponha não haver empates.
 *
Qual a ordem da matriz? 4
Elemento [0,0]: 5
Elemento [0,1]: -3
Elemento [0,2]: 10
Elemento [0,3]: 8
Elemento [1,0]: 15
Elemento [1,1]: 8
Elemento [1,2]: 2
Elemento [1,3]: 10
Elemento [2,0]: 7
Elemento [2,1]: 9
Elemento [2,2]: -4
Elemento [2,3]: 3
Elemento [3,0]: 8
Elemento [3,1]: -7
Elemento [3,2]: 4
Elemento [3,3]: 13

MAIOR ELEMENTO DE CADA LINHA:
10
15
9
13
*/

public class CadaLinha {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, maior;

	    System.out.print("Qual a ordem da matriz? ");
	    n = sc.nextInt();
	
	    int[][] matriz = new int[n][n];
	    int[] maiorLinha = new int[n];
	
	    for (int i=0; i<n; i++) {
	        for (int j=0; j<n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
	            matriz[i][j] = sc.nextInt();
	        }
	    }
	
	    for (int i=0; i<n; i++) {
	        maior = matriz[i][0];
	        for (int j=1; j<n; j++) {
	            if (maior < matriz[i][j]) {
	                maior = matriz[i][j];
	            }
	        }
	        maiorLinha[i] = maior;
	    }
	
	    System.out.println("\nMAIOR ELEMENTO DE CADA LINHA:");
	
	    for (int i=0; i<n; i++) {
			System.out.printf("%d\n", maiorLinha[i]);
	    }

	    sc.close();
	}
}
