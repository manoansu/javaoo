package javaoo.exercicios.applications.classes;

import javaoo.exercicios.entities.AbstractShape;
import javaoo.exercicios.entities.CircleInterface;
import javaoo.exercicios.entities.RectangleInterface;
import javaoo.exercicios.enums.Color;

public class MainShapInterface {

	public static void main(String[] args) {

		AbstractShape s1 = new CircleInterface(Color.BLACK, 2.0);
		AbstractShape s2 = new RectangleInterface(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}
}
