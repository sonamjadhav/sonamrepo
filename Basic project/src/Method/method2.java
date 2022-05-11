package Method;

public class method2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Get interest using getInterest(): "+method2.getInterest(250000, 6.5, 60));
		System.out.println("Get interest using getInterest1(): "+method2.getInterest1(250000, 6.5, 60));
		method2.getInterest2(350000, 5, 36);
		System.out.println("**********************");
		double res=method2.getInterest(250000, 6.5, 60);
		System.out.println(res);
	}
	public static double getInterest(int p,double r,int t) {
		return (p*r*t)/100;
	}
			//or
	public static double getInterest1(int p,double r,int t) {
		double res=(p*r*t)/100;
		return res;
	}
		//or
	public static void getInterest2(int p,double r,int t) {
		double res=(p*r*t)/100;
		System.out.println("Interest is :"+res);
	}

}
