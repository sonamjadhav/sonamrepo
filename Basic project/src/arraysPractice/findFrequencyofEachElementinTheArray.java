package arraysPractice;

public class findFrequencyofEachElementinTheArray {
	public static void main(String []Args) {
		int arr[]= {3,2,3,2,4,5,1,2,4,2};
		int f[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		
		for(int i=0; i<arr.length; i++)
		{
			int count=1;
			for (int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j]) {
					count++;
					f[j]=0;
				}
				
			}
		if (f[i] !=0) {
			f[i]=count;
		}
		}
		
		for(int i=0; i<arr.length; i++) 
		{
			if(f[i]!=0) {
				System.out.println(arr[i]+" comes "+f[i]+" times ");
			}
		}
}
}
