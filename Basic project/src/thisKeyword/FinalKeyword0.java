package thisKeyword;

public class FinalKeyword0 {

	

	final int speedlimit;// blank final variable
	FinalKeyword0() {
		speedlimit = 70;
		System.out.println(speedlimit);
	}
	public static void main(String args[]) {
		FinalKeyword0 f1=new FinalKeyword0();
		System.out.println(f1.speedlimit); 
	}
	
}
