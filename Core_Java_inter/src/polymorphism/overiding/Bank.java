package polymorphism.overiding;

public class Bank {

	/* overriding/ dynamic binding / latebinding/ run time poly */

	/*
	 * diff classes where (inheritance is applied). we have methods with have same
	 * signature
	 * 
	 */

	public double intrestRateOnCar() {
		return 8.5;
	}

	public double intrestRateOnHome() {
		return 10.5;
	}

	public Bank getobject() {
		Bank bank = new Bank();
		return bank;
	}

	public Number show() {
		return 10;

	}
}
