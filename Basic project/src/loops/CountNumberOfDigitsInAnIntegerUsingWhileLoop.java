package loops;

public class CountNumberOfDigitsInAnIntegerUsingWhileLoop {

	public static void main(String[] args) {
		int num=1458965656,count=0;
		while(num!=0) {
			num=num/10;
			count=count+1;
		}
		System.out.println("The number of digits are: "+count);
	}

}
