package collections_Framework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {

		// allow unique value/
		HashSet set = new HashSet();

		HashSet<Integer> gset = new HashSet<>();

		gset.add(1);
		gset.add(2);
		gset.add(3);
		gset.add(4);
		gset.add(5);
		gset.add(6);
		gset.add(7);
		gset.add(8);
		gset.add(9);
		gset.add(10);
		gset.add(1);

		System.out.println(gset);

		/* unordered list */

		HashSet<String> str = new HashSet<>();
		str.add("Test");
		str.add("one");
		str.add("two");
		str.add("three");
		str.add("four");
		str.add("five");
		str.add("Test");
		System.out.println(str);

		for (String var : str) {
			System.out.println(var);
		}

		Iterator<String> it = str.iterator();

		while (it.hasNext()) {
			String var = it.next();
			if (var.equals("four")) {
				System.out.println("from iteratr " + var);
			}
		}
	}

}
