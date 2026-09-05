package projectMap.university;

import java.util.HashMap;
import java.util.Map;

public class UnivarsityMap {
	
	public Map<String,Map<String,String>> addUniversity() {
		
		Map<String, String> sppu=new HashMap<String, String>();
		
		sppu.put("AIDS", "Aids");
		sppu.put("IT", "It");
		
		Map<String,String> mubaiUn=new HashMap<String, String>();
		mubaiUn.put("Electrical", "electrical");
		mubaiUn.put("CS","cs");
		
		Map<String, Map<String ,String>> university=new HashMap<String, Map<String,String>>();
		university.put("MubaiUn", mubaiUn);
		university.put("SPPU", sppu);
		return university;
		
	}

}
