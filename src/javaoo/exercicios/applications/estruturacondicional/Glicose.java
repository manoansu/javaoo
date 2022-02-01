package javaoo.exercicios.applications.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu 
 * Fazer um programa para ler a quantidade de glicose
 * no sangue de uma pessoa e depois mostrar na tela a
 * classificação desta glicose de acordo com a tabela de
 * referência ao lado.
 * 
 * Classificação 	Glicose
 * Normal 			Até 100 mg/dl
 * Elevado
 * 					Maior que 100 até
 * 					140 mg/dl
 * Diabetes 		Maior de 140 mg/
 */
public class Glicose {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double glicose;

	    System.out.print("Digite a medida da glicose: ");
	    glicose = sc.nextDouble();

	    System.out.print("Classificacao: ");

	    if (glicose <= 100) {
	    	System.out.println("normal");
	    }
	    else if (glicose <= 140) {
	    	System.out.println("elevado");
	    }
	    else {
	    	System.out.println("diabetes");
	    }

		sc.close();
	}

}
