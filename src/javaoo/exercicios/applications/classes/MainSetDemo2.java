package javaoo.exercicios.applications.classes;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MainSetDemo2 {

	public static void main(String[] args) {
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
		Set<Integer> b = new TreeSet<Integer>(Arrays.asList(5,6,7,8,9,10));
		
		//uniao..
		Set<Integer> c = new TreeSet<Integer>(a);
		c.addAll(b); // uni�o: adiciona no conjunto os elementos do outro conjunto, sem repeti��o b..
		System.out.println("Uni�o: " + c);
		
		//Intersection..
		Set<Integer> d = new TreeSet<Integer>(a);
		d.retainAll(b); // interse��o: remove do conjunto os elementos n�o contitos em no b..
		System.out.println("Intersection: " + d);
		
		//difference..
		Set<Integer> e = new TreeSet<Integer>(a);
		e.removeAll(b); // diferen�a: remove do conjunto os elementos contidos em b..
		System.out.println("Difference: " + e);
	}
}
