package inheritance;

public class InheritanceAssignment {
	void reverseNumber() {
		int num=256,rev=0,rem=0;
		for(;num!=0; ) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev+" is a reverse number");
	}
	public void palindrome() {
		int num=121, pal=0, rem=0;
		int originalNumber=num;
		for(;num!=0; ) {
			rem=num%10;
			pal=pal*10+rem;
			num=num/10;
		}
		if(originalNumber==pal){
		System.out.println("Number is a palindrome number.");
	}
		else {
			System.out.println("Number is not a palindrome number.");
		}
}
	void leapYear() {
		int year=2030;
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println("This is a leap year");
				}
				else {
					System.out.println("This is not a leap year");
				}
				
			}
			else {
				System.out.println("This is a leap year");
			}
		}
		else {
			System.out.println("This is not a leap year");
		}
	}
}
class Inheritance extends InheritanceAssignment{
	void reverseNumber() {
		super.reverseNumber();
			}
		public void palindrome() {
			super.palindrome();
			}
	void leapYear() {
		super.leapYear();
			}
	void leapYear(int i) {
		int result=i*2;
		System.out.println("This result is "+result );
	}
}
class InheritanceAssignment1{
	public static void main(String[] args) {
		Inheritance A1=new Inheritance();
		A1.reverseNumber();
		A1.palindrome();
		A1.leapYear();
		A1.leapYear(12);
	}
}
