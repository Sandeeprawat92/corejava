package abstraction;

public class TestClass {

	public static void main(String[] args) {
		WebDriver c = new ChildChrome();
		c.captureScreenshot();
		// with polymorphic reference you can only call the method of parent not of
		// child class 
	}

}
