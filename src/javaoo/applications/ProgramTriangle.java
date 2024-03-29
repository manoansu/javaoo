package javaoo.applications;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu
 * 
 * Fazer um programa para ler um valor num�rico qualquer, e da� mostrar
 * quanto seria o valor de uma circunfer�ncia e do volume de uma esfera
 * para um raio daquele valor. Informar tamb�m o valor de PI com duas
 * casas decimais.
 * 
 * Enter radius: 3.0
 * Circumference: 18.85
 * Volume: 113.10
 * PI value: 3.14
 *
 */
public class ProgramTriangle {

	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();
	}

	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
