package exceptionHandel;

public class ArrayException {

	public static void main(String[] args) {

		System.out.println("Beginng");

		try {
			int[] i = new int[4];
			i[5] = 100;
		} catch (Exception e) {
			System.out.println("error occurred");
			e.printStackTrace();

		}
		System.out.println("Ending ");
	}

}
