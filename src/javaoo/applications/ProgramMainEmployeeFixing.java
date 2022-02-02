package javaoo.applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javaoo.entities.EmployeeFixing;

/**
 * 
 * @author manoansu
 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de
N funcion�rios. N�o deve haver repeti��o de id.
Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma
mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada dos funcion�rios,
conforme exemplos.
Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio possa
ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
aumento por porcentagem dada.
 * How many employees will be registered? 3
Emplyoee #1:
Id: 333
Name: Maria Brown
Salary: 4000.00
Emplyoee #2:
Id: 536
Name: Alex Grey
Salary: 3000.00
Emplyoee #3:
Id: 772
Name: Bob Green
Salary: 5000.00
Enter the employee id that will have salary increase : 536
Enter the percentage: 10.0
List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3300.00
772, Bob Green, 5000.00
 *
 */
public class ProgramMainEmployeeFixing {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<EmployeeFixing> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new EmployeeFixing(id, name, salary));
		}

		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		EmployeeFixing emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		
		System.out.println();
		System.out.println("List of employees:");
		for (EmployeeFixing obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 
	}
	
	public static boolean hasId(List<EmployeeFixing> list, int id) {
		EmployeeFixing emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
