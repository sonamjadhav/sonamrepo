package packageAccessModifiers1;

//import packageAccessModifiers1.DefaultMembers;

public class AccessDefaultMembers2 {

	public static void main(String[] args) {
		
		DefaultMembers p1=new DefaultMembers();
		System.out.println("Accessing default members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		Simple2 p2=new Simple2();
		p2.display();
		Simple2.main(args);
	}

}