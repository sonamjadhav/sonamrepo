package loops;

public class CheckPalindromeNumberUsingWhileLoop {

	public static void main(String[] args) {
		int num=121,rev=0,rem=0;
		int originalNumber=num;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
	}
		if(originalNumber==rev) {
			System.out.println("The number is palindrome.");
		}
		else {
			System.out.println("The number is not palindrome.");
		}
}
}
