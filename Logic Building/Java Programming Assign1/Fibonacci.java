/*14. Print the Fibonacci Series 
Write a Java program to print the Fibonacci series up to the 10th number.*/
class Fibonacci{
public static void main(String args[])
{
	int num=0,num1=1;
	int F;
	for(int i=0;i<10;i++)
	{
	 System.out.print(num + " ");

	    F=num1+num;
	    num= num1;
            num1 = F;

        }
    }
}
//Output:- 0 1 1 2 3 5 8 13 21 34 