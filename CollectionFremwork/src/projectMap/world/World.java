package projectMap.world;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class World {

	public Map<String, Map<String, Map<String, String>>> addContry() {

		Map<String, String> california = new HashMap<String, String>();
		california.put("LosAngeles", "LosAngeles");
		california.put("San Francisco", "San Francisco");

		Map<String, String> texas = new HashMap<String, String>();
		texas.put("Houston", "Houston");
		texas.put("Dallas", "Dallas");

		Map<String, Map<String, String>> Usa = new HashMap<String, Map<String, String>>();
		Usa.put("Texas", texas);
		Usa.put("California", california);

		Map<String, String> mahartra = new HashMap<String, String>();
		mahartra.put("Pune", "Pune");
		mahartra.put("Mubai", "Mubai");

		Map<String, String> gujrat = new HashMap<String, String>();
		gujrat.put("Surat", "Surat");
		gujrat.put("Bupal", "Bupal");

		Map<String, Map<String, String>> india = new HashMap<String, Map<String, String>>();
		india.put("Maharatra", mahartra);
		india.put("Gujrat", gujrat);
		
		Map<String, Map<String,Map<String,String>>> country=new HashMap<String, Map<String,Map<String,String>>>();
		country.put("India", india);
		country.put("USA", Usa);

		return country;
	}

}
