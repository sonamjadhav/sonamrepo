package piramid;

public class piramid1 {

	public static void main(String[] args) {
		printStar();
		revprintStar();
	}
		static void printStar() {
			for(char i='A';i<'E';i++) {
				for(char j='A';j<=i;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
		
		static void revprintStar() {
			for(int i=5;i>1;i--) {
				for(int j=1;j<i;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
	}


