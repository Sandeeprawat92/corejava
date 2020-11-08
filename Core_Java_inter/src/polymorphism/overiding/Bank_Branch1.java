package polymorphism.overiding;

public class Bank_Branch1 extends Bank {

	/* we only use overriding when parent not fulfill the requirement of child */

	public static void main(String[] args) {
		Bank_Branch1 b1 = new Bank_Branch1();
		System.out.println(b1.intrestRateOnHome());
	}

	@Override
	public double intrestRateOnCar() {
		return 8.0;
	}

}
