package practiceExamples;

public class CountNumberOfDigitsInAnIntegerUsingForLoop {

	public static void main(String[] args) {
		 int count = 0,num=123456;

		    for (; num != 0;count++) {
		    	num=num/10;
		    }

		    System.out.println("Number of digits: " + count);
		  }

//	while(num!=0) {
//		num=num/10;
//		count++;
//	}
//	 System.out.println("Number of digits: " + count);
//	}
}
