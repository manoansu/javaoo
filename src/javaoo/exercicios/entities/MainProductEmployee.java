package javaoo.exercicios.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javaoo.exercicios.services.CalculationService;

/**
 * 
 * @author manoansu
 * 
 * Uma empresa de consultoria deseja avaliar a performance de produtos,
funcionários, dentre outras coisas. Um dos cálculos que ela precisa é encontrar
o maior dentre um conjunto de elementos. Fazer um programa que leia um
conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
mostre o mais caro deles.
 *
 *Computer,890.50
IPhone X,910.00
Tablet,550.00
Most expensive:
IPhone, 910.00
 */
public class MainProductEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		List<ProductGeneric> list = new ArrayList<>();

		String path = "C:\\Developement\\DeveSuperior\\Java OO\\Curso Orientaçao objeto\\javaoo\\inProductGeneric.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new ProductGeneric(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			ProductGeneric x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
	}
}
