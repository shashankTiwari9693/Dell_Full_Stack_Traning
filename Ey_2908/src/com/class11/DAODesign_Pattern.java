package com.class11;

import java.util.ArrayList;
import java.util.List;

//Model Class

class Student {
	private String stu_name;
	private int stu_id;

	public Student(String stu_name, int stu_id) {
		// TODO Auto-generated constructor stub
		this.stu_name = stu_name;
		this.stu_id = stu_id;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
}

interface StudentDAO {
	public List<Student> getAlloStudent();

	public Student getStudent(int stu_id);

	public void updateStudent(Student student);

	public void deleteStudent(Student student);

	public Student[] getAllStudents();

}

class StudentDAOImp1 implements StudentDAO {
	List<Student> students;

	public StudentDAOImp1() {
		students = new ArrayList<>();
		Student stu1 = new Student("ABC", 123);
		Student stu2 = new Student("XYZ", 456);
		students.add(stu1);
		students.add(stu2);
	}

	@Override
	public List<Student> getAlloStudent() {

		return students;
	}

	@Override
	public Student getStudent(int stu_id) {

		return students.get(stu_id);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(0).setStu_name(student.getStu_name());

		System.out.println("Student with id " + student.getStu_id() + " is updated");
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getStu_id());
		System.out.println("student with id" + student.getStu_id() + "is removed");

	}

	@Override
	public Student[] getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}

public class DAODesign_Pattern {
	public static void main(String[] args) {
		StudentDAO studentDao = new StudentDAOImp1();
		for (Student st : studentDao.getAlloStudent()) {
			System.out.println("student [stu id" + st.getStu_id() + ",name :" + st.getStu_name() + "]");
		}
		Student firstStudent = studentDao.getAlloStudent().get(0);
		System.out.println("first student is" + firstStudent.getStu_id() + " " + firstStudent.getStu_name());
		firstStudent.setStu_name("PQR");
		for (Student st : studentDao.getAlloStudent()) {
			System.out.println("Student [Stu" + st.getStu_id() + ", Name:" + st.getStu_name() + "]");
		}

		Student firstStudentUpdatedData = studentDao.getAlloStudent().get(0);
		System.out.println("first student is" + firstStudent.getStu_id() + " " + firstStudent.getStu_name());
		firstStudentUpdatedData.setStu_name("MNO");

		studentDao.updateStudent(firstStudentUpdatedData);

		for (Student st : studentDao.getAllStudents()) {

			System.out.println("Student [ stu id " + st.getStu_id() + " , Name: " + st.getStu_name() + " ] ");

		}
	}
}
