package Model;

public class Vehicles {

	private String vehicleNum;
	private String owenrName;
	private String typeOfVehicle;



	public String getVehicleNum() {
		return vehicleNum;
	}

	public void setVehicleNum(String vehicleNum) {
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
