package inheritance;

class ABC {
	static void myage() {
		System.out.println("method age");
	}
	public void myMethod() {
		System.out.println("method of ABC class");
	}
}
class Overriding4 extends ABC {
	public void myMethod() {
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method of Class Overriding4");
	}
	public static void main(String args[]) {
		Overriding4 obj = new Overriding4();
		obj.myMethod();
		ABC.myage();
	}
}
//method of ABC class
//Overriding method of Class Overriding4