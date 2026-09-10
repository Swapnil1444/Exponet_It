package List;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add(10);
		list.add("ram");
		list.add("jay");
		list.add(20);
		list.add(null);
		list.add(null);
		
		//System.out.println(list.get(7)); //indexOutOfBoundExption
		System.out.println(list.contains(20)); 
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.contains(20));
		
		list.remove(3);
		System.out.println(list);
		System.out.println(list.getFirst());
		
		System.out.println(list.indexOf(10));
		System.out.println(list.remove(list.indexOf(10)));
		
		
		ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(10);
        list1.remove(Integer.valueOf(10));

        System.out.println(list1);

	}

}
