package arraysPractice;

public class CopyAllElementsofOneArrayIntoAnotherArray {
	public static void main(String[]args) {
		System.out.println("Before Coping");
		int a[]= {1,2,3,4,5,6};
		for(int i=0; i< a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("After Coping");
//		for (int i: a) {
//			System.out.println(i);
//}
		int b[]= new int [a.length];
		for(int i=0; i< a.length; i++) {
		b[i]=a[i];
}
		for(int i=0; i< b.length; i++) {
			System.out.print(b[i]);
		}
}
}