package javaoo.exercicios.utils;

import java.util.function.Function;

import javaoo.exercicios.entities.Product;

public class UpperCaseName implements Function<Product, String>{

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}

}
