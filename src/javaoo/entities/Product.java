package javaoo.entities;

/**
 * 
 * @author manoansu Fazer um programa para ler os dados de um produto em estoque
 *         (nome, preço e quantidade no estoque). Em seguida: • Mostrar os dados
 *         do produto (nome, preço, quantidade no estoque, valor total no
 *         estoque) • Realizar uma entrada no estoque e mostrar novamente os
 *         dados do produto • Realizar uma saída no estoque e mostrar novamente
 *         os dados do produto
 *
 */
public class Product {

	public String name;
	public double price;
	public int quantity;

	public Product() {
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

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
