/*Q14:  Write a program to count the  number of 1s (set bits)  in a binary representation of a 
number using bitwise operations. */

import java.io.*;
import java.util.Scanner;
class CountTheNumberOf1s {
    
    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    // driver program
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number: ");
	 int a=sc.nextInt();
	 System.out.println("Number of 1's in "+a+" is "+countSetBits(a)+".");
        
    }
}
/*Output:
Enter a number:
2
Number of 1's in 2 is 1.*/