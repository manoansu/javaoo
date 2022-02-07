package javaoo.exercicios.applications.classes;

import java.util.ArrayList;
import java.util.List;

import javaoo.exercicios.entities.Product;
import javaoo.exercicios.services.ProductFilteredServiceLambda;

/**
 * 
 * @author manoansu
 * 
 * Fazer um programa que, a partir de uma lista de produtos, calcule a
 * soma dos preços somente dos produtos cujo nome começa com "T".
 *
 */
public class MainSomaPrecoLambda {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductFilteredServiceLambda ps = new ProductFilteredServiceLambda();
		
		double sum = ps.filtered(list, p -> p.getName().charAt(0) == 'T');
		
		System.out.println("Sum = " + String.format("%.2f", sum));
		
		
	}

}
