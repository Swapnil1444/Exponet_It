package Services;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validetions {
	
	static Scanner sc=new  Scanner(System.in);
	public static String  validVehicleNo() {
		System.out.print("Enter Vehicle No:");
		String no=sc.next();
		if(Pattern.matches("[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}", no))
		{
			return no;
		}
		System.err.println("Invalid Vehicle Number..!");
		return validVehicleNo();
	}

}
