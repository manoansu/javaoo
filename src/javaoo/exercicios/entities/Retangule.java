package javaoo.exercicios.entities;

/**
 * 
 * @author manoansu 
 * Fazer um programa para ler os valores da largura e altura de
 * um retângulo. Em seguida, mostrar na tela o valor de sua área,
 * perímetro e diagonal. Usar uma classe como mostrado no projeto ao
 *         lado.
 * Entre com a largura e altura do retângulo:
 * 3.00
 * 4.00
 * AREA = 12.00
 * PERIMETRO = 14.00
 * DIAGONAL = 5.00
 *
 */
public class Retangule {

	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (width + height);
	}

	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}

}
