/*Question 2: Days of the Week 
Write a program that uses a nested switch statement to print out the day of the week based on an 
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
is a weekday or weekend.*/
import java.util.Scanner;
class DayWeek{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter any integer value from 1 to 7  : ");
int d=sc.nextInt();
System.out.println("You entered "+d);
switch(d)
{
case 1:
System.out.println("Monday->Weekday");
break;
case 2:
System.out.println("Tuesadyday->Weekday");
break;

case 3:
System.out.println("Wednesday->Weekday");
break;

case 4:
System.out.println("Thursday->Weekday");
break;

case 5:
System.out.println("Friday->Weekday");
break;

case 6:
System.out.println("Saturday->Weekday");
break;

case 7:
System.out.println("Sunday->Weekend");
break;
default:
System.out.println("Number should be >0 and <8");
break;
}}}

