package javaoo.exercicios.applications.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainGenericCovarContravariancia {

	public static void main(String[] args) {
		
		List<Integer> myInt = Arrays.asList(1,2,3,4);
		List<Double> myDouble = Arrays.asList(3.14,6.28);
		List<Object> myObject = new ArrayList<Object>();
		
		copy(myInt, myObject);
		printList(myObject);
		
		copy(myDouble, myObject);
		printList(myObject);
	}


	/**
	 * Method: copy copia a lista de qq tipo para outro..
	 * @param source
	 * @param destiny
	 */
	private static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number: source) {
			destiny.add(number);
		}
	}
	
	/**
	 * printList generico que pode ser por qualquer tipo.. 
	 * @param list
	 */
	private static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj + "");
		}
		System.out.println();
	}
}
