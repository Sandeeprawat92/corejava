package oops2.Inheritance;

public class MakeHonda extends Bike {

	public void TyreType() {
		System.out.println("The tyre are tubless type");
	}

	// overloading method object of make honda will call the method of its own
	// not of parent class
	
	//@overredin method
	public void startBike() {
		System.out.println("Self start the bike");
	}

}
