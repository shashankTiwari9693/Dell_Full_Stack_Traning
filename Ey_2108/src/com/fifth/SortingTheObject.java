package com.fifth;

import java.util.Arrays;
import java.util.Comparator;

class Employee implements Comparable<Employee> {
	private int empid;
	private String ename;
	private int empSalary;
	private int empAge;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public Employee(int empid, String ename, int empSalary, int empAge) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.empSalary = empSalary;
		this.empAge = empAge;
	}

	public String toString() {
		return "id us" + this.empid + "ename us" + this.ename + "Age us" + this.empSalary + "empSalary us";
	}

	@Override
	public int compareTo(Employee o) {

		return this.empid - o.empid;
	}

	public static Comparator<Employee> ageComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub

			return o1.getEmpAge() - o2.getEmpAge();
		}
	};
	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub

			return o1.getEname().compareTo(o2.getEname());
		}
	};

	public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub

			return o1.getEmpSalary() - o2.getEmpSalary();
		}
	};

}

public class SortingTheObject {
	public static void main(String[] args) {
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(123, "A", 25, 5000);
		empArr[1] = new Employee(132, "B", 25, 5000);
		empArr[2] = new Employee(130, "C", 25, 5000);
		empArr[3] = new Employee(13, "D", 25, 50780);
		Arrays.sort(empArr);
		System.out.println(Arrays.toString(empArr));

		Arrays.sort(empArr);
		System.out.println("Sorted emp array is" + Arrays.toString(empArr));
		Arrays.sort(empArr, Employee.nameComparator);

		System.out.println("Sorted emp Array - name is " + Arrays.toString(empArr));
		Arrays.sort(empArr, Employee.ageComparator);

		System.out.println("Sorted emp Array - age is " + Arrays.toString(empArr));

		Arrays.sort(empArr, Employee.salaryComparator);

		System.out.println("Sorted emp Array - salary is " + Arrays.toString(empArr));

	}

}
