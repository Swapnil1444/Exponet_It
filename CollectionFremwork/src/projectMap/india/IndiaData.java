package projectMap.india;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IndiaData {

	public static void main(String[] args) {

		CountyMap c = new CountyMap();
		Map<String, Map<String, String>> india = c.getCountyInfo();

		System.out.println("-------Using Itretars ---------");

		Set<String> stataSet = india.keySet();
		Iterator<String> itrStata = stataSet.iterator();
		while (itrStata.hasNext()) {
			String stataKay = itrStata.next();
			System.out.println("Statas:" + stataKay);
			Map<String, String> stataMap = india.get(stataKay);
			System.out.println(stataMap);
			Set<String> citySet=stataMap.keySet();
			Iterator<String> itrcity=citySet.iterator();
			while(itrcity.hasNext()) {
				
				System.out.println(" City:"+stataMap.get(itrcity.next()));
			}
			
		}
		
		System.out.println("----------using for loop---------");
		for(String statas:stataSet) {
			System.out.println("stata:"+statas);
			Map<String,String> mapCity=india.get(statas);
			//System.out.println(" "+mapCity);
			Set<String>citySet= mapCity.keySet();
			for(String city:citySet) {
				System.out.println("   City:"+mapCity.get(city));
			}
		}

	}

}
