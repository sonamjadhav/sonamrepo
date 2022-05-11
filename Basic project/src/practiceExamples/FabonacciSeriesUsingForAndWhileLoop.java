package practiceExamples;

public class FabonacciSeriesUsingForAndWhileLoop {
	 public static void main(String[] args)
	 {
		 int count=7,num1=0,num2=1;
		 System.out.print("Fabonacci series of "+count+" numbers: ");
		 
//		 for(int i=1; i<=count; i++)
//		 {
//			 System.out.print(num1+" ");
//			 int sum=num1+num2;
//			 num1=num2;
//			 num2=sum;
//		 }
		 
		 int i=1;
		 while(i<=count)
		 {
			 System.out.print(num1+" ");
			 int sum=num1+num2;
			 num1=num2;
			 num2=sum;
			 i++;
		 }
	 }
}
