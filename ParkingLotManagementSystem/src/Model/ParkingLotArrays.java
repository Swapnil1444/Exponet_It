package Model;
import java.util.Arrays;

import Services.*;
public class ParkingLotArrays {

	private Vehicles[] vehicles=new Vehicles[Vehicle.MAX_PARKING_SPACES];
	

	public Vehicles[] getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicles[] vehicles) {
		this.vehicles = vehicles;
	}
	
	
}
