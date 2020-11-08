package exceptions_handeling;

public class Exceptions {

	public static void main(String[] args) {
		System.out.println("Before try block");
		try {
			System.out.println("Begin");

			int i = 10 / 0;
			System.out.println(i);

		} catch (Throwable t) { // we can use exception e object as well in catch
			System.out.println(t.getLocalizedMessage());
			System.out.println("Error Occured");
		}

		System.out.println("End");
		System.out.println("After catch block");

	}

}
