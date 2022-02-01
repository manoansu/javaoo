package javaoo.exercicios.applications.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu 
 * Fazer um programa para ler tr�s n�meros inteiros. Em
 * seguida, mostrar qual o menor dentre os tr�s n�meros lidos. Em caso
 * de empate, mostrar apenas uma vez.
 */
public class MenorDeTres {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a, b, c, menor;

		System.out.print("Primeiro valor: ");
		a = sc.nextInt();

		System.out.print("Segundo valor: ");
		b = sc.nextInt();

		System.out.print("Terceiro valor: ");
		c = sc.nextInt();

		if (a < b && a < c) {
			menor = a;
		} else if (b < c) {
			menor = b;
		} else {
			menor = c;
		}

		System.out.printf("MENOR = %d\n", menor);
		sc.close();
	}

}
