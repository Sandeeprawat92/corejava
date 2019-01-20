package oops1.Constructor;

public class Student {

	String name;
	int age;
	int roll_No;

	/*
	 * Properties of constructor 1. no return type 2.call automatically 3.same
	 * name as class name
	 */

	public Student() {
		System.out.println("Adding student record");
	}

	public Student(String name, int age, int roll_No) {
		this.name = name; // this refer to the global variables.
		this.age = age;
		this.roll_No = roll_No;
	}

	public static void main(String[] args) {

		// we need to create mutiple objects for creating gstudent data....
		Student s = new Student();
		s.name = "Tom";
		s.age = 20;
		s.roll_No = 1;

		Student s1 = new Student();
		s1.name = "Harry";
		s1.age = 19;
		s1.roll_No = 3;

		Student s2 = new Student("Mike", 21, 2);
		System.out.println("argument constructor name " + s2.name);
		System.out.println("argument constructor name " + s2.age);
		System.out.println("argument constructor name " + s2.roll_No);
	}

}
