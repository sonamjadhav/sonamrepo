package piramid;

public class Piramid3 {

	public static void main(String[] args) {
		int A=65;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)A+" ");
			}
			A++;
			System.out.println();
		}
	}

}
