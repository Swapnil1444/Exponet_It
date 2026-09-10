package projectSet.india;

import java.util.HashSet;
import java.util.Set;

public class CountyData {
	
	public Set<Set<String>> getCounty() {
		
		Set<String> maharatra=new HashSet<String>();
		maharatra.add("Pune");
		maharatra.add("Mubai");
		
		Set<String> gujarat= new HashSet<String>();
		gujarat.add("Surat");
		gujarat.add("indor");
		
		Set<Set<String>> india=new HashSet<Set<String>>();
		india.add(gujarat);
		india.add(maharatra);
		return india;
		
	}

}
