package javaoo.exercicios.applications.classes;

import java.util.Locale;
import java.util.Scanner;

import javaoo.exercicios.utils.CurrencyConverter;

public class ProgramCurrencyConverter {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o pre�o do d�lar? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("Quantos d�lares ser�o comprados? ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		System.out.printf("Valor a ser pago em reais = %.2f%n", result);
		
		sc.close();
		}	
}
