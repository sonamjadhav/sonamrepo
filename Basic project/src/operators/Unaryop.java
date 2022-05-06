package operators;

public class Unaryop {

	public static void main(String[] args) {
		int a = 10;
		int b = a;
		System.out.println("a: " + a);//10
		System.out.println("b: " + b);//10
		/**
		 * pre: first perform the operation dn use the updated value 
		 * post: first use the value dn perform the operation
		 */
		int k = ++a;
		System.out.println("k: " + k);//11
		System.out.println("a: " + a);//11
		int j = k++;//
		System.out.println("k: " + k);//12
		System.out.println("j: " + j);//11

		int r = 21;
		System.out.println("r=: " + r++);//21
		System.out.println("r=: " + r);//22
		System.out.println("r=: " + ++r);//23
		System.out.println("r=: " + r);//23

		int x = 105;
		System.out.println("x=: " + --x);//104
		System.out.println("x=: " + x);// 104
		System.out.println("x=: " + x--);// 104
		System.out.println("x=: " + x);// 103
	}

}
//a: 10
//b: 10
//k: 11
//a: 11
//k: 12
//j: 11
//r=: 21
//r=: 22
//r=: 23
//r=: 23
//x=: 104
//x=:104
//x=:104
//x=:103