package arraysPractice;

public class leftRotatetheElementsofAnArray {
	public static void main(String[] args) {
		
//		System.out.println("Original array: ");
		
		int a[]= {1,2,3,4,5,6};
		
//		for (int i=0; i<a.length; i++)
//		{
//			System.out.print(a[i]+" ");
//		}
//		
//		System.out.println();
//		System.out.println("Array after left rotate: ");
//		
		int n=3;
		
		for (int j=1; j<=n; j++)
		{
			int first= a[0];
		
		for (int i=0; i< a.length-1; i++)
		{
			a[i]=a[i+1];		
	}
		a[a.length-1]=first;
}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
}
}