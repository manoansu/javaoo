package javaoo.exercicios.applications.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author manoansu
 * Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
* da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
 *
 */
public class Retangulo {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		System.out.print("Base de retangulo: ");
		base = sc.nextDouble();
		
		System.out.print("Altura do retangulo: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		
		perimetro = 2 * (base + altura);
		
		diagonal = Math.sqrt(base * base + altura * altura);
		
		System.out.printf("ARIA = %.4f\n", area);
		
		System.out.printf("PERIMETRO = %.4f\n", perimetro);
		
		System.out.printf("DIAGONAL = %.4f\n", diagonal);
		
		
		sc.close();
	}
}
