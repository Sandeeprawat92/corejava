package collections;

import java.util.Hashtable;

public class TestHashtable1 {

	public static void main(String[] args) {

		Hashtable<String, String> tb = new Hashtable<String, String>();
		tb.put("Course1", "Selenium");
		tb.put("Course2", "QTP");

		Hashtable<String, String> tb1 = new Hashtable<String, String>();
		tb1.put("Location1", "USA");
		tb1.put("Location2", "Australia");

		Hashtable<String, Hashtable<String, String>> tb2 = new Hashtable<String, Hashtable<String, String>>();
		tb2.put("College", tb);
		tb2.put("COuntry",tb1);

		System.out.println(tb2.get("College").get("Course1"));
		System.out.println(tb2.get("COuntry").get("Location2"));
	}

}
