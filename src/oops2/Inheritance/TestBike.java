package oops2.Inheritance;

public class TestBike {

	public static void main(String[] args) {

		Bike b = new Bike();
		b.color = "black";
		b.startBike(); // parent/super class

		// child class object

		MakeHonda m = new MakeHonda();
		m.color = "Blue";
		m.startBike(); // make honda class
		m.TyreType();

		Bike b1 = new MakeHonda();
		b1.startBike(); // overriden method will call of chid class
		b1.stopBike(); // call from super/parent class

	}

}
