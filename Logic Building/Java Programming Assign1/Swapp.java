/*8. Swap Two Numbers 
Write a Java program to swap the values of two variables without using a third variable.*/ 
class Swapp
{
public static void main(String args[]){
int a=10;
int b=20;
System.out.println("Before swapping :\n First number: "+a+"\nsecond number:"+b);
a=a+b;
b=a-b;
a=a-b;
System.out.print("After swapping : \nFirst number:"+a+" \nSecond number:"+b);

}
}
/*Output:
Before swapping: 
First number: 10 
Second number: 20 
After swapping: 
First number: 20 
Second number: 10 */