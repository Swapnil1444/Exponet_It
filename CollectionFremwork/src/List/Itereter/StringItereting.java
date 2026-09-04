package List.Itereter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringItereting {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("hww");
		list.add("hhhk");

		System.out.println("--------for each loop---------");
		for (String object : list) {
			System.out.println(object);
		}

		System.out.println("--------Iteretar---------");

		Iterator<String> irt = list.iterator();

		while (irt.hasNext()) {
			System.out.println(irt.next());
		}

	}

}
