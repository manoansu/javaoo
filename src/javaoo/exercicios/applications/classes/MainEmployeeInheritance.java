package javaoo.exercicios.applications.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javaoo.exercicios.entities.EmployeeInheritance;
import javaoo.exercicios.entities.OutsourcedInheritanceEmployee;
/**
 * 
 * @author manoansu
 * Uma empresa possui funcion�rios pr�prios e terceirizados.
Para cada funcion�rio, deseja-se registrar nome, horas
trabalhadas e valor por hora. Funcion�rios terceirizado
possuem ainda uma despesa adicional.

O pagamento dos funcion�rios corresponde ao valor da hora
multiplicado pelas horas trabalhadas, sendo que os
funcion�rios terceirizados ainda recebem um b�nus
correspondente a 110% de sua despesa adicional.

Fazer um programa para ler os dados de N funcion�rios (N
fornecido pelo usu�rio) e armazen�-los em uma lista. Depois
de ler todos os dados, mostrar nome e pagamento de cada
funcion�rio na mesma ordem em que foram digitados.
Enter the number of employees: 3
Employee #1 data:
Outsourced (y/n)? n
Name: Alex
Hours: 50
Value per hour: 20.00
Employee #2 data:
Outsourced (y/n)? y
Name: Bob
Hours: 100
Value per hour: 15.00
Additional charge: 200.00
Employee #3 data:
Outsourced (y/n)? n
Name: Maria
Hours: 60
Value per hour: 20.00
PAYMENTS:
Alex - $ 1000.00
Bob - $ 1720.00
Maria - $ 1200.00
 *
 */

public class MainEmployeeInheritance {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<EmployeeInheritance> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedInheritanceEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				list.add(new EmployeeInheritance(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (EmployeeInheritance emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}
}
