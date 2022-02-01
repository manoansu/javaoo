package javaoo.exercicios.applications.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author manoansu
 * Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a
 * quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com
 * uma mensagem explicativa, conforme exemplo.
 *
 */
public class Pagamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
	    double valor, pagamento;
	    int horas;

	    System.out.print("Nome: ");
	    nome = sc.nextLine();

	    System.out.print("Valor por hora: ");
		valor = sc.nextDouble();

		System.out.print("Horas trabalhadas: ");
	    horas = sc.nextInt();
	    
	    pagamento = valor * horas;

	    System.out.printf("O pagamento para %s deve ser %.2f\n", nome, pagamento);

		
		
		sc.close();
	}
}
