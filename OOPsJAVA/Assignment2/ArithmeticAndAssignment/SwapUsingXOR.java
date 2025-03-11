/*Q1:  Write a program to swap two numbers  without using a third variable  and without 
using arithmetic operators like  +  or  -  . 
Hint  : Use bitwise XOR  ^  operator.*/
class SwapUsingXOR{
public static void main(String args[]){
int a=10;
int b=20;
System.out.println("Before Swapping a= "+a+"  b="+b);
a=a^b;
b=a^b;
a=b^a;
System.out.println("After swapping  a= "+a+"  b="+b);

}
}
/* Output:
Before Swapping a= 10  b=20
After swapping  a= 20  b=10*/