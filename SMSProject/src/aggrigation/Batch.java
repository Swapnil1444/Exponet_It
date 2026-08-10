package aggrigation;

public class Batch {
	
	private int bId;
	private String bName;
	
	private Facalty f;

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public Facalty getF() {
		return f;
	}

	public void setF(Facalty f) {
		this.f = f;
	}

	@Override
	public String toString() {
		return "Batch [bId=" + bId + ", bName=" + bName + ", f=" + f + "]";
	}
	
	

}
