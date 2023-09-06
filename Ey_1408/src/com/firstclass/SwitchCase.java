package com.firstclass;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grading('A');
		grading('B');
		grading('C');
		grading('D');
	}

static void grading(char grade) {
	int success;
	switch(grade) {
	case 'A':
		success=1;
		System.out.println("Excellent");
		break;
	case 'B':
	case 'C':
		success=0;
		System.out.println("Good Grade");
	default:
		success=-1;
	System.out.println("Unknow Grade");
	}
	passtheCourse(success);
		
}
static void passtheCourse(int success) {
	switch(success) {
	case 1:
		System.out.println("pass");
		break;
	case 0:
		System.out.println("re exam");
		break;
	case -1:
		System.out.println("fail");
		break;
	}
}
}

