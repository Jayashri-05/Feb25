/*19. Calculate the Power of a Number 
Write a Java program that calculates the power of a number. Take two numbers as input: the 
base and the exponent, and compute the result of base raised to the power of exponent.*/

import java.lang.Math;
class PowerOfNumber{
public static void main(String args[])
{
 int base=3,expo=4;
double result;
result=Math.pow (base,expo);
System.out.println(+base+" raised to the power "+expo+" is "+result);
}
}
//Output:3 raised to the power 4 is 81.0