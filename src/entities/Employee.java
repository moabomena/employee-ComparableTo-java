package entities;

public class Employee implements Comparable<Employee>{

	private String name;
	private Double salary;
	private int index;
	
	public Employee(int  index, String name, Double salary) {
		this.name = name;
		this.salary = salary;
		this.index = index;
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
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public int compareTo(Employee other) {
		return name.compareTo(other.getName());
	}
	
	
	
}
