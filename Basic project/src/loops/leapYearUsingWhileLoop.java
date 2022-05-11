package loops;

public class leapYearUsingWhileLoop {
	
	public static void main(String[] args) {
		int num=2016;
		while(num!=0) {
			if((num%400==0) || (num%4==0) && (num%100!=0) ) {
				System.out.println("This is a leap year");
				break;
			}
			else {
				System.out.println("This is not a leap year");
				break;
			}
		}
		}
}

