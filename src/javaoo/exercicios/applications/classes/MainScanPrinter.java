package javaoo.exercicios.applications.classes;

import javaoo.exercicios.devices.ComboDevice;
import javaoo.exercicios.devices.ConcretePrinter;
import javaoo.exercicios.devices.ConcreteScanner;

public class MainScanPrinter {

	public static void main(String[] args) {

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");

		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());

		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
	}
}
