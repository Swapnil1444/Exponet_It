package aggrigation;

public class Facalty {

	private String fName;
	private int fId;
	private Cours c;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public Cours getC() {
		return c;
	}

	public void setC(Cours c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Facalty [fName=" + fName + ", fId=" + fId + ", c=" + c + "]";
	}

}
