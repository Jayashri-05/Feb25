/*Q19:  Write a Java program that checks whether a character is  uppercase, lowercase, or 
not a letter  using only the ternary operator.*/

import java.util.Scanner;

class UpperLower {
	
	 void UpperLower1(char ch)
	{
		//this.ch=ch;
		String result=(ch>='a' && ch<='z')?"Lower case letter":(ch>='A' && ch<='Z')?"Upper case letter":"Not a Letter";
		System.out.println("Result : "+result);
	}



	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter any Letter : ");
		char ch = sc.next().charAt(0);
		UpperLower obj=new UpperLower();
		obj.UpperLower1(ch);//UpperLower1(ch) is instance method therefore need to call with object.
		
	}
	
}
/*Output:
Enter any Letter :
S
Result : Upper case letter
Output:
Enter any Letter :
5
Result : Not a Letter
*/