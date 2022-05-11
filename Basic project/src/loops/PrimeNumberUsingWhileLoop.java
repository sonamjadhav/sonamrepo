package loops;

public class PrimeNumberUsingWhileLoop {

	public static void main(String[] args) {
int number=11,count=0,i=1;

		while(i<=number){
		  if(number%i==0){
		    count++;
		  }
		 i++;
		}
		if(count==2){
		  System. out. println(number+" is Prime number");
		}
		else{
		  System. out. println(number+" is not Prime Number");
		}

		
}
}
	
