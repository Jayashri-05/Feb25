/*Question 5: Student Pass/Fail Status with Nested Switch 
Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in. */
import java.util.Scanner;
class PassFail{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();int d=sc.nextInt();
System.out.println("Enter the score of three subjects : "+a +" "+b +" "+c);
d=a||b||c;
Switch(d)
{
case d:
	
		System.out.println("Fail");
		break;

case b:
	if(b<40)
		System.out.println("Fail");
		break;
case c:
	if(c<40)
		System.out.println("Fail");
		break;
}

}
}


 