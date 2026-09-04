package Project.india;

import java.util.ArrayList;
import java.util.List;

public class CountryList {
	
	public List<List<String>> addCountry() {
		
		List<String> maharatra =new ArrayList<String>();
		maharatra.add("Pune");
		maharatra.add("Mubli");
		maharatra.add("Anagar");
		
		List<String> gujrat =new ArrayList<String>();
		gujrat.add("surat");
		gujrat.add("bupal");
		gujrat.add("jaydevnagar");
		
		List<List<String>> india=new  ArrayList<List<String>>();
		india.add(gujrat);
		india.add(maharatra);
		
		return india;
	}

}
