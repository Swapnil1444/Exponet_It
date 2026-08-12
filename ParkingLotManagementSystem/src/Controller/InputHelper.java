package Controller;

import java.util.Scanner;

import Services.ParkingLotData;
import Services.Vehicle;

public class InputHelper {

	public static void main(String[] args) {

		MainManu();

	}

	public static void MainManu() {
		boolean flag = true;
		Vehicle pl = new ParkingLotData();
		Scanner sc = new Scanner(System.in);
		while (flag) {
			System.out.println("==========================================");
			System.out.println("       PARKING LOT MANAGEMENT SYSTEM      ");
			System.out.println("==========================================");

			System.out.println(
					"1.Add Vehicles \n2.Display All Parked Vehicles \n3.Search Vehicle \n4.Count the Total Number of Vehicles \n5.Exit");
			System.out.println("==========================================");
			System.out.print("Select Option:");
			int ch = sc.nextInt();
			System.out.println("==========================================");

			switch (ch) {
			case 1:
				pl.addVehicles();
				break;
			case 2:
				pl.displayAllVehicles();
				break;
			case 3:
				pl.searchForVehicles();
				break;
			case 4:
				pl.countTotalNumVehicles();
				break;
			case 5:
				System.out.println("Exit..!");
				flag = false;
				break;
			default:
				System.err.println("Invalid Input..!");
			}
			//System.out.println("==========================================");
		}
	}

}
