package loops;

public class CheckNumberIsPrimeUsingForLoop {

	public static void main(String[] args) {
		int number=13,count=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count=count+1;
			}
		}
		if(count==2){
			  System. out. println(number+" is Prime number");
			}
			else{
			  System. out. println(number+" is not Prime Number");
			}

	}

}
