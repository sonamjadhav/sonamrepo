package exception;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("program starts from here...");
		//1. abnormal statements
		int i = 10;
		try {
		int j = i/0;//ArithmeticException
		System.out.println("res: "+j);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception handled :"+e);
		}
		//2. abnormal statements
		int[] empIds=new int[3];
		try {
			empIds[3]=101;//ArrayIndexOutOfBoundsException 
		}
		catch (ArrayIndexOutOfBoundsException t){
			System.out.println("Exception handled :"+t);
		}
		//3. abnormal statements
		try {
		String str=null;
		System.out.println(str.length());//NullPointerException
		}
		catch (Throwable s) {
			System.out.println("Exception handled :"+s);
		}
		  
		//4. abnormal statements
		try {
		String s="abc";  
		int num=Integer.parseInt(s);//NumberFormatException
		System.out.println("num: "+num);
		}
		catch (Throwable u) {
			System.out.println("Exception handled :"+u);
		}
		System.out.println("Programs ends here...");
	}
}
