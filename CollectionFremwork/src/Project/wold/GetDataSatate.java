package Project.wold;

import java.util.Iterator;
import java.util.List;

public class GetDataSatate {
	public static void main(String[] args) {
		StatesList s = new StatesList();
		List<List<List<String>>> statas = s.addStates();
		System.out.println(statas);

		System.out.println("-------using iterator-------");

		Iterator<List<List<String>>> itrcounty = statas.iterator();
		while (itrcounty.hasNext()) {
			List<List<String>> contryList = itrcounty.next();
			System.out.println(contryList);

			Iterator<List<String>> itrState = contryList.iterator();
			while (itrState.hasNext()) {

				List<String> city=itrState.next();
				System.out.println(itrState.next());
				
				Iterator<String> itrcity=city.iterator();
				while(itrcity.hasNext()) {
					System.out.println(itrcity.next());
				}
			
			}
		}
		
		
		System.out.println("\n------Using for each--------");

		for(List<List<String>> state1:statas) {
			for(List<String> county : state1) {
				for(String city:county) {
					System.out.println(city);
				}
				
			}
		}

	}

}
