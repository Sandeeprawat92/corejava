package constructors;

public class Students {
	/*
	 * when we create a object of any class with new keywords constructor are called
	 * constructor are similar as method but with the same class name. used to
	 * intilize the instance variables of an object
	 */

	/*
	 * Constructor property 1. Same as class name 2. No return type 3. intilize
	 * autonatically when object is created.
	 */

	String name;
	int age;
	int rollNo;

	public Students() {
		System.out.println("Adding student record");
	}

	// parameterized constructor

	public Students(String name, int age, int rollNo) {
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;// this.name = name.....! to refer global variable to local variable name
	}

	public static void main(String[] args) {
		Students s = new Students();
		s.name = "adam";
		s.age = 10;
		s.rollNo = 2;

		Students s1 = new Students();
		s1.name = "eve";
		s1.age = 11;
		s1.rollNo = 3;

		Students s2 = new Students("John", 12, 3); // overloading constructor
		System.out.println("Argumented constructor name = " + s2.name);
		System.out.println("Argumented constructor age = " + s2.age);
		System.out.println("Argumented constructor rollno = " + s2.rollNo);

	}

}
