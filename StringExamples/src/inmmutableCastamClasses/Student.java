package inmmutableCastamClasses;

final public class Student {
	final private int id;
	final private String name;

	public Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {

		Student s=new Student(101, "swapnil");
		System.out.println("id:"+s.getId()+" name:"+s.getName());
		
	}

}
