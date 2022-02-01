package javaoo.exercicios.applications.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu 
 * Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. Para
 * isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai ser
 * informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala com
 * duas casas decimais. A seguir é dada a fórmula para converter de Fahrenheit para Celsius (você deve
 * deduzir a fórmula de Celsius para Fahrenheit): ( 32)
 */
public class Temperatura {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char escala;
	    double celsius, fahrenheit;

	    System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
	    escala = sc.next().charAt(0);

	    if (escala == 'F') {
	    	System.out.print("Digite a temperatura em Fahrenheit: ");
			fahrenheit = sc.nextDouble();

	        celsius = 5.0 / 9.0 * (fahrenheit - 32.0);
	        System.out.printf("Temperatura equivalente em Celsius: %.2f\n", celsius);
	    }
	    else {
	    	System.out.print("Digite a temperatura em Celsius: ");
			celsius = sc.nextDouble();

	        fahrenheit = celsius * 9.0 / 5.0 + 32.0;
	        System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", fahrenheit);
	    }

		sc.close();
	}
}
