package javaoo.entities;

/**
 * 
 * @author manoansu 
 * Fazer um programa para ler os dados de um produto em estoque (nome, pre�o e
 * quantidade no estoque). Em seguida:
 * � Mostrar os dados do produto (nome, pre�o, quantidade no estoque, valor total no estoque)
 * � Realizar uma entrada no estoque e mostrar novamente os dados do produto
 * � Realizar uma sa�da no estoque e mostrar novamente os dados do produto
 *
 */
public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
