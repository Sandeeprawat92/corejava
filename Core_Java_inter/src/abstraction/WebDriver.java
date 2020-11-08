package abstraction;

public abstract class WebDriver {

	/*
	 * abstract keyword with methods/function then it must be overridden in
	 * concreate class.
	 */
	/*
	 * can't create object of abstract class
	 */
	// concreate class = which can be initiate object can be created.

	/* what if child class not override all methods */
	/* so thats why we create abstract class */

	public abstract void Abstractclick();

	public abstract void AbstractsendKeys();

	public abstract void AbstractgetTitle();

	public abstract void AbstractcaptureScreenshot();

	public void click() {
				// bcoz there is no defination that is java stopped creating of an abstract class.!!!!!!
	}

	public void sendKeys() {

	}

	public void getTitle() {

	}

	public void captureScreenshot() {
		// how to call concreate method of abstract class
	}

	// abstract class can have all the method abstract/concreate or both

}
