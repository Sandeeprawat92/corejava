package polymorphism;

public class OverloadingExample {
	/* only works in the same class */

	public static void main(String[] args) {
		OverloadingExample o = new OverloadingExample();
		o.doLogin("admin", "123456");
		o.add(10, 20); // numeric arguments call first.

		// call explicitly numeric arguments method.
		byte b1 = 1;
		byte b2 = 2;
		o.add(b1, b2);
	}

	public void add(int a, int b) {
		System.out.println("add result " + (a + b));
	}

	public void add(byte a, byte b) {
		System.out.println("add result " + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println("add result" + a + b + c);
	}

	public void doLogin(String username, String Password) {
		System.out.println();
	}

	public void doLogin(int mobileNumber, String Password) {
		System.out.println();
	}

	/*
	 * public int add(int a, int b) { return 10; } overloading not possible if
	 * method have same name but return type is different
	 */

}