package javaoo.exercicios.services;

import java.util.List;
import java.util.function.Predicate;

import javaoo.exercicios.entities.Product;

public class ProductFilteredServiceLambda {

	public double filtered(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}

}
