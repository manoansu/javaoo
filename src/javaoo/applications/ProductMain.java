package javaoo.applications;

import java.util.Locale;
import java.util.Scanner;

import javaoo.entities.Product;

/**
 * 
 * @author manoansu
 * Enter product data:
 * Name: TV
 * Price: 900.00
 * Quantity in stock: 10
 * Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
 * Enter the number of products to be added in stock: 5
 * Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00
 * Enter the number of products to be removed from stock: 3
 * Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00
 */
public class ProductMain {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		product = new Product(product.name, product.price, product.quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);

		sc.close();
	}
}
