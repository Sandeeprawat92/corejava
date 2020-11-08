package polymorphism.overiding;

public class Child extends Parent {

	public void show() {

	}

	public void display() {

	}

	public static void main(String[] args) {
		Child c = new Child();
		c.show();
		c.display();
		c.add(); // method hiding

		Parent c1 = new Child(); // we cannot call method of child class if we are giving poly reference.
		/*
		 * thats why we create all method in parent and then call then override them in
		 * child
		 */
		c1.show();
		c1.add(); // method hiding/static method 
	} 

	public static void add() {
		System.out.println("add from child");
	}
	// can we change access modifier in overriding....!!!!
	/*
	 * yes but can't change the visibility
	 */
}
