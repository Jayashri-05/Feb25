/*Q7:  Implement a Java program that checks whether a given year is a  leap year or not  using 
logical (  &&  ,  ||  ) operators */
import java.util.Scanner;
class LeapYear{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.println("Enter a year : ");
int year=sc.nextInt();
if((year %4==0 && year %100!=0 )|| year%400==0)
System.out.println(year+" is a Leap year.");
else 
System.out.println(year+" is not a Leap year.");
}
}
/*
Output:
Enter a year :
2012
2012 is a Leap year.

*/