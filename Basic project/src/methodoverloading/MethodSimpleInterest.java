package methodoverloading;

public class MethodSimpleInterest
{
    public static void main(String args[]) 
    {
        float principal=2000, rof=6, time=3, interest;
        
        System.out.print("Enter the Principal : "+principal);
       
        System.out.print("Enter the Rate of interest : "+rof);
       
        System.out.print("Enter the Time period : "+time);
       
        interest = (principal * rof * time) / 100;
        System.out.print("Simple Interest is: " +interest);
    }
    /**
     * method ---> static or non-static
     * 		 ---> return or not
     * 		 ---> argument or not
     */
}
//Enter the Principal : 2000.0Enter the Rate of interest : 6.0Enter the Time period : 3.0Simple Interest is: 360.0