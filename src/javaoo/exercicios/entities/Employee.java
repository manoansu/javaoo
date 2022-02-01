package javaoo.exercicios.entities;

/**
 * 
 * @author manoansu Fazer um programa para ler os dados de um funcionário (nome,
 *         salário bruto e imposto). Em seguida, mostrar os dados do funcionário
 *         (nome e salário líquido). Em seguida, aumentar o salário do
 *         funcionário com base em uma porcentagem dada (somente o salário bruto
 *         é afetado pela porcentagem) e mostrar novamente os dados do
 *         funcionário. Use a classe projetada ao lado.
 * 
 *         Nome: Joao Silva Salário bruto: 6000.00 Imposto: 1000.00 Funcionário:
 *         Joao Silva, $ 5000.00 Qual a porcentagem para aumentar o salário?
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
