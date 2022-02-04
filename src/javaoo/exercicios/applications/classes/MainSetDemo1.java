package javaoo.exercicios.applications.classes;

import java.util.HashSet;
import java.util.Set;

public class MainSetDemo1 {

	public static void main(String[] args) {
		
		Set<String> listSet = new HashSet<String>();
		
		listSet.add("TV");
		listSet.add("Notebook");
		listSet.add("Tablet");
		
		System.out.println(listSet.contains("Notebook"));
		
		for(String obj : listSet) {
			System.out.println(obj);
		}
	}
}
