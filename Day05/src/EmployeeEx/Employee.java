package EmployeeEx;

public class Employee {
	private String name;
	private int age;
	private String address;
	private String department;
	private int salary;

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(String department) {
//		this.department = department;
//	}
//
//	public int getSalary() {
//		return salary;
//	}
//
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}

	Employee(String name, int age, String address, String department, int salary) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.department = department;
		this.salary = salary;
	}

	public void printInfo() {
		System.out.println("�� �� : " + name);
		System.out.println("�� �� : " + age);
		System.out.println("�� �� : " + address);
		System.out.println("�� �� : " + department);
		System.out.println("�� �� : " + salary + "����");
	}

}
