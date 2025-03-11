/*Q16:  Write a program that determines whether a given number is  positive, negative, or 
zero  using only the  ternary operator  . */

import java.util.Scanner;

public class PositiveNegativeTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter number to test");
		int number = sc.nextInt();
		
		//scan.close();

		//ternary operator to check number
		String result = number>0 ? "Positive" : "Negative";


		System.out.println(number +" is "+ result);	

	}

}
/*Output1:			|Output2:
Enter number to test|Enter number to test
0					|-14
0 is Negative		|14 is Negative
					|