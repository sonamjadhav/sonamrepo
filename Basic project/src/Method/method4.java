package Method;

public class method4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Starts...");
		method4 m1=new method4();
		m1.additionOfTwoNumbers(25, 45);
		
		double res=m1.getAdditionOfTwoNumbers(25, 45);
		System.out.println("Result: "+res);
		double total=res*100-58;
		System.out.println("Total sum:"+total);
		
		System.out.println("Sum: "+m1.getAdditionOfTwoNumbers(25, 45));
		System.out.println("Program ends...");
	}
	public void additionOfTwoNumbers(int p,int t)//int p=25; int t=45;
	{
		int rt=p+t;
		System.out.println("Addition result is: "+rt);
	}
	
	public double getAdditionOfTwoNumbers(double p,double t) {
		double wq=p+t;
		return wq;
	}

}
