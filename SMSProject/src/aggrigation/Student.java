package aggrigation;

public class Student {

	private int sId;
	private String sName;
	private Batch b;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Batch getB() {
		return b;
	}
	public void setB(Batch b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", b=" + b + "]";
	}
	
	
	
}
