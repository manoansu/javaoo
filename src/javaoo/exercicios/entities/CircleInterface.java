package javaoo.exercicios.entities;

import javaoo.exercicios.enums.Color;

public class CircleInterface extends AbstractShape {

	private Double radius;

	public CircleInterface(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
