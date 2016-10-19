package stud;

import fact.Faculty;
public class Student{
	public static void main(String args[]){
		Faculty F = new Faculty();
		
		System.out.println("Roll No 10 Marks : " + F.getStudentMarks(10));
		System.out.println("TEST VAL : "+ F.test);
	}
}