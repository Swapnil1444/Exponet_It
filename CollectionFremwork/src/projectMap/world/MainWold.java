package projectMap.world;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainWold {

	public static void main(String[] args) {

		// keySet
		// entrySet

		World w = new World();
		Map<String, Map<String, Map<String, String>>> county = w.addContry();

		System.out.println(county);

		// keySet
		System.out.println("-------Using Itretars ---------");

		Set<String> countrySet = county.keySet();
		System.out.println(countrySet);
		Iterator<String> itrCuntry = countrySet.iterator();
		while (itrCuntry.hasNext()) {
			String keyCounty = itrCuntry.next();
			System.out.println("County Name:" + keyCounty);
			Map<String, Map<String, String>> statas = county.get(keyCounty);
			Set<String> stateSet = statas.keySet();
			System.out.println(" State Set: " + stateSet);
			Iterator<String> itrState = stateSet.iterator();
			while (itrState.hasNext()) {
				String keyState = itrState.next();
				System.out.println("  State Name: " + keyState);
				Map<String, String> cityMap = statas.get(keyState);
				Set<String> cityKey = cityMap.keySet();
				Iterator<String> itrCity = cityKey.iterator();
				while (itrCity.hasNext()) {
					String keyCity = itrCity.next();
					System.out.println("    City:"+cityMap.get(keyCity));

				}

			}

		}

		System.out.println("----------Using For loop---------");
		for (String countykey : countrySet) {
			System.out.println("County:" + countykey);
			Map<String, Map<String, String>> statas = county.get(countykey);
			Set<String> statasKay = statas.keySet();
			for (String stata : statasKay) {
				System.out.println(" Statas:" + stata);
				Map<String, String> cityMap = statas.get(countykey);
				
//				Set<String> cityKey = cityMap.keySet();
//				for(String city:cityKey) {
//					System.out.println(cityMap.get(city));
//				}

				
			}

		}

	}

}
