package javaoo.exercicios.applications.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author manoansu
 * Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do
 * círculo com três casas decimais. A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟􀬶. Você pode
 * usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use
 * diretamente o valor 3.14159.
 *
 */
public class Circulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r, area;

	    System.out.print("Digite o valor do raio do circulo: ");
	    r = sc.nextDouble();

	    area = 3.14159 * r * r;

	    System.out.printf("AREA = %.3f\n", area);
		
		
		sc.close();
	}
}
