package piramid;

public class Piramid4 {

	public static void main(String[] args) {
		int row=7;
		for(int i=1;i<row;i++) {
			for(int j=row-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}

}
