package projectMap.india;

import java.util.HashMap;
import java.util.Map;

public class CountyMap {

	public Map<String, Map<String, String>> getCountyInfo() {
		Map<String, String> mahartra = new HashMap<String, String>();
		mahartra.put("Pune", "Pune");
		mahartra.put("Mubai", "Mubai");

		Map<String, String> gujrat = new HashMap<String, String>();
		gujrat.put("Surat", "Surat");
		gujrat.put("Bupal", "Bupal");

		Map<String, Map<String, String>> india = new HashMap<String, Map<String, String>>();
		india.put("Maharatra", mahartra);
		india.put("Gujrat", gujrat);
		
		return india;
		
	}

}
