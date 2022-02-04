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
		c.addAll(b); // união: adiciona no conjunto os elementos do outro conjunto, sem repetição b..
		System.out.println("União: " + c);
		
		//Intersection..
		Set<Integer> d = new TreeSet<Integer>(a);
		d.retainAll(b); // interseção: remove do conjunto os elementos não contitos em no b..
		System.out.println("Intersection: " + d);
		
		//difference..
		Set<Integer> e = new TreeSet<Integer>(a);
		e.removeAll(b); // diferença: remove do conjunto os elementos contidos em b..
		System.out.println("Difference: " + e);
	}
}
