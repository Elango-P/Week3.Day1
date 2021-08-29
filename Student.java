package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name ELANGO ");
	}

	public void studentDept() {
		System.out.println("Student Department EEE");
	}

	public void studentId() {
		System.out.println("Student Id 0124");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();

		std.collegeCode();
		std.collegeNAme();
		std.collegeRank();
		std.DepartmentName();
		std.studentName();
		std.studentDept();
		std.studentId();

	}

}
