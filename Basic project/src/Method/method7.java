package Method;

public class method7 {
	public static void main(String[] args) {
			System.out.println("Program starts....");
		int res=sample(12,34);
			System.out.println("Result is "+res);
			System.out.println("**********");
		int res1=sample(23,64);
			System.out.println("Result is "+res1);
			System.out.println("Program ends....");
}
		static int sample(int a,int b) {
			System.out.println("Running sample method");
			System.out.println("Value of a is "+a);
			System.out.println("Value of b is "+b);
			int sum=a+b;
			return sum;
	}
}
