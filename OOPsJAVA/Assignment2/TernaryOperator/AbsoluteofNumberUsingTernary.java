/*Q20:  Implement a Java program that  returns the absolute value  of a given number using 
the ternary operator (without using  Math.abs()  ). */

import java.util.Scanner;

class AbsoluteofNumberUsingTernary{

    public static void main(String args[]) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number=sc.nextInt();
		int Output=number>=0 ? number :(-(number));
		System.out.println("Absolute of "+number+" is "+Output);
		}
	}
	/*Output:
	Enter any number:
	-56482
	Absolute of -56482 is 56482
*/
