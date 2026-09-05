package projectMap.university;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainUnivercity {

	public static void main(String[] args) {

		UnivarsityMap u = new UnivarsityMap();
		Map<String, Map<String, String>> university = u.addUniversity();

		System.out.println(university);
		System.out.println("------------using iterator-----------");

		Set<String> universitySet = university.keySet();
		Iterator<String> itrUniversity = universitySet.iterator();
		while (itrUniversity.hasNext()) {
			String univarsityKey = itrUniversity.next();
			System.out.println("Univarsity:" + univarsityKey);
			Map<String, String> coursMap = university.get(univarsityKey);
			System.out.println(coursMap);
			Set<String> coursSet = coursMap.keySet();

			Iterator<String> itrCours = coursSet.iterator();
			while (itrCours.hasNext()) {
				System.out.println("  Cours:" + coursMap.get(itrCours.next()));
			}
		}
		
		System.out.println("---------for each loop--------");
		for(String universityKey:universitySet) {
			System.out.println("University:"+universityKey);
			Map<String,String> coursMap=university.get(universityKey);
			Set<String> couersSet=coursMap.keySet();
			for(String coursKey:couersSet) {
				System.out.println(" Cours:"+coursMap.get(coursKey));
			}
			
		}

	}

}
