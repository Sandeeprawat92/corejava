package polymorphism.overiding;

public class Bank_Branch2 extends Bank {

	public static void main(String[] args) {
		Bank_Branch2 bb2 = new Bank_Branch2();
		System.out.println(bb2.intrestRateOnHome());
		System.out.println(bb2.intrestRateOnCar());

	}

	/*
	 * we can't change the return type while performing overriding No - when the
	 * return type is primitive yes - if yes = when we return class name/covariant
	 * covariant = the return type are class name and there is parent child
	 * relationship between those classes
	 */ @Override
	public double intrestRateOnCar() {
		return 7.0;
	}

	public Bank_Branch2 getobject() {
		Bank_Branch2 bb2 = new Bank_Branch2();
		return bb2;
	}

	// Number class is parent class of all wrapper class

	public Integer show() {
		return 10;

	}

	/*
	 * public Number show() { return 10;
	 * 
	 * }
	 */

}
// plymorphic reference
// webdriver driver = new firefoxDriver()

/* we cannot save reference of child class in to parent class */
