package packAccessModifiers.subpackage;

public class Teacher { // default, public

	public String name;

	/*
	 * public
	 * 
	 * private- With in the current class
	 * 
	 * protected - same class/ same package/ subclass
	 * 
	 * default - only access current package
	 */

	public void teacher_Login() {
		System.out.println("teacherlogin");
	}

}
