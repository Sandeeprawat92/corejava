package collections_Framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	/* keyvalue pair */

	// Header key

	// duplicate value is not allowed
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		// add value

		map.put("first_name", "Alex");
		map.put("Last_name", "pandit");
		map.put("Subject", "Testing");
		map.put("location", "USA");

		System.out.println(map);
		// case sensitive
		System.out.println(map.get("location"));
		System.out.println(map.size());

		Set<String> keys = map.keySet(); // keys are unique

		for (String key : keys) {
			System.out.println("key " + key + " value is " + map.get(key));
		}

	}

}
