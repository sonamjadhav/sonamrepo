package practiceExamples;

public class ReverseNumberUsingForLoop {

	public static void main(String[] args) {
		int num=123,rev=0,rem=0;
		for(; num!=0; ) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("The reverse number is: "+rev);
	}

}
