package javaoo.exercicios.applications.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


import javaoo.exercicios.entities.Account;
import javaoo.exercicios.entities.BusinessAccount;
import javaoo.exercicios.entities.SavingsAccount;

/**
 * 
 * @author manoansu
 * Suponha que em um neg�cio relacionado a banco, apenas
contas poupan�a e contas para empresas s�o permitidas.
N�o existe conta comum.
Para garantir que contas comuns n�o possam ser
instanciadas, basta acrescentarmos a palavra "abstract" na
declara��o da classe.
 *
 */
public class MainAccount {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}
