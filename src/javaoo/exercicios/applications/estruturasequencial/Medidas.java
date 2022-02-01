package javaoo.exercicios.applications.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author manoansu
 * Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados
 * com quatro casas decimais):
 * a) a área do quadrado que tem lado A
 * b) a área do triângulo retângulo que base A e altura B
 * c) a área do trapézio que tem bases A e B, e altura C
 *
 */
public class Medidas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, quadrado, triangulo, trapezio;

	    System.out.print("Digite a medida A: ");
	    a = sc.nextDouble();

	    System.out.print("Digite a medida B: ");
	    b = sc.nextDouble();

	    System.out.print("Digite a medida C: ");
	    c = sc.nextDouble();


	    quadrado = a * a;
	    System.out.printf("AREA DO QUADRADO = %.4f\n", quadrado);

	    triangulo = (a * b) / 2;
	    System.out.printf("AREA DO TRIANGULO = %.4f\n", triangulo);

	    trapezio = ((a + b) * c) / 2;
	    System.out.printf("AREA DO TRAPEZIO = %.4f\n", trapezio);
		
		sc.close();
	}
}
