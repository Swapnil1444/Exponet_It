package Services;

import java.util.Scanner;

import Model.Vehicles;

public class ParkingLotData implements Vehicle {

	Scanner sc = new Scanner(System.in);

	Vehicles[] vehicles = new Vehicles[MAX_PARKING_SPACES];

	@Override
	public void addVehicles() {

		System.out.print("How Many Number of Add Vehicles(Max 10):");
		int numVehicles = checkNumOfVehical(sc.nextInt());

		for (int i = 0; i < numVehicles; i++) {
			Vehicles v = new Vehicles();
			System.out.println("------------------------------------------");
			System.out.println((i + 1) + ").Add Vehicle");
			// System.out.print("Enter Vehicle Number:");
			v.setVehicleNum(Validetions.validVehicleNo());
			sc.nextLine();
			System.out.print("Enter Vehicle Ownar Name:");
			v.setOwenrName(sc.next());
			System.out.print("Enter Vehicle Type(Car,Bike,Truck):");
			String vType = vehicleType(sc.next());
			v.setTypeOfVehicle(vType);
			vehicles[i] = v;
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
		for (Vehicles v : vehicles) {
			if (v != null) {
				System.out.printf("%-10s %-19s %-10s%n", v.getVehicleNum(), v.getOwenrName(), v.getTypeOfVehicle());
			}
		}

	}

	@Override
	public void searchForVehicles() {
		
		String vNo = Validetions.validVehicleNo();
		System.out.println("==========================================");
		System.out.printf("%-10s %-19s %-10s%n", "NUMBER", "OWENR NAME", "VEHICLE");
		System.out.println("------------------------------------------");
		for (Vehicles v:vehicles ) {
			if (v != null&&(vNo.equals(v.getVehicleNum()))) {
									
						System.out.printf("%-10s %-19s %-10s%n", v.getVehicleNum(), v.getOwenrName(),
								v.getTypeOfVehicle());
					
				}
			}}

	@Override
	public void countTotalNumVehicles() {

		int car = 0;
		int bike = 0;
		int truck = 0;
		for (Vehicles v : vehicles) {
			if (v != null) {
				if (v.getTypeOfVehicle().equals("CAR")) {
					car += 1;
				}
				if (v.getTypeOfVehicle().equals("BIKE")) {
					bike += 1;
				}
				if (v.getTypeOfVehicle().equals("TRUCK")) {
					truck += 1;
				}
			}
		}
		System.out.println("==========================================");
		System.out.println("         Total Number of Vehicles         ");
		System.out.println("==========================================");
		System.out.printf("%-10s %-19s %-10s%n", "CARS", "BIKES", "TRUCKS");
		System.out.println("------------------------------------------");
		System.out.printf("%-10d %-19d %-10d%n", car, bike, truck);
		// System.out.println(" Car:"+car+ "\n Bikes:"+bike+" \n Truck"+truck);

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
