package oops_1;

public class School {

	String name;
	int fee;
	Students student; // Also use class as a variable.

	public int exam_fee_Paid(int fee_paid) {
		fee = fee + fee_paid;
		return fee;
	}

	public Students getFee() {

		return student;
	}

}
