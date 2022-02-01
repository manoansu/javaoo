package javaoo.exercicios.applications.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author manoansu
 * Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
*  casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
*  o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
*  duas casas decimais, conforme exemplo.
 *
 */
public class tereno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do tereno: ");
		double largura = sc.nextDouble();
		
		System.out.print("Digita o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		
		System.out.print("Digita o valor do metro quadrado: ");
		double metroQuadrado = sc.nextDouble();
		
		double areaTereno = largura * comprimento;
		
		double precoTereno = areaTereno * metroQuadrado;
		
		System.out.printf("Aria do  tereno = %.2f\n", areaTereno);
		
		System.out.printf("Preço do  tereno = %.2f\n", precoTereno);
		
		
		sc.close();
	}
}
