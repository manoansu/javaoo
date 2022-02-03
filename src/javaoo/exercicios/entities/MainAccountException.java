package javaoo.exercicios.entities;

import java.util.Locale;
import java.util.Scanner;

import javaoo.exercicios.entities.excepitons.BusinessException;

/**
 * 
 * @author manoansu
 * 
 * Fazer um programa para ler os dados de uma conta banc�ria e depois realizar um
saque nesta conta banc�ria, mostrando o novo saldo. Um saque n�o pode ocorrer
ou se n�o houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta. Implemente a conta banc�ria conforme projeto abaixo:
 *
 *Enter account data
Number: 8021
Holder: Bob Brown
Initial balance: 500.00
Withdraw limit: 300.00
Enter amount for withdraw:

 */
public class MainAccountException {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados da conta");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();

		AccountException acc = new AccountException(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
