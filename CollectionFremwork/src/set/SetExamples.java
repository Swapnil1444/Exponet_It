package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {

		// set not get method
		// hashset
		// no dubliction //null value allow one
		Set<String> set1 = new HashSet<String>();
		set1.add("swapnil");
		set1.add("jay");
		set1.add("ram");
		set1.add("kajal");
		set1.add("swapnil");
		set1.add("Swapnil");
		set1.add(null);
		set1.add(null);
		
      // System.out.println( set1.contains("ram")); //

		System.out.println(set1);

		// linkedhashSet
		// no dubliction + insertion order follow //single null
		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("swapnil");
		set2.add("jay");
		set2.add("ram");
		set2.add("kajal");
		set2.add("swapnil");
		set2.add("Swapnil");
		set2.add(null);
		set2.add(null);

		System.out.println(set2);

		// tree set
		// no dubliction + not null +sorting :aseding ordar
		Set<String> set3 = new TreeSet<String>();
		set3.add("swapnil");
		set3.add("jay");
		set3.add("ram");
		set3.add("kajal");
		set3.add("swapnil");
		set3.add("Swapnil");
//		set3.add(null);
//		set3.add(null);//nullpointerexption

		System.out.println(set3);

	}

}
