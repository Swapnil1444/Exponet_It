package Services;

import java.util.InputMismatchException;
import java.util.Scanner;

import Model.Constant;
import Model.User;
import Validations.UserValidation;

public class UserServicesImpl implements UserServices {

	Scanner sc = new Scanner(System.in);
  	User[] arrUser = new User[Constant.MaxSize];

	@Override
	public void createUser() {

		System.out.print("How to Add No Users:");
		int size = 0;
		try {
			size = sc.nextInt();
			if (size >= Constant.MaxSize) {
				throw new ArrayIndexOutOfBoundsException("Array size Max " + Constant.MaxSize);
			}

			for (int i = 0; i < size; i++) {
				
				User u = new User();
				System.out.println("----- Add " + (i + 1) + " User -----");
				u.setId(UserValidation.validId());
				u.setName(UserValidation.validName());
//				u.setMobileNo(UserValidation.validContectNo());
//				u.setEmail(UserValidation.validEmail());
//				u.setPanCard(UserValidation.validPanNo());
				System.out.print("Enter Address:");
				u.setAddress(sc.next());
				// System.out.println(u);
				arrUser[i] = u;
				System.out.println("\n" + (i + 1) + ".Add User Successfully...1\n ");
			}

		} catch (InputMismatchException e) {
			System.out.println("Invalid Input..!");
			sc.nextLine();
			createUser();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			sc.nextLine();

			createUser();
		}

		for (User user1 : arrUser) {
			System.out.println(user1);
		}

	}
	
	

	@Override
	public void displayUserInfo() {

		for (User user : arrUser) {
			System.out.println(user);
		}

//		User u=checkUser(); 
//		System.out.println(u);
	}

	@Override
	public void updateUserInfo() {

	}

	@Override
	public void deleteUserInfo() {

	}

	public User checkUser() {
		int id = UserValidation.validId();
		for (User user : arrUser) {
			if (user != null && user.getId() == id) {
				return user;
			}
		}
		System.err.println("User not Existing..!");
		return checkUser();
	}

}
