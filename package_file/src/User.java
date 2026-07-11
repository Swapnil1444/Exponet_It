
public class User {

	int uid;
	String uname;
	public static void main(String[] args) {
		User u=new User();
		User u1=new User();
	
		u.uid=1;
		u.uname="Swapnil";
		
		u1.uid=2;
		u1.uname="om";
		
		
		System.out.println("User id:"+u.uid+" name:"+u.uname);
		System.out.println("User id:"+u1.uid+" name:"+u1.uname);
		
		
		
	}
}
