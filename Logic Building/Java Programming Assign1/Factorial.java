/*15. Find the Factorial of a Number 
Write a Java program to find the factorial of a number.*/
class Factorial {
public static void main(String[] args){

   int num = 5;
   long fact = 1;
        for(int i = 1; i <= num; ++i)
        {
             fact=fact*i;
        }
        System.out.printf("Factorial of "+num+" is "+fact);
    }
}

	
//Output:Factorial of 5 is 120