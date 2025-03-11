/*Q.17:  Implement a Java program that finds the  minimum of four numbers  using nested 
ternary operators
*/
import java.util.Scanner;

class MinimumFourNumbersinTernary{
    public static void main(String args[]) 
    {
      String result;
    System.out.println("Enter the Mark scored");
    Scanner input = new Scanner(System.in);
    int mark = input.nextInt();
    result = (mark>=80) ? "Got A grade" : (mark>=60 && mark < 80) ? "Got B grade" :(mark>=45 && mark < 60) ? "Got C grade" :"Fail";	
    System.out.println(result);
    }
}
/*Output1:
Enter the Mark scored
45
Got C grade
Output2:
Enter the Mark scored
40
Fail
*/