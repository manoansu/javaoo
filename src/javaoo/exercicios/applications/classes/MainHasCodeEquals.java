package javaoo.exercicios.applications.classes;

public class MainHasCodeEquals {
	
	public static void main(String[] args) {
		
		String a = "Maria";
		String b = "Alex";
		
		System.out.println("Equals: " + a.equals(b) + "\n");
		
		System.out.println("Value of a: " + a.hashCode());
		System.out.println("Value of b: " + b.hashCode());
	}

}
