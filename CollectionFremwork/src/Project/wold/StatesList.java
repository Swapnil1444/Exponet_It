package Project.wold;

import java.util.ArrayList;
import java.util.List;

public class StatesList {
	
	
public List<List<List<String>>> addStates() {
		
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
		
		List<String> California =new ArrayList<String>();
		California.add("Los Angeles");
		California.add("San Diego");
		
		List<String> Texas =new ArrayList<String>();
		Texas.add("Houston");
		Texas.add("Dallas");
		
		List<List<String>> Usa=new ArrayList<List<String>>();
		Usa.add(Texas);
		Usa.add(California);
		
		List<List<List<String>>> World=new ArrayList<List<List<String>>>();
		World.add(Usa);
		World.add(india);
		
		return World;
		
		
		
		
		
	}

}
