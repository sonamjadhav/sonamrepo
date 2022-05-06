package loops;

public class CheckArmstrongNumberFor3DigitNumberUsingWhileLoop {

	public static void main(String[] args) {
//		int num=156,a=1,b=5,c=6;
//		while(num!=0) {
//			if ((a*a*a+b*b*b+c*c*c)==num) {
//				System.out.println("The "+num+" is an armstrong number.");
//				break;
//			}
//			else {
//				System.out.println("The "+num+" is not an armstrong number.");
//				break;
//			}
//		}
//	}
//
//}
int num = 156, number, temp, total = 0;

number = num;
while (number != 0)
{
    temp = number % 10;
    total = total + temp*temp*temp;
    number /= 10;
}

if(total == num)
    System.out.println(num + " is an Armstrong number");
else
    System.out.println(num + " is not an Armstrong number");
}
}