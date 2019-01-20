package collections;

import java.util.Hashtable;

public class TestHashtble {

	/*
	 * dynamically growing but differ from list and hashset //no index in
	 * hashtable Override if we change the value.
	 */

	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("name", "Mike jordan");
		ht.put("location", "Australia");
		ht.put("Company", "Infosys");

		System.out.println(ht.get("Company"));
		System.out.println(ht.get("location"));
		System.out.println(ht.get("name"));

	}

}
