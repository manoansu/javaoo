package javaoo.exercicios.utils;

import java.util.function.Predicate;

import javaoo.exercicios.entities.Product;

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product t) {
		return t.getPrice() >= 100;
	}

}
