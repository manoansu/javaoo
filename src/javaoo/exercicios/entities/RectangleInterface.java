package javaoo.exercicios.entities;

import javaoo.exercicios.enums.Color;

public class RectangleInterface extends AbstractShape {

	private Double width;
	private Double height;

	public RectangleInterface(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
}
