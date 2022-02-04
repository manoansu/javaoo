package javaoo.exercicios.applications.classes;

import java.util.Scanner;

import javaoo.exercicios.devices.PrintServiceGeneric;

/**
 * 
 * @author manoansu
 * 
 * Deseja-se fazer um programa que leia uma quantidade N, e depois N números
inteiros. Ao final, imprima esses números de forma organizada conforme
exemplo. Em seguida, informar qual foi o primeiro valor informado.

How many values? 3     Criar um serviço de impressão:
10
8
23
[10, 8, 23]
First: 10
 *
 */
public class MainPrintServiceGeneric {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintServiceGeneric<Integer> ps = new PrintServiceGeneric<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);

		sc.close();
	}
}
