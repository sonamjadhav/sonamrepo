package Class1;

public class Day2 {
	int phone;
	public static void main(String[] args) {
		
		Day2 ref=new Day2();
		System.out.println("Did you know my"+ref.phone+"number.");
//		Day2 ref1=new Day2();
		ref.phone=42772;
		System.out.println("Did you know my"+ref.phone+"number.");
		ref.phone=242772;
		System.out.println("Did you know my"+ref.phone+"number.");
	}

}
