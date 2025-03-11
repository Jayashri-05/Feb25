// Q.6 Write a program to find the  largest of three numbers  using only the  ternary operator (  ? :)
import java.util.Scanner;
class LargestUsingTernaryOp{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter all three numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=c>(a>b?a:b)?c:((a>b)?a:b);
System.out.println("Largest Number:"+d);
}
}
/*
Output:
21
45
58
Largest Number:58S
*/