package javaoo.exercicios.entities;

import java.util.Comparator;

public class MyLambdaComparator implements Comparator<ProductLambda>{

	@Override
	public int compare(ProductLambda p1, ProductLambda p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
