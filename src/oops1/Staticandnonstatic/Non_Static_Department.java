package oops1.Staticandnonstatic;

public class Non_Static_Department {

	// Global non static variable
	public String dept_Name;
	public int dept_id;
	public int no_of_employee;
	public static String companyname;

	// Non static Methods
	public void add_Department() {
		System.out.println("Department added successfully");
	}

	public void change_Department() {
		System.out.println("Department changed   successfully");
	}

	public static void holidays() {
		System.out.println("National holidays granted");
	}

}
