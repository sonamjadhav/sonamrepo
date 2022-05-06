package packageAccessModifiers1;

public class AccessPublicMembers2 {

	public static void main(String[] args) {
		
		packageAccessModifiers1.PublicMembers p1=new packageAccessModifiers1.PublicMembers();
		System.out.println("Accessing Default members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}

