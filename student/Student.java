package org.student;
import org.department.*;
public class Student extends Department{
	public static void studentName(){
		System.out.println("Student Name : Anitha ");
	}
	public static void studentDept(){
		System.out.println("Student Department : CSE ");
	}
	public static void studentId(){
		System.out.println("Student ID : 432156");
	}
	public static void main(String[] args) {
		Department objDepartment = new Department();
		objDepartment.collegeName();
		objDepartment.collegeCode();
		objDepartment.collegeRank();
		objDepartment.deptName();
		studentName();
		studentDept();
		studentId();
	}
}
