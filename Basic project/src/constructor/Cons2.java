package constructor;

public class Cons2 {
	int age;
	double salary;
	
	Cons2(){
		//explicit default constructors---> no para and empty body
	}
	public static void main(String[] args) {


		Cons2 c1=new Cons2();
		
		System.out.println(c1.age);//0
		System.out.println(c1.salary);//0.0

	}
}
