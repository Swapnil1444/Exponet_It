package Services;

import java.util.Scanner;

import Model.Vehicles;

public class ParkingLotData implements Vehicle {
	int numVehicles = 1;
	Scanner sc = new Scanner(System.in);
	Vehicles v = new Vehicles(0, " ", " ");
	Vehicles[] vehicles = new Vehicles[MAX_PARKING_SPACES];

	@Override
	public void addVehicles() {

		System.out.print("How Many Number of Add Vehicles(Max 10):");
		numVehicles = checkNumOfVehical(sc.nextInt());

		// Vehicles[] vehicles = new Vehicles[numVehicles];
		for (int i = 0; i < numVehicles; i++) {
			System.out.println("------------------------------------------");
			System.out.println((i + 1) + ").Add Vehicle");
			System.out.print("Enter Vehicle Number:");
			int vNum = checkNumNotMatch(sc.nextInt());
			sc.nextLine();
			System.out.print("Enter Vehicle Ownar Name:");
			String name = sc.nextLine();
			System.out.print("Enter Vehicle Type(Car,Bike,Truck):");
			String vType = vehicleType(sc.next());
			// System.out.println();
			vehicles[i] = new Vehicles(vNum, name, vType);
		}
		System.out.println("------------------------------------------");
		System.out.println("\nUploding " + numVehicles + " Vehicles Successfully...😎\n");
	}

	@Override
	public void displayAllVehicles() {
		System.out.println("==========================================");
		System.out.println("           All Vehicles Details           ");
		System.out.println("==========================================");
		System.out.printf("%-10s %-19s %-10s%n", "NUMBER", "OWENR NAME", "VEHICLE");
		System.out.println("------------------------------------------");
		for (int i = 0; i < numVehicles; i++) {
			System.out.printf("%-10d %-19s %-10s%n", vehicles[i].getVehicleNum(), vehicles[i].getOwenrName(),
					vehicles[i].getTypeOfVehicle());
		}

	}

	@Override
	public void searchForVehicles() {
		int index = 0;
		boolean flag = false;
		System.out.print("Enter Vehicle Number:");
		int vNo = sc.nextInt();
		for (int i = 0; i < numVehicles; i++) {
			if (vNo == vehicles[i].getVehicleNum()) {
				index = i;
				flag = true;
			}
		}
		if (flag) {
			System.out.println("==========================================");
			System.out.printf("%-10s %-19s %-10s%n", "NUMBER", "OWENR NAME", "VEHICLE");
			System.out.println("------------------------------------------");
			System.out.printf("%-10d %-19s %-10s%n", vehicles[index].getVehicleNum(), vehicles[index].getOwenrName(),
					vehicles[index].getTypeOfVehicle());

		} else {
			System.out.println("No Available Data in Database...!");
		}
	}

	@Override
	public void countTotalNumVehicles() {

		int car=0;
		int bike=0;
		int truck=0;
		for(int i=0;i<numVehicles;i++) {
			if(vehicles[i].getTypeOfVehicle().equals("CAR")) {
				car+=1;
			}
			if(vehicles[i].getTypeOfVehicle().equals("BIKE")) {
				bike+=1;
			}
			if(vehicles[i].getTypeOfVehicle().equals("TRUCK")) {
				truck+=1;
			}
		}
		System.out.println("==========================================");
		System.out.println("         Total Number of Vehicles         ");
		System.out.println("==========================================");
		System.out.printf("%-10s %-19s %-10s%n", "CARS", "BIKES", "TRUCKS");
		System.out.println("------------------------------------------");
		System.out.printf("%-10d %-19d %-10d%n", car, bike,truck);
		//System.out.println(" Car:"+car+ "\n Bikes:"+bike+" \n Truck"+truck);
		
	}

	public String vehicleType(String type) {
		if ("car".equalsIgnoreCase(type) || "bike".equalsIgnoreCase(type) || "truck".equalsIgnoreCase(type)) {
			return type.toUpperCase();
		}
		sc.nextLine();
		System.err.println("We dont have Enough Space for this Vehicle");
		System.out.println("ReEnter Vehicle Type(Car,Bike,Truck):");
		return vehicleType(sc.nextLine());
	}

	public int checkNumOfVehical(int num) {
		if (0 < num && 10 >= num) {
			return num;
		}
		System.err.println("Capacity Maximum [1-10]");
		System.out.print("ReEnter Number:");
		return checkNumOfVehical(sc.nextInt());
	}

	public int checkNumNotMatch(int num) {
		if (num >= 10000 && num <= 99999) {
			return num;
		}
		System.err.println("Error:Invalid Vehicle Number...!");
		System.out.print("ReEnter Vehicle Number:");
		return checkNumNotMatch(sc.nextInt());
	}
}
