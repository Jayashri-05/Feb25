/*Q15:  Implement a program to swap  odd and even bits  of a number using bitwise 
operators. 
Hint  : Use masks:  (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1 */
import java.util.Scanner;
class SwapOddAndEvenBits{
     

    static int swapBits(int x)
    {
        // Get all even bits of x
        int even_bits = x & 0xAAAAAAAA; 
     
        // Get all odd bits of x
        int odd_bits = x & 0x55555555; 
     
        // Right shift even bits
        even_bits >>= 1; 
         
        // Left shift even bits
        odd_bits <<= 1; 
         
        // Combine even and odd bits
        return (even_bits | odd_bits); 
    }
     
    // Driver program to test above function
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number: ");
	 int x=sc.nextInt();//23-> 00010111
     
        // Output is 43 (00101011)
        System.out.println(swapBits(x));
    }
}
/*
Output:
Enter a number:
10
5*/