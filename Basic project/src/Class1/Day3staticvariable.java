package Class1;

public class Day3staticvariable {
	static byte rollnumber;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********Program starts**********");
		System.out.println("What is your rollnumber?");
		System.out.println("This is your rollnumber"+rollnumber);
		rollnumber=120;
		System.out.println("What is your rollnumber?");
		System.out.println("This is your rollnumber"+rollnumber);
		byte rollnumber=100;
		System.out.println("What is your rollnumber?");
		System.out.println("This is your rollnumber"+rollnumber);
		System.out.println("This is your rollnumber"+Day3staticvariable.rollnumber);
		rollnumber=98;
		System.out.println("This is your rollnumber"+rollnumber);
		System.out.println("**********Program ends*******");
	}

}
/*****Program starts********
What is your rollnumber?
This is your rollnumber0
What is your rollnumber?
This is your rollnumber120
What is your rollnumber?
This is your rollnumber100
This is your rollnumber120
This is your rollnumber98
**********Program ends*********/