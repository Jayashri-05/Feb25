/*12. Reverse a Number 
Write a Java program that takes a number as input and prints the reverse of that number.*/
class ReverseNum{
public static void main(String args[])
{
int a=12345, b=0;
while(a!=0)
{
	int D=a%10;
	b=b*10+D;
	a=a/10;
}
System.out.println("Reversed of 12345 is "+b);
}
}

//Output:-Reversed of 12345 is 54321