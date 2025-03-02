/*6. Basic Arithmetic Operations 
Write a Java program to print the sum, multiplication, subtraction, division, and remainder of 
two numbers. 
Test Data: 
 Input first number: 125 
 Input second number: 24 
Expected Output: 
125 + 24 = 149 
125 - 24 = 101 
125 x 24 = 3000 
125 / 24 = 5 
125 mod 24 = 5
*/
class Basicarith{
	public static void main(String args[]){
	int a=125,b=24,c;
	c=a+b;
	System.out.println("125+24="+c);
	c=a-b;
	System.out.println("125-24="+c);
	c=a*b;
	System.out.println("125*24="+c);
	c=a/b;
	System.out.println("125/24="+c);
	c=a%b;
	System.out.println("125mod24="+c);
}
}
/*Output:
125+24=149
125-24=101
125*24=3000
125/24=5
125mod24=5
*/