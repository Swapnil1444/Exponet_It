package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {

		System.out.println("-------HashMap----------");
		// add uniqely
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "10");
		map.put(2, "20");
		map.put(3, "30");
		map.put(4, "40");
		map.put(5, "10");
		map.put(6, null);
		map.put(null, null);

		System.out.println(map);
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("10"));
		System.out.println(map.get(99)); // null

		System.out.println("----------get data using KeySet()----");

		Set<Integer> set = map.keySet();
		System.out.println(set);

		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			Integer k = itr.next();
			System.out.println(k + " " + map.get(k));
		}

		for (Integer i : set) {
			System.out.println(i + " " + map.get(i));
		}

		System.out.println("----------Using Map.Entry() ----------");

		Set<Map.Entry<Integer, String>> set1 = map.entrySet();

		Iterator<Map.Entry<Integer, String>> itr1 = set1.iterator();
		while(itr1.hasNext()) {
			Map.Entry<Integer, String> entry =itr1.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

		// System.out.println(map.put(null, null));//retuen the value

		map.put(4, "90");
		System.out.println(map);

		System.out.println("------LindedHashMap---------");
		// follow insertion ordar
		Map<Integer, String> map1 = new LinkedHashMap<Integer, String>();
		map1.put(1, "swapnil");
		map1.put(20, "raj");
		map1.put(2, "om");
		map1.put(19, "jay");

		System.out.println(map1);

		System.out.println("----------TreeMap--------");
		// sort key asending order
		Map<Integer, String> map2 = new TreeMap<Integer, String>();
		map2.put(1, "swapnil");
		map2.put(20, "raj");
		map2.put(2, "om");
		map2.put(19, "jay");

		System.out.println(map2);

	}

}
