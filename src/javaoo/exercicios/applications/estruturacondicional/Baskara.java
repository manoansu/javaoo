package javaoo.exercicios.applications.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu 
 * Fazer um programa para ler os tr�s coeficientes de uma equa��o do segundo grau. Usando a f�rmula
 * de Baskara, calcular e mostrar os valores das ra�zes x1 e x2 da equa��o com quatro casas decimais,
 * conforme exemplo. Se a equa��o n�o possuir ra�zes reais, mostrar uma mensagem.
 */
public class Baskara {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b,c,x1,x2;

	    System.out.print("Coeficiente a: ");
	    a = sc.nextDouble();

	    System.out.print("Coeficiente b: ");
	    b = sc.nextDouble();
	    
	    System.out.print("Coeficiente c: ");
	    c = sc.nextDouble();

	    x1 =  -b + Math.sqrt(b * b - 4 * a * c) / 2 * a;
	    
	    x2 = -b - Math.sqrt(b * b - 4 * a * c) / 2 * a;
	    
	    if(x1 < 0 && x2 < 0) {
	    	System.out.println("Esta equacao nao possui raizes reais\n");
	    }else {
	    	System.out.printf("X1 = %.3f\n", x1);
		    System.out.printf("X2 = %.3f\n", x2);
	    }
		sc.close();
	}

}
