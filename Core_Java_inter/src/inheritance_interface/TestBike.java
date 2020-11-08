package inheritance_interface;

public class TestBike {

	public static void main(String[] args) {
		Bike b = new Bike(); // parent /super class
		b.color = "silver";
		System.out.println(b.color);
		b.start_Bike();

		RoyalEnfield re = new RoyalEnfield();
		re.color = "Black";
		System.out.println(re.color);
		re.start_Bike(); // royal enfield
		re.tyreType();

		Bike b1 = new RoyalEnfield();
		b1.start_Bike(); // royal enfield
		b1.stop_Bike();

	}

}
