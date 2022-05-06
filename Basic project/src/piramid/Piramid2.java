package piramid;

public class Piramid2 {
	
	public static void main(String[] args) {
		int i,j,k=1,row=4;
		for(i=0;i<row;i++){
			for(j=0;j<=i;j++){
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
		
}
}