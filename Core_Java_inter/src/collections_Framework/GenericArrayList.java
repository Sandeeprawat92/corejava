package collections_Framework;

import java.util.List;
import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("123456");
		list.add(null); // can add in anywhere not a datatype

		String element = list.get(0);

	}
}
