package oops1.Staticandnonstatic;

public class Company {

	public static void main(String[] args) {

		Non_Static_Department d = new Non_Static_Department();
		Non_Static_Department d1 = new Non_Static_Department();

		d.dept_Name = "Telecom dept";
		d.dept_id = 10;
		d.no_of_employee = 200;
		Non_Static_Department.companyname = "Testxperts";

		d.add_Department();
		d.change_Department();
		Non_Static_Department.holidays();

		System.out.println("department name is :- " + Non_Static_Department.companyname);

		System.out.println("department name is :- " + d.dept_Name);

		System.out.println("department id is :- " + d.dept_id);

		System.out.println("department  employee is :- " + d.no_of_employee);

		System.out.println("_________________________________  ");
		System.out.println("");

		d1.dept_Name = "sales dept";
		d1.dept_id = 11;
		d1.no_of_employee = 400;
		Non_Static_Department.companyname = "TestxpertsNew";

		d1.add_Department();
		d1.change_Department();
		Non_Static_Department.holidays();
		System.out.println("department name is :- " + Non_Static_Department.companyname);

		System.out.println("department name is :- " + d1.dept_Name);

		System.out.println("department id is :- " + d1.dept_id);

		System.out.println("department  employee is :- " + d1.no_of_employee);
	}

}
