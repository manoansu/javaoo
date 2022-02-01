package javaoo.exercicios.applications.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author manoansu 
 * Uma empresa vai conceder um aumento percentual de
 * sal�rio aos seus funcion�rios dependendo de quanto
 * cada pessoa ganha, conforme tabela ao lado. Fazer um
 * programa para ler o sal�rio de uma pessoa, da� mostrar
 * qual o novo sal�rio desta pessoa depois do aumento,
 * quanto foi o aumento e qual foi a porcentagem de
 * aumento.
 * Sal�rio atual 				Aumento
 * 	At� R$ 1000.00 				 20%
 *	Acima de R$ 1000.00			 15%
 *  at� R$ 3000.00 				 
 *  Acima de R$ 3000.00			 10%
 *  at� R$ 8000.00
 *  Acima de R$ 8000.00 		 5%
 */
public class Aumento {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, novosalario, aumento;
	    int porcentagem;

	    System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();

	    if (salario <= 1000.0) {
	        porcentagem = 20;
	        aumento = salario * porcentagem / 100;
	        novosalario = salario + aumento;
	    }
	    else if (salario <= 3000.0) {
	        porcentagem = 15;
	        aumento = salario * porcentagem / 100;
	        novosalario = salario + aumento;
	    }
	    else if (salario <= 8000.0) {
	        porcentagem = 10;
	        aumento = salario * porcentagem / 100;
	        novosalario = salario + aumento;
	    }
	    else {
	        porcentagem = 5;
	        aumento = salario * porcentagem / 100;
	        novosalario = salario + aumento;
	    }

		System.out.printf("Novo salario = R$ %.2f\n", novosalario);
		System.out.printf("Aumento = R$ %.2f\n", aumento);
		System.out.printf("Porcentagem = %d %%\n", porcentagem);

		sc.close();
	}

}
