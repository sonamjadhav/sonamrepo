package inheritance;

class Animal2{
	public void move() {
		System.out.println("Animals can move");
	}
}
	
class Dogs extends Animal2{
	public void move() {
		super.move();
		System.out.println("Dogs can walk & run");
}
}
public class Overriding2 {
	public static void main(String[] args) {
		Animal2 b=new Dogs();
		b.move();
}
}
