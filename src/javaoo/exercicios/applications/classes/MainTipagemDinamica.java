package javaoo.exercicios.applications.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javaoo.exercicios.entities.Product;

/**
 * Tipagem dinâmica / inferência de tipos
 * 
 * @author manoansu
 *
 */
public class MainTipagemDinamica {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		list.sort((p1, p2) -> p1.getPrice().compareTo(p2.getPrice()));

		list.forEach(System.out::println);

		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Integer sum = 0;
		// Normal for para acomular dados..
		for (Integer x : lista) {
			sum += x;
		}
		System.out.println("\nSUM = " + sum);
		
		sum = 0;
		// for no stream para acomular elemento..
		sum = lista.stream().reduce(0, Integer::sum);
		
		System.out.println("\nLambda SUM = " + sum);
	}
}
