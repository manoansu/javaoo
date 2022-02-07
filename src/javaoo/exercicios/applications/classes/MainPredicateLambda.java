package javaoo.exercicios.applications.classes;

import java.util.ArrayList;
import java.util.List;

import javaoo.exercicios.entities.Product;

/**
 * 
 * @author manoansu
 * Fazer um programa que, a partir de uma lista de produtos, remova da
 * lista somente aqueles cujo preço mínimo seja 100.
 *
 */
public class MainPredicateLambda {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		System.out.println("********************************List before removed!###########################");
		
		list.forEach(System.out::println);
		
		list.removeIf(p -> p.getPrice() > 100.00);
		
		System.out.println("*************List after removed!************************");
		
		list.forEach(System.out::println);

	}
}
