package javaoo.exercicios.entities;

/**
 * 
 * @author manoansu Fazer um programa para ler os dados de um funcion�rio (nome,
 *         sal�rio bruto e imposto). Em seguida, mostrar os dados do funcion�rio
 *         (nome e sal�rio l�quido). Em seguida, aumentar o sal�rio do
 *         funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto
 *         � afetado pela porcentagem) e mostrar novamente os dados do
 *         funcion�rio. Use a classe projetada ao lado.
 * 
 *         Nome: Joao Silva Sal�rio bruto: 6000.00 Imposto: 1000.00 Funcion�rio:
 *         Joao Silva, $ 5000.00 Qual a porcentagem para aumentar o sal�rio?
 *         10.0 Dados atualizados: Joao Silva, $ 5600.00
 *
 */
public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
