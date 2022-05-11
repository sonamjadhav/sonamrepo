package practiceExamples;

public class FactorsOfNegativeNumberUsingForLoop {

	public static void main(String[] args) {
		System.out.print("Factors of the number are: ");
		int num=-20;
		for(int i=-20;i<=100;i++) {
			if (i==0) {
				continue;
			}
			else {
			if(num%i==0) {
				System.out.print(i+" ");
				
			}
		}
	}

}
}