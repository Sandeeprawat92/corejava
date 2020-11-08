package polymorphism;

public class Ambiguity {

	public static void main(String[] args) {
		Ambiguity a = new Ambiguity();
		// ambiguity compiler get confused which needs to run bcoz both
		// have numeric value
		// a.add(10, 20);
	}

	public void add(int a, double b) {
		System.out.println();
	}

	public void add(double b, int a) {
		System.out.println();
	}

	/* we can create multiple main method but signature should be different */

}
