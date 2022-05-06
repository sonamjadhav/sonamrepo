package Method;

public class method6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Starts...");
		method6 m1=new method6();
		double res=m1.getInterest(250000, 5.6, 60);	
		System.out.println("Interest: "+res);
		System.out.println("Interest1:"+m1.getInterest1(350000, 6.9,72));		
		m1.getInterest2(550000, 7.5, 48);
		System.out.println("Program ends...");
	}
	public double getInterest(int p,double r,int t) {
		return (p*r*t)/100;
	}
			//or
	private double getInterest1(int p,double r,int t) {
		double res=(p*r*t)/100;
		return res;
	}
		//or
	void getInterest2(int p,double r,int t) {
		double res=(p*r*t)/100;
		System.out.println("Interest is :"+res);
	}

}
