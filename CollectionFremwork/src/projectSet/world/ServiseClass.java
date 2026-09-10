package projectSet.world;

import java.util.HashSet;
import java.util.Set;

public class ServiseClass {
	
		
		public Set<Set<Set<String>>> getCounty() {
			
			Set<String> maharatra=new HashSet<String>();
			maharatra.add("Pune");
			maharatra.add("Mubai");
			
			Set<String> gujarat= new HashSet<String>();
			gujarat.add("Surat");
			gujarat.add("indor");
			
			Set<Set<String>> india=new HashSet<Set<String>>();
			india.add(gujarat);
			india.add(maharatra);
			
			
			Set<String> california=new HashSet<String>();
			california.add("LosAngeles");
			california.add("San Francisco");
			
			Set<String> texas =new HashSet<String>();
			texas.add("Houston");
			texas.add("Dallas");
			
			Set<Set<String>> usa=new HashSet<Set<String>>();
			usa.add(california);
			usa.add(texas);
			
			Set<Set<Set<String>>> world=new HashSet<Set<Set<String>>>();
			world.add(usa);
			world.add(india);
			return world;
			
			
		}


}
