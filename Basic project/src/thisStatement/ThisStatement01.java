package thisStatement;

public class ThisStatement01 {
	ThisStatement01()
	{
		System.out.println("******Zero-Param*********");
	}
	ThisStatement01(int age)
	{
		this();
		System.out.println("******int-Param*********");
	}
	ThisStatement01(char c, double d)
	{
		this(25);
		System.out.println("******char-double-Param*********");
	}
	public static void main(String[] args) {
		ThisStatement01 t3=new ThisStatement01('c',25.36);
	}
}
