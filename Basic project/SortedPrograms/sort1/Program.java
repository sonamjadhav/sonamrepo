package sort1;

import blocks.Blocks6;

//Class,Method,Operators,Conditions,Loops,SwitchStatement,Blocks,Constructor,ThisStatement,Keyword

public class Program {
	byte age;
	int rollid;
	static short employeeid;
	final int Customer = 456;

	public static void main(String[] args) {
//Local, Static,Nonstatic and Final Variables		
		short employeeid = 25;
		byte age = 28;
		final int Customerid;
		int rollid = 100;

		Program P = new Program();

		System.out.println("The age is: " + age);//28
		System.out.println("The age is: " + P.age);//0
		age = 30;
		P.age = 20;
		System.out.println("The age is: " + age);//30
		System.out.println("The age is: " + P.age);//20

		System.out.println("The rollid is: " + rollid);//100
		System.out.println("The rollid is: " + P.rollid);//0

		System.out.println("The employeeid is: " + employeeid);//25
		System.out.println("The employeeid is: " + Program.employeeid);//0

		System.out.println("The customer is: " + P.Customer);
		Customerid = 200;
		System.out.println("The Customerid is: " + Customerid);

		main(2, 4);
		Program.Get1(20, 30);
		Get1(20, 30, 10);
		int m = Get1(10, 25);
		m = m * 100;
		System.out.println(m);
		Get(45, 30);
		System.out.println(Program.Get1(60, 2));

		P.Get2(40, 10.5);
		P.Get2(40, 10.5, 25);
		P.Get3(30, 12.5);

		P.Aoperators();
		P.Roperators();
		P.Loperators();
		P.Uoperators();

		ifcondition();
		ifcondition1();
		
		forloop();
		dowhileloop();
		whileloop();
		
		switchstatement();
		blocks();
	}

//Static, Nonstatic Methods	and method overloading
	public static void main(int d, int e) {
		System.out.println("I am using java: " + d * e);
	}

	public static int Get1(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int Get1(int a, int b, int c) {
		int sum1 = a + b + c;
		return sum1;
	}

	static void Get(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	double Get2(double num, double num1) {
		double n = num * num1;
		return n;
	}

	double Get2(double num, double num1, int num2) {
		double n = num * num1 * num2;
		return n;
	}

	void Get3(double num, double num1) {
		double n = num * num1;
		System.out.println(n);
	}

//Operators-Arithmetic,Relational,Logical,Unary
	void Aoperators() {
		int a = 5, b = 2;
		int add = a + b;
		System.out.println(add);
		int Sub = a - b;
		System.out.println(Sub);
		int mul = a * b;
		System.out.println(mul);
		int Div = a / b;
		System.out.println(Div);
		int mod = a % b;
		System.out.println(mod);
	}

	void Roperators() {
		int a = 5, b = 2;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
	}

	void Loperators() {
		int a = 5, b = 2;
		boolean res1, res2, res3;
		res1 = a > b;
		res2 = a != b;
		res3 = a < b;
		System.out.println(res1 && res2);
		System.out.println(res1 || res3);
		System.out.println(!(res1 && res3));
	}

	void Uoperators() {
		int a = 5, b;
		b = a + ++a + --a + a-- + a++ + a + ++a;
		System.out.println(a++ + --a + a + ++a + --a + a-- + a);//42
		System.out.println(b);//36
	}

//Conditions
	static void ifcondition() {
		int age = 50;
		if (age != 0) {
			if (age <= 10) {
				System.out.println(age);
			} else {
				System.out.println("not matched age");
			}
		} else {
			System.out.println("Age is not valid");
		}
	}

	static void ifcondition1() {
		int speed = 60;
		if (speed == 0) {
			System.out.println("Speed is very slow");
		}
		else if (speed>100) {
			System.out.println("Speed is very high");
		}
		else if(speed<=30) {
			System.out.println("Speed is very medium");
		}
		else{
			System.out.println("Speed is ok");
		}
	}
//ForLoop, WhileLoop, DoWhileLoop	
	static void forloop() {
		for(int i=1;i<11;i++) {
			System.out.println(i);
		}
		System.out.println("*************Reverse****************");
		for(int i=10;i>0;i--) {
			System.out.println(i);
		}
	}
	
	static void dowhileloop() {
		int c = 10;
		System.out.println("Printing all the numbers from 10 till 1");
		do {
			// printing all the numbers till 10
			System.out.println(c);
			--c;
		} while (c > 0);
		
		int day=1;
		do {
			System.out.println("Day: "+day+" continue to play...");
			day++;
		}while(day<=30);
	}
	
	static void whileloop() {
		char c1='a';
		while(c1<='z')
		{
			System.out.print(c1+" ");
			c1++;
		}
		System.out.println("***Reverse***");
		char c2='z';
		while(c2>='a')
		{
			System.out.print(c2+" ");
			c2--;
		}
	}
	
//Switch statement	
	static void switchstatement() {
		int month = 4;
		switch (month) {
		case 1:
			System.out.println("Month is January");
			break;
		case 2:
			System.out.println("Month is February");
			break;
		case 4:
			System.out.println("Month is April");
			break;
		default:
			System.out.println("Sorry either the value you have given is invalid or not matched with any of the case.");
			break;
		}
	}
	
//Blocks
	static {		
		System.out.println("running static-block-1 of class Blocks2..");		
	}
	{
		System.out.println("running non-static-block-1 of class Blocks4..");
	}
	Program(){
		System.out.println("*****************");	
	}
	static void blocks() {
			System.out.println("main() Starts");
			Program b1=new Program();
			System.out.println("---------------------------------");
			Program b2=new Program();
			System.out.println("main() ends");
		}
		static {		
			System.out.println("running static-block-2 of class Blocks2..");		
		}
		{
			System.out.println("running non-static-block-2 of class Blocks4..");
		}
	
}
