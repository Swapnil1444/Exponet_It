package projectSet.world;

import java.util.Set;

public class WorldMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ServiseClass s = new ServiseClass();
		Set<Set<Set<String>>> world = s.getCounty();
		System.out.println(world);
		
		System.out.println("-----Using Itereter-------");
		
		

	}

}
