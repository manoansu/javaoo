package javaoo.exercicios.applications.classes;

import java.util.Locale;
import java.util.Scanner;

import javaoo.exercicios.services.BrazilInterestService;
import javaoo.exercicios.services.InterestService;

/**
 * 
 * @author manoansu
 * 
 * Fazer um programa para ler uma quantia e a duração em meses de um
empréstimo. Informar o valor a ser pago depois de decorrido o prazo do
empréstimo, conforme regras de juros do Brasil. A regra de cálculo de
juros do Brasil é juro composto padrão de 2% ao mês.
 *
 *Amount: 200.00
Months: 3
Payment after 3 months:
212.24
 */
public class MainInterestService {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();

		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);

		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));

		sc.close();
	}
}
