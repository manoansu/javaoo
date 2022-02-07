package javaoo.exercicios.utils;

import java.util.function.Consumer;

import javaoo.exercicios.entities.Product;

public class PriceUpdate implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
		
	}

}
