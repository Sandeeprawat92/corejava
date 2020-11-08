package collections_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	// list is interface array list is a class
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		System.out.println(list);
		System.out.println(list.size());
		list.add(10); // converting it to object....autoboxing
		list.add("test");
		list.add(12);// object as parameter so we can add any value into it.
		list.add(true);
		list.add(1.5);
		list.add("My list");
		list.add(true);
		list.add(1.5);
		list.add("My list");

		Object v = list.get(0);

		int in = (Integer) list.get(0); // type cast // what if again its value is changed.
		// We cant typecast everytime

		// genrics...!!11

		System.out.println("Get a particular index value " + list.get(2));
		System.out.println("Get the size of list " + list.size());
		// list.remove(0);// obj = new Integer();

		list.get(2);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

		System.out.println("loop finished now iterate vvalue with iterator");

		for (Object var : list)
			System.out.println(var);

		System.out.println("enhance for loop is done here");

		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
