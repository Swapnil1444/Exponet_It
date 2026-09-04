package List.Itereter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteretarExample {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("hello");
		list.add(123);
		list.add(false);

		System.out.println("--------for each loop---------");
		for (Object object : list) {
			System.out.println(object);
		}

		System.out.println("--------Iteretar---------");

		Iterator irt = list.iterator();

		while (irt.hasNext()) {
			System.out.println(irt.next());
		}

	}
}