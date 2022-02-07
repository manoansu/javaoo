package javaoo.exercicios.applications.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import javaoo.exercicios.entities.EmployeeLambda;

/**
 * 
 * @author manoansu
 * 
 * Fazer um programa para ler os dados (nome, email e sal�rio)
 * de funcion�rios a partir de um arquivo em formato .csv.
 * Em seguida mostrar, em ordem alfab�tica, o email dos
 * funcion�rios cujo sal�rio seja superior a um dado valor
 * fornecido pelo usu�rio.
 * Mostrar tamb�m a soma dos sal�rios dos funcion�rios cujo
 * nome come�a com a letra 'M'.
 * 
 * Input file
 * Maria,maria@gmail.com,3200.00
 * Alex,alex@gmail.com,1900.00
 * Marco,marco@gmail.com,1700.00
 * Bob,bob@gmail.com,3500.00
 * Anna,anna@gmail.com,2800.00
 * 
 * Execution:
 * 
 * Enter full file path: c:\temp\in.txt
 * Enter salary: 2000.00
 * Email of people whose salary is more than 2000.00:
 * anna@gmail.com
 * bob@gmail.com
 * maria@gmail.com
 * Sum of salary of people whose name starts with 'M': 4900.00
 *
 */
public class MainEmployeeLambda {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<EmployeeLambda> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new EmployeeLambda(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			
			List<String> emails = list.stream()
					.filter(x -> x.getSalary() > salary)
					.map(x -> x.getEmail())
					.sorted()
					.collect(Collectors.toList());

			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
