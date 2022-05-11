package operators;

public class UnaryOp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b;
		b=a++ + ++a + a;
		System.out.println(a);//2
		System.out.println(b);//4
		
		a=0;
		b=a-- + --a + --a + a;
		System.out.println(a);//-3
		System.out.println(b);//-8
				
		a=0;
		b=--a + --a + --a + a + ++a + a++;
		System.out.println(a);//-1
		System.out.println(b);//-13
		
		a=0;
		b=a-- + a + ++a + a++ + ++a + a++ +a;
		System.out.println(a);//3
		System.out.println(b);//6
	}

}
//2
//0+2+2=4

//-3
//0+(-2)+(-3)+(-3)=-8

//-1
//-1+(-2)+(-3)+(-3)+(-2)+(-2)=-13

//3
//0-1+0+0+2+2+3=6