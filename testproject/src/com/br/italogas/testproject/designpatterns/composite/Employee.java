package com.br.italogas.testproject.designpatterns.composite;

import java.util.ArrayList;

public class Employee {

	private String name;
	private String dept;
	private int salary;
	private ArrayList<Employee> subordinates;

	public Employee(String name, String dept, int salary) {
		// TODO Auto-generated constructor stub
		this.setName(name);
		this.setDept(dept);
		this.setSalary(salary);
		this.subordinates = new ArrayList<Employee>();
	}
	
	public void add(Employee emp){
		subordinates.add(emp);
	}
	
	public void remove(Employee emp){
		subordinates.remove(emp);
	}
	
	public ArrayList<Employee> getSubordinates(){
		return subordinates;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee: [ Name : " + getName() + ", dept.: " + getDept() + ", salary: " + getSalary() + " ]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
