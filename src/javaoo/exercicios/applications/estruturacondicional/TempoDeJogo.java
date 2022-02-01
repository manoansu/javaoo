package javaoo.exercicios.applications.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu 
 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo
 * pode come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24
 * horas.
 */
public class TempoDeJogo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int hinicial, hfinal;

		System.out.print("Hora inicial: ");
	    hinicial = sc.nextInt();

	    System.out.print("Hora final: ");
	    hfinal = sc.nextInt();

	    if (hinicial < hfinal) {
	    	System.out.printf("O JOGO DUROU %d HORA(S)\n", hfinal - hinicial);
	    }
	    else {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", 24 - (hinicial - hfinal));
	    }
		sc.close();
	}

}
