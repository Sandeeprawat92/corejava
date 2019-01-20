package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {

		// set is a interface // hashset is a class

		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		Iterator<Integer> iterate = set.iterator();
		System.out.println(iterate.hasNext()); // returns values are there or
												// not.
		System.out.println(iterate.next());
		System.out.println(iterate.next());
		System.out.println(iterate.next());
		System.out.println(iterate.next());
		System.out.println(iterate.next());
		System.out.println(iterate.next());

		while (iterate.hasNext()) {
			System.out.println(iterate.next());
		}

	}

}
