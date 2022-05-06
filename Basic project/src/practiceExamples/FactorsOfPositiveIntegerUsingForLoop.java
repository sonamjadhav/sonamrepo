package practiceExamples;

public class FactorsOfPositiveIntegerUsingForLoop {

	public static void main(String[] args) {
		System.out.print("Factors of the number are: ");
		int num=20;
		for(int i=1;i<=100;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				
			}
		}
	}

}
