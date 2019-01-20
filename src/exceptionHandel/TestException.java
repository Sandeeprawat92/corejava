package exceptionHandel;

public class TestException {

	public static void main(String[] args) {
		System.out.println("Before the try block");

		try {
			System.out.println("Beginning of the code");

			int divide = 10 / 0;
			System.out.println(divide);
			System.out.println("Ending the code");

		} catch (Exception e) {

			System.out.println("Error occurred");
			System.out.println(e.getMessage());
			// e.printStackTrace();

		}

		System.out.println("After the try block");
	}

}
