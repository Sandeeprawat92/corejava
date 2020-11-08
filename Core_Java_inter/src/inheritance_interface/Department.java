package inheritance_interface;

public class Department implements Employee {

	public static void main(String[] args) {
		Employee e = new Department();
		e.policy();
		e.salary();
	}

	@Override
	public void salary() {
		System.out.println("Salary granted");

	}

	@Override
	public void policy() {
		System.out.println("policy applied");

	}

};
