package interviewQuestions;

public class InterviewBit{
	 int fun (int n) 
     {
         int result;
         result = fun (n - 1);
         return result;
     }
 } 
class Driver{
     public static void main(String args[]) 
     {
         InterviewBit ib = new InterviewBit();
         System.out.print(ib.fun(12));
     }
 
}
