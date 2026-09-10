package projectSet.india;

import java.util.Iterator;
import java.util.Set;

public class MainIndia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountyData c = new CountyData();
		Set<Set<String>> india = c.getCounty();

		System.out.println(india);

		System.out.println("------------Using Iteretion---------");

		Iterator<Set<String>> itrstate = india.iterator();
		while (itrstate.hasNext()) {
			Set<String> state = itrstate.next();
			System.out.println(state);
			Iterator<String> itrcity = state.iterator();
			while (itrcity.hasNext()) {
				System.out.println(" City"+itrcity.next());
			}
		}
		
		System.out.println("-----using for loop------");
		for(Set<String> state:india) {
			
			System.out.println(state);
			for(String City: state ) {
				System.out.println(City);
			}
		}

	}

}
