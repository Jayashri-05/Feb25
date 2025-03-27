//Assign.Que.4: Print Fibonacci series with java and recursion
import java.util.Scanner;
class FibonacciRecursion{
	static int fibonacii(int n){
	if(n<=1)
		return n;
		else{
			return fibonacii(n-1)+fibonacii(n-2);
		}
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number : ");
int n = sc.nextInt();
//for(int i=0;i<=n;i++) //Output 1
for(int i = n;i>=0;i--)
System.out.print(fibonacii(i)+"  ");
}
}
/*Output 1:
Enter the number : 7
0  1  1  2  3  5  8  13
Output 2:
Enter the number : 7
13  8  5  3  2  1  1  0*/