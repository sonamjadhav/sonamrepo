package thisStatement;

public class ThisStatement001 {

	ThisStatement001()
	{
		this('c',25.36);
		System.out.println("******Zero-Param*********");
	}
	ThisStatement001(int age)
	{
		System.out.println("******int-Param*********");
	}
	ThisStatement001(char c, double d)
	{
		this(25);
		System.out.println("******char-double-param*********");
	}
	public static void main(String[] args) {
		
		ThisStatement001 t1=new ThisStatement001();
	}

}
