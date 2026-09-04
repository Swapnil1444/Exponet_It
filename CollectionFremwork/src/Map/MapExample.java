package Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		Map< Integer, String > map=new HashMap<Integer, String>();
		
		map.put(1, "10");
		map.put(2, "20");
		map.put(3, "30");
		map.put(4, "40");
		map.put(5, "10");
		map.put(6,null);
		map.put(null, null);
		
		
		System.out.println(map);
		System.out.println(map.put(null, null));//retuen the value
		
		
		

	}

}
