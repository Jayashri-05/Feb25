/*Q13:  Implement a Java program to find the  absolute value  of an integer using bitwise 
operators.Hint  :  mask = num >> 31; abs = (num + mask) ^ mask;  */
import java.io.*;
class AbsoluteValueOfInteger  {

    static final int CHAR_BIT = 8;
    static final int SIZE_INT = 8;

    /* This function will return absolute value of n*/
    static int getAbs(int n)
    {
        int mask = n >> (SIZE_INT * CHAR_BIT - 1);
        return ((n + mask) ^ mask);
    }

    /* Driver code */
    public static void main(String[] args)
    {
        int n = -10;
        System.out.print("Absolute value of " + n + " is " + getAbs(n));
    }
}
//Output:Absolute value of -10 is 10