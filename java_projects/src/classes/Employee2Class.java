package classes;

public class Employee2Class {
	
	private int id;
	private String name;
	private Double salary;
	
	public Employee2Class(int id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;	
	}
	
	public int getId() {
		return id;
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
	
	public  void Percentage(double percentage) {
		salary += salary * (percentage / 100);
	}
}
