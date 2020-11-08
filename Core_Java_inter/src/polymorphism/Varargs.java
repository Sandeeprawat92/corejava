package polymorphism;

public class Varargs {

	public void addition(int... a) {

		// int var = a;

		int[] var = a;
	}

	public static void main(String[] args) {
		Varargs v = new Varargs();
		// v.addition(10, 10, 10, 10);

	}
}
