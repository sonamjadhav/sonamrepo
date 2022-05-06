package methodoverloading;

public class MethodOverloading {

		static double res;
		static public void square() {
			System.out.println("No Parameter Method Called");
		}
		static public void square(int number) {
			res = number * number;
			System.out.println("Method with Integer Argument Called:" + res);
		}
		static public void square(double number) {
			res = number * number;
			System.out.println("Method with float Argument Called:" + res);
		}
		public static void main(String[] args) {
			System.out.println("Result: "+res);
			MethodOverloading.square(2.5f);
			System.out.println("Result: "+res);
			MethodOverloading.square();
			MethodOverloading.square(5);
			System.out.println("Result: "+res);
	}

}
