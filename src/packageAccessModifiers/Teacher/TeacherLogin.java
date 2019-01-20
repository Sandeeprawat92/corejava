package packageAccessModifiers.Teacher;

public class TeacherLogin {

	public String name;
	
	/*
	 * default - accessed only used in currunt package
	 * public - anywhere inside any package/ class
	 * private
	 * protected
	 * 
	 */

	public void teacherLogin() {
		System.out.println("Teacher Login");
	}

}
