package com.second;

public class EmployeeDataStatic {

	
	int empid;
	String empName;
	
	static String orgAddress="ABC XYZ";
	static void orgAddresssChange() {
		orgAddress="MNO PQR";
	}
	
	EmployeeDataStatic(int empid,String empName){
		this.empid=empid;
		this.empName=empName;
	}
	void display() {
	System.out.println(" Id of emp is "+ empid+" and name of emp is "+empName+" and orgAdd "+orgAddress);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDataStatic.orgAddresssChange();
		EmployeeDataStatic e1=new EmployeeDataStatic(123,"Shashank");

		EmployeeDataStatic e2=new EmployeeDataStatic(1232,"Ishwor");
e1.display();
e2.display();
	}

}
