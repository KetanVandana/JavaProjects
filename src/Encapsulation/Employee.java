package Encapsulation;

public class Employee {
	// POJO class - Plain Object Java Object
	private String name;
	private int empId;
	private double salary;
	private String address;
	String dept;
	
	public Employee() {
		System.out.println("Default constructor is called!");
	}
	
	public Employee(String name, int empId, double salary, String address, String dept) {
		System.out.println("Parameterized constructor is called!");
		this.name = name;
		this.empId = empId;
		this.salary = salary;
		this.address = address;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmpInfo() {
		return name+" "+empId+" "+salary+" "+dept+" "+address;
	}
	
}
