package Model;

public class Vehicles {

	private int vehicleNum;
	private String owenrName;
	private String typeOfVehicle;

	public Vehicles(int vehicleNum, String owenrName, String typeOfVehicle) {
		this.vehicleNum = vehicleNum;
		this.owenrName = owenrName;
		this.typeOfVehicle = typeOfVehicle;
	}

	public int getVehicleNum() {
		return vehicleNum;
	}

	public void setVehicleNum(int vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public String getOwenrName() {
		return owenrName;
	}

	public void setOwenrName(String owenrName) {
		this.owenrName = owenrName;
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}

	@Override
	public String toString() {
		return "Vehicles [vehicleNum=" + vehicleNum + ", owenrName=" + owenrName + ", typeOfVehicle=" + typeOfVehicle
				+ "]";
	}

}
