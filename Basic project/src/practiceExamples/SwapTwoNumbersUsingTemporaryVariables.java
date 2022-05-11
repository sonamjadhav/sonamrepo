package practiceExamples;

public class SwapTwoNumbersUsingTemporaryVariables {

	public static void main(String[] args) {
		int num1=25,num2=30;
		System.out.println("********Before swap*********");
		System.out.println("The value of num1 is "+num1);
		System.out.println("The value of num2 is "+num2);
		
		int temporary=num1;
		num1=num2;
		num2=temporary;
		System.out.println("********After swap*********");
		System.out.println("The value of num1 is "+num1);
		System.out.println("The value of num2 is "+num2);
		
		

	}

}
