package javaoo.exercicios.applications.classes;

import java.util.ArrayList;
import java.util.List;

import javaoo.exercicios.entities.Product;

/**
 * Utilizamos aqui
 * "method references"
 * Operador ::
 * Sintaxe:
 * Classe::m�todo
 */
public class MainMethodLambda {

	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		list.sort(MainMethodLambda::compareProducts);
		
		list.forEach(System.out::println);
	}
}
