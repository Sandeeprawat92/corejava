package oops_1;

public class Department {

	// non static variable

	public String dept_name;

	public String dept_id;

	public int no_of_emp;

	// global static variable

	public static String companyName;

	/* Non static mehtods */

	public void add_department() {
		System.out.println("department added ");
	}

	public void change_department() {
		System.out.println("department changed");
	}

	// Static method
	public static void holiday() {

		System.out.println("Holiday is on sunday.");

	}

}
