package oops_1;

public class Test_Students {

	public static void main(String[] args) {

		School school = new School();
		school.name = "Test School";
		school.fee = 1000;
		school.exam_fee_Paid(200);
		System.out.println(school.fee);

		/* create object of student class */

		Students stu = new Students();
		stu.name = "Akshay";
		stu.address = "1806, south avenue california";

		school.student = stu;
		System.out.println(school.student.address);
		System.out.println(school.student.name);

		School school1 = new School();
		school1.name = "Test school 2 ";
		school1.fee = 1200;

		school1.student = new Students();
		school1.student.address = "1702, west court, usa";
		school1.student.name = "jack adams";

		System.out.println(school1.student.address);
		System.out.println(school1.student.name);

		Students stu2 = new Students();
		stu2.fee_Deposit();
		stu2.fee_Not_Deposit();

		// static method can access only static methods and static variables

		school.getFee().fee_Deposit();
		school.getFee().fee_Not_Deposit();

	}

}
