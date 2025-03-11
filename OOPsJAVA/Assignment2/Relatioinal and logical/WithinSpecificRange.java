/*Q9:  Implement a Java program that checks if a number is  within a specific range (20 to 
50)  without using  if-else  . 
Hint  : Use  logical AND (  &&  ) in a print statement */

import java.util.Scanner;
class WithinSpecificRange{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
	System.out.println("Enter any number: ");
	int number=sc.nextInt();
	boolean range=(number>20 && number<50)?true:false;
	System.out.println(number+ "  is in range :"+range);
}
}
/*Output:
Enter any number:
35
35  is in range :true*/