package exceptionHandel;

public class FinallyBlock {

	public static void main(String[] args) {

		final int x = 200;

		try {
			// Db connection
			// execute queries
			// validate comparing
			// closing connection

			int[] i = new int[4];
			i[5] = 100;

			System.out.println("Close the db connection in try block ");

		} catch (Exception e) {
			System.out.println("Error Occured");

		} finally {
			System.out.println("Closing the db connection in finally block");
		}

	}

}
