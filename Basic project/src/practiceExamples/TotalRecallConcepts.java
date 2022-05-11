package practiceExamples;

public class TotalRecallConcepts {
	public static void main(String[] args) {
		main();
		example2(15, 20);
		example2(120, 1500);
		examples();
		RecallConcepts.practice(10, 5);
	}

	double salary;
	static byte rollnumber;

	static int examples() {
		rollnumber = 25;
		TotalRecallConcepts X1 = new TotalRecallConcepts();
		X1.salary = 45000;
		return 25;
	}

	double example2(byte x1, int x2) {
		x1 = 2;
		x2 = 4;
		double result = x1 * x2;
		System.out.println("The value of example2 is: " + result);
		return x1 * x2;
	}

	public static void main() {
		System.out.println("This is last method");
	}

	static void example2(int a1, int a2) {
		int copy = a1 - a2;
		System.out.println("The result is: " + copy);
	}

	static void example2(double x1, int x2, short x3) {
		double add = x1 + x2 + x3;
		System.out.println("The addition is :" + add);
	}
}
class RecallConcepts{
	public void main(String[]args) {
	}
	static void practice(int a, int b) {
		int hrs=a-b;
		System.out.println("I am doing practice of methods for atleast of "+hrs+" hrs");
		
		}
}
//This is last method
//The result is: -5
//The result is: -1380
//I am doing practice of methods for atleast of 5 hrs