package exceptions_handeling;

public class Finally_block {

	public static void main(String[] args) {
		final int x = 100; // any value that value can't be changed
		// x = 200;

		// always use throwable class in selenium super class for error and exception

		try {
			int i = 10 / 0;
			System.out.println(i);
		} catch (Throwable t) {
			System.out.println(t.getLocalizedMessage());
			System.out.println("Error Occured");

		} finally {
			System.out.println("always print");
		}

	}

}
