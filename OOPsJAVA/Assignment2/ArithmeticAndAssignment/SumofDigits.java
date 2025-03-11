/*Q3:  Implement a program that calculates the  sum of digits  of an integer using  modulus 
(  %  ) and division (  /  ) operators  . */
import java.util.Scanner;
class SumofDigits{
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to input an integer
        System.out.print("Input an integer: ");
        
        // Read the integer from the user
        long num = sc.nextLong();
        
        // Calculate and display the sum of the digits
        System.out.println("The sum of the digits is: " + sumDigits(num));
    }

    public static int sumDigits(long num) {
        int sum = 0;
        
        // Calculate the sum of the digits
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        
        return sum;
    }
}
/*
Output:
Input an integer: 25413
The sum of the digits is: 15*/