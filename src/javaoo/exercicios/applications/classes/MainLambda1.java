package javaoo.exercicios.applications.classes;

import java.util.ArrayList;
import java.util.List;

import javaoo.exercicios.entities.ProductLambda;

public class MainLambda1 {

	public static void main(String[] args) {

		List<ProductLambda> list = new ArrayList<>();

		list.add(new ProductLambda("TV", 900.00));
		list.add(new ProductLambda("Notebook", 1200.00));
		list.add(new ProductLambda("Tablet", 450.00));
		
		// ordenar ascendente o elemento da lista..
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(ProductLambda p : list) {
			System.out.println(p);
		}
	}
}
