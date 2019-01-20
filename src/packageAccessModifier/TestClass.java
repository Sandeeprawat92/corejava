package packageAccessModifier;

import packageAccessModifiers.Teacher.*;

public class TestClass {

	public static void main(String[] args) {

		TeacherLogin teacher = new TeacherLogin();
		teacher.teacherLogin();
		teacher.name = "Test";

		TeacherSubject subject = new TeacherSubject();
		subject.subject = "selenium";

	}

}
