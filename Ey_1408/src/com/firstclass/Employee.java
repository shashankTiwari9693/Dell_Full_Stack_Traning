package com.firstclass;

public class Employee {
 int empid;
 String empName;
 String designation;
 double salary;
 
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public static void main(String[] args) {
	Employee emp = new Employee();
	
	emp.setEmpid(123);
	emp.setEmpName("Shashank");
	emp.setDesignation("Employee");
	emp.setSalary(120000);
	
	System.out.println(emp.getEmpName());
	System.out.println(emp.getEmpid());
	System.out.println(emp.getDesignation());
	System.out.println(emp.getSalary());
}




}
 
