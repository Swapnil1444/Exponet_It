package Project.india;

import java.util.Iterator;
import java.util.List;

public class GetDataIndia {
	public static void main(String[] args) {
		CountryList c = new CountryList();
		List<List<String>> india = c.addCountry();
		System.out.println(india);

		System.out.println("-------using iterator-------");
		Iterator<List<String>> itr = india.iterator();
		while (itr.hasNext()) {
			List<String> countryList = itr.next();
			System.out.println(countryList);
			Iterator<String> itr1 = countryList.iterator();
			while (itr1.hasNext()) {
				System.out.println(itr1.next());
			}
		}
		System.out.println("\n------Using for each--------");
		for (List<String> list : india) {
			for (String countryName : list) {
				System.out.println(countryName);
			}
		}
	}

}
