package com.service;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.model.Batch;
import com.model.Course;
import com.model.Faculty;
import com.model.Student;

public class CMSServiceImpl implements CMSService {

	Scanner sc = new Scanner(System.in);
	List<Course> courseList = new ArrayList<Course>();
	List<Faculty> facultieList = new ArrayList<Faculty>();
	List<Batch> batchList = new ArrayList<Batch>();
	List<Student> studentds = new ArrayList<Student>();

	@Override
	public void addCourse() {
		int num = howToAddNum();
		for (int i = 0; i < num; i++) {
			Course c = new Course();
			System.out.println("------- " + (1 + i) + ").Course -------");
			// System.out.print("Enter Course Id:");
			c.setCid(Validetions.validInputId());
			// System.out.print("Enter Course Name:");
			// sc.nextLine();
			c.setCname(Validetions.validName());
			courseList.add(c);

		}
		System.out.println("\nAdd Course Successfully...!\n");
	}

	public int howToAddNum() {
		System.out.print("How many numbers should be added:");
		try {
			int num = sc.nextInt();
			System.out.println("-----------------------------------------------");
			return num;
		} catch (InputMismatchException e) {
			System.err.println("Invalid Input Enter Only Digit...!");
			sc.nextLine();
			return howToAddNum();

		}

	}

	@Override
	public void displayCourse() {
		System.out.println("Course List:             ");
		// System.out.println("-----------------------------------------------");

		for (Course c : courseList) {
			System.out.println(" Id:" + c.getCid() + " Name:" + c.getCname());
		}
		System.out.println("-----------------------------------------------");

	}

	@Override
	public void addFaculty() {

		boolean flag = true;

		int num = howToAddNum();
		for (int i = 0; i < num; i++) {
			Faculty f = new Faculty();
			System.out.println("------- " + (1 + i) + ").Faculty -------");
			// System.out.print("Enter Faculty Id:");
			f.setFid(Validetions.validInputId());
			// System.out.print("Enter Faculty Name:");
			// sc.nextLine();
			f.setFname(Validetions.validName());
			if (!courseList.isEmpty()) {
				f.setCourse(selectCourse());
				facultieList.add(f);
				flag = false;
			} else {
				System.err.println("Not Any course available...!");
				break;
			}

		}
		if (!flag) {
			System.out.println("\nAdd Faculty Successfully...!\n");
		}
	}

	public Course selectCourse() {
		System.out.println("-----------------------------------------------");
		displayCourse();
		System.out.println("Which Course do you want to add using Id");
		int cid = Validetions.validInputId();
		for (Course c : courseList) {

			if (cid == c.getCid()) {
				return c;
			}
		}
		System.out.println("This course is not available..!");
		return selectCourse();
	}

	@Override
	public void displayFaculty() {
		System.out.println("Faculty List:             ");
		for (Faculty f : facultieList) {
			System.out.println(" Id:" + f.getFid() + " Name:" + f.getFname() + " Course:" + f.getCourse());
		}
		System.out.println("-----------------------------------------------");
	}

	@Override
	public void addBatch() {
		boolean flag = true;
		int num = howToAddNum();
		for (int i = 0; i < num; i++) {
			Batch b = new Batch();
			System.out.println("------- " + (1 + i) + ").Batch -------");
			// System.out.print("Enter Batch Id:");
			b.setBid(Validetions.validInputId());
			// System.out.print("Enter Batch Name:");
			b.setBatchName(Validetions.validName());
			if (!facultieList.isEmpty()) {
				b.setFaculty(checkFacluty());
				flag = false;
				batchList.add(b);
			} else {
				System.err.println("Not Any Faculty available...!");
				break;
			}
		}
		if (!flag) {
			System.out.println("\nAdd Batchs Successfully...!\n");
		}

	}

	public Faculty checkFacluty() {
		System.out.println("-----------------------------------------------");
		displayFaculty();
		System.out.println("Which Faculty do you want to add using Id");
		int fid = Validetions.validInputId();
		for (Faculty f : facultieList) {
			if (fid == f.getFid()) {
				return f;
			}
		}
		System.out.println("This Faculty is not available..!");
		return checkFacluty();
	}

	@Override
	public void displayBatch() {
		System.out.println("Batch List:");
		// System.out.println("-----------------------------------------------");
		for (Batch b : batchList) {
			System.out.println(b);
		}
		System.out.println("-----------------------------------------------");
	}

	@Override
	public void addStudent() {
		boolean flag = false;
		int num = howToAddNum();
		for (int i = 0; i < num; i++) {
			Student s = new Student();
			System.out.println("------- " + (1 + i) + ").Student -------");
			// System.out.print("Enter Student Id:");
			s.setSid(Validetions.validInputId());
			// System.out.print("Enter Student Name:");
			// sc.nextLine();
			s.setSname(Validetions.validName());
			if (!batchList.isEmpty()) {
				s.setBatch(checkBatch());
				flag = true;
				studentds.add(s);
			} else {
				System.err.println("Not Any Batch available...!");
				break;
			}

		}
		if (flag) {
			System.out.println("\nAdd Students Successfully...!\n");
		}

	}

	public Batch checkBatch() {
		System.out.println("-----------------------------------------------");
		displayBatch();
		System.out.println("Which Batch do you want to add using Id");
		int bid = Validetions.validInputId();

		for (Batch b : batchList) {
			if (bid == b.getBid()) {
				return b;
			}
		}

		System.err.println("This Batch is not available..!");
		return checkBatch();
	}

	@Override
	public void displayStudent() {
		System.out.println("Student List:");
		for (Student s : studentds) {
			System.out.println(s);
		}
		System.out.println("-----------------------------------------------");
	}

	@Override
	public void updateInfo() {
		int key = 0;
		boolean flag = true;
		while (flag) {
			System.out.println("------Update Info------");
			System.out.println("1.Course \n2.Faculty \n3.Batch \n4.Student \n5.Back");
			System.out.println("---------------------------------");
			System.out.print("Select Option:");
			try {

				key = sc.nextInt();
				System.out.println("---------------------------------");
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.err.println("Invalid Input...!");

			}

			switch (key) {
			case 0:
				break;
			case 1:
				updateCourse();
				break;
			case 2:
				updateFaculty();
				break;
			case 3:
				updateBatch();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				flag = false;
				System.out.println("");
				break;

			default:
				System.err.println("Invalid Input...!");

			}
		}

	}

	private void updateStudent() {
		boolean exit = true, flag = true;

		System.out.println("-----Update Student------");
		int id = Validetions.validInputId();
		for (Student s : studentds) {
			if (s.getSid() == id) {
				while (flag) {
					int key = 0;
					exit = false;
					System.out.println("---------------------------------");
					System.out.println("1.Student Id \n2.Student Name \n3.Update Batch \n4.Back");
					System.out.println("---------------------------------");
					System.out.print("Select Option:");

					try {

						key = sc.nextInt();
						System.out.println("---------------------------------");
					} catch (InputMismatchException e) {
						sc.nextLine();
						System.err.println("Invalid input...!");
					}

					switch (key) {
					case 1:
						s.setSid(Validetions.validInputId());
						System.out.println("\n Update Successfully...!\n");
						break;
					case 2:
						s.setSname(Validetions.validName());
						System.out.println("\n Update Successfully...!\n");
						break;
					case 3:
						if (!batchList.isEmpty()) {
							s.setBatch(checkBatch());
							System.out.println("\n Update Successfully...!\n");

						} else {
							System.err.println("Not Any Batch available...!");
							break;
						}
						break;
					case 4:
						flag = false;
						break;
					default:
						System.err.println("Invalid Input");
					}

				}
			}
		}
		if (exit) {
			System.err.println("This Student is not available..!");
			System.out.println("---------------------------------");
		}

	}

	private void updateBatch() {
		boolean exit = true, flag = true;

		System.out.println("-----Update Batch------");
		int id = Validetions.validInputId();
		for (Batch b : batchList) {
			if (b.getBid() == id) {
				while (flag) {
					int key = 0;
					exit = false;
					System.out.println("---------------------------------");
					System.out.println("1.Batch Id \n2.Batch Name \n3.Update Faculty \n4.Back");
					System.out.println("---------------------------------");
					System.out.print("Select Option:");

					try {

						key = sc.nextInt();
						System.out.println("---------------------------------");
					} catch (InputMismatchException e) {
						sc.nextLine();
						System.err.println("Invalid input...!");
					}

					switch (key) {
					case 1:
						b.setBid(Validetions.validInputId());
						System.out.println("\n Update Successfully...!\n");
						break;
					case 2:
						b.setBatchName(Validetions.validName());
						System.out.println("\n Update Successfully...!\n");
						break;
					case 3:
						if (!facultieList.isEmpty()) {
							b.setFaculty(checkFacluty());
							System.out.println("\n Update Successfully...!\n");

						} else {
							System.err.println("Not Any Faculty available...!");
							break;
						}
						break;
					case 4:
						flag = false;
						break;
					default:
						System.err.println("Invalid Input");
					}

				}
			}
		}
		if (exit) {
			System.err.println("This Batch is not available..!");
			System.out.println("---------------------------------");
		}

	}

	private void updateFaculty() {
		boolean exit = true, flag = true;

		System.out.println("-----Update Faculuty------");
		int id = Validetions.validInputId();
		for (Faculty f : facultieList) {
			if (f.getFid() == id) {
				while (flag) {
					int key = 0;
					exit = false;
					System.out.println("---------------------------------");
					System.out.println("1.Faculty Id \n2.Faculty Name \n3.Update Course \n4.Back");
					System.out.println("---------------------------------");
					System.out.print("Select Option:");

					try {

						key = sc.nextInt();
						System.out.println("---------------------------------");
					} catch (InputMismatchException e) {
						sc.nextLine();
						System.err.println("Invalid input...!");
					}

					switch (key) {
					case 1:
						f.setFid(Validetions.validInputId());
						System.out.println("\n Update Successfully...!\n");
						break;
					case 2:
						f.setFname(Validetions.validName());
						System.out.println("\n Update Successfully...!\n");
						break;
					case 3:
						if (!courseList.isEmpty()) {
							f.setCourse(selectCourse());
							System.out.println("\n Update Successfully...!\n");

						} else {
							System.err.println("Not Any course available...!");
							break;
						}
						break;
					case 4:
						flag = false;
						break;
					default:
						System.err.println("Invalid Input");
					}

				}
			}
		}
		if (exit) {
			System.err.println("This Faculty is not available..!");
			System.out.println("---------------------------------");
		}
	}

	private void updateCourse() {
		boolean exit = true, flag = true;

		System.out.println("-----update course------");
		int id = Validetions.validInputId();
		for (Course c : courseList) {
			if (c.getCid() == id) {

				while (flag) {
					int key = 0;
					exit = false;
					System.out.println("---------------------------------");
					System.out.println("1.course Id \n2.course Name \n3.back");
					System.out.println("---------------------------------");
					System.out.print("Select Option:");

					try {

						key = sc.nextInt();
						System.out.println("---------------------------------");
					} catch (InputMismatchException e) {
						sc.nextLine();
						System.err.println("Invalid input...!");
					}

					switch (key) {
					case 1:
						c.setCid(Validetions.validInputId());
						System.out.println("\n Update Successfully...!\n");
						break;
					case 2:
						c.setCname(Validetions.validName());
						System.out.println("\n Update Successfully...!\n");
						break;
					case 3:
						flag = false;
						break;
					default:
						System.err.println("Invalid Input");
					}

				}
			}
		}
		if (exit) {
			System.err.println("This course is not available..!");
			System.out.println("---------------------------------");
		}

	}

	@Override
	public void deleteInfo() {

		int key = 0;
		boolean flag = true;
		while (flag) {
			System.out.println("------Delete Info------");
			System.out.println("1.Course \n2.Faculty \n3.Batch \n4.Student \n5.Back");
			System.out.println("---------------------------------");
			System.out.print("Select Option:");
			try {

				key = sc.nextInt();
				System.out.println("---------------------------------");
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.err.println("Invalid Input...!");

			}

			switch (key) {
			case 0:
				break;
			case 1:
				if (!courseList.isEmpty()) {
					Course c = getCourse();
					courseList.remove(courseList.indexOf(c));
					System.out.println("\nDelete Successfully..!\n");

				} else {
					System.err.println("Course List is Empty..!");

				}
				break;
			case 2:
				if (!facultieList.isEmpty()) {
					Faculty f = getFaulty();
					facultieList.remove(facultieList.indexOf(f));
					System.out.println("\nDelete Successfully..!\n");
				} else {
					System.err.println("Faculty List is Empty..!");
				}

				break;
			case 3:
				if (!batchList.isEmpty()) {
					Batch b = getBatch();
					batchList.remove(batchList.indexOf(b));
					System.out.println("\nDelete Successfully..!\n");
				} else {
					System.err.println("Batch List is Empty..!");
				}
				break;
			case 4:
				if (!studentds.isEmpty()) {
					Student s = getStudent();
					studentds.remove(studentds.indexOf(s));
					System.out.println("\nDelete Successfully..!\n");
				} else {
					System.err.println("Student List is Empty..!");
				}

				break;
			case 5:
				flag = false;
				System.out.println("");
				break;

			default:
				System.err.println("Invalid Input...!");

			}
		}
	}

	private Student getStudent() {
		int id = Validetions.validInputId();
		for (Student s : studentds) {
			if (s.getSid() == id) {
				return s;
			}
		}
		System.out.println("This Student is not available..!");
		return getStudent();
	}

	private Batch getBatch() {
		int id = Validetions.validInputId();
		for (Batch b : batchList) {
			if (b.getBid() == id) {
				return b;
			}
		}
		System.out.println("This Batch is not available..!");
		return getBatch();
	}

	private Faculty getFaulty() {
		int id = Validetions.validInputId();
		for (Faculty f : facultieList) {
			if (f.getFid() == id) {
				return f;
			}
		}
		System.out.println("This faulty is not available..!");
		return getFaulty();
	}

	public Course getCourse() {
		int id = Validetions.validInputId();
		for (Course c : courseList) {
			if (id == c.getCid()) {
				return c;
			}
		}
		System.out.println("This course is not available..!");
		return getCourse();

	}

}
