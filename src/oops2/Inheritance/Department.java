package oops2.Inheritance;

public class Department implements Employee { // implement keywords

	public static void main(String[] args) {
		// Employee e = new Employee(); cannot create a object of interface

		Employee e = new Department();
		e.HrPolicy();
		e.salary();

	}

	@Override
	public void salary() {
		System.out.println("Salary granted for this Month");
	}

	@Override
	public void HrPolicy() {
		System.out.println("HR policies applied");

	}

}
