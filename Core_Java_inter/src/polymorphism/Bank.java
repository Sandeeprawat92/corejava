package polymorphism;

/*polymorphism = same name multiple form
 * type of poly:
 * 1.compile time /early binding/ static binding / overloading
 * 2.runtime / late binding/ dynamic binding /overriding
 * 
 * */

public class Bank {

	/*
	 * same method name with different signature method signature is a combination
	 * of method name and parameter
	 */

	public void getloan(String bankName) {

	}

	public void getloan(String bankName, int intrest) {
			
	}

}
