package javaoo.exercicios.entities;

import javaoo.exercicios.enums.Color;

public abstract class AbstractShape implements ShapeInterface {

	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
