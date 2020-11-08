package packAccessModifiers.TestPackage;

import packAccessModifiers.subpackage.Teacher;

public class TestPackage {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.teacher_Login();
		t.name = "testteacher";
	}

}
