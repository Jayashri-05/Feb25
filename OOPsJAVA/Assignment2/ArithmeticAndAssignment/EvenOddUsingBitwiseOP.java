/*Q2:  Write a program to check whether a given number is  even or odd  using only  bitwise 
operators  . 
Hint  : Use  n & 1  to check.*/
class EvenOddUsingBitwiseOP{
public static void main(String args[]){
int a=10;
//The last bit of all odd numbers is always 1, while for even numbers it's 0.
if((a & 1) == 0)
       System.out.println("Even");
    else
        System.out.println("Odd");
		}
	}/*
	Output:
	Even*/