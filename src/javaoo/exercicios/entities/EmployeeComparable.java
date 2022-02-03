package javaoo.exercicios.entities;

public class EmployeeComparable implements Comparable<EmployeeComparable>{

	private String name;
	private Double salary;

	public EmployeeComparable(String name, Double salary) {
	this.name = name;
	this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(EmployeeComparable other) {
		return name.compareTo(other.getName());
	}

}
