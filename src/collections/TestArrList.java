package collections;

import java.util.ArrayList;

public class TestArrList {

	/*
	 * Arraylist is a inbuild class in collection
	 */
	public static void main(String[] args) {

		ArrayList<String> mylist = new ArrayList<String>();

		mylist.add("first"); // 0
		mylist.add("second"); // 1
		mylist.add("Third");
		mylist.add("fourth");
		mylist.add("fifth");

		System.out.println(mylist.get(2));
		System.out.println(mylist.size());

		for (int i = 0; i < mylist.size(); i++) {
			System.out.println(mylist.get(i));
		}

	}

}
