package oops_1;

public class Company {

	public static void main(String[] args) {

		Department d = new Department();
		Department d1 = new Department();

		/* d can access all the non static methods and variable of dept class */

		d.dept_id = "1";
		d.dept_name = "devops";
		d.no_of_emp = 4;

		d.add_department();
		d.change_department();

		System.out.println("department_id_is " + d.dept_id);
		System.out.println("department_name_is " + d.dept_name);
		System.out.println("no_of_emplyee " + d.no_of_emp);

		d1.dept_id = "2";
		d1.dept_name = "development";
		d1.no_of_emp = 20;

		d1.add_department();
		d1.change_department();

		System.out.println("department_id_is " + d1.dept_id);
		System.out.println("department_name_is " + d1.dept_name);
		System.out.println("no_of_emplyee " + d1.no_of_emp);

		/* calling static method and var */

		Department.companyName = "My company";
		System.out.println("Company name is " + Department.companyName);

		Department.holiday();
	}

}
