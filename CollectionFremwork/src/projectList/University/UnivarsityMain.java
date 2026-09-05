package projectList.University;

import java.util.Iterator;
import java.util.List;
public class UnivarsityMain {

	public static void main(String[] args) {

		University u = new University();
		List<List<String>> university = u.addUniversity();

		System.out.println(university);

		System.out.println("------------using iterator-----------");
		Iterator<List<String>> itr = university.iterator();

		while(itr.hasNext()) {
			List<String> courseList=itr.next();
			System.out.println(courseList);
		Iterator<String> itrCours=	courseList.iterator();
		while(itrCours.hasNext()) {
			System.out.println(" Cours Name:"+itrCours.next());
		}
			
		}
		
	}

}
