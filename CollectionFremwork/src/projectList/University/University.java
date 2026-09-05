package projectList.University;

import java.util.ArrayList;
import java.util.List;

public class University {
	
	public List<List<String>> addUniversity() {
		
		List<String> sppu=new ArrayList<String>();
		sppu.add("CS");
		sppu.add("IT");
		sppu.add("AIDS");
		
		List<String> mubaiUniversity =new ArrayList<String>();
		mubaiUniversity.add("Electrical");
		mubaiUniversity.add("ENTC");
		mubaiUniversity.add("CE");
		
		List<List<String>> universitys=new ArrayList<List<String>>();
		universitys.add(mubaiUniversity);
		universitys.add(sppu);
		return universitys;
	}

}
