//Assignment 1:Que.2 =>Sum a series of numbers with java recursion
import java.util.Scanner;
class SumNumberSeries{
	static int sum(int n){
		if(n==1){
			return 1;
		}else
		return n+sum(n-1);
	}

public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the number: ");
	int n =sc.nextInt();
	System.out.print(sum(n)+"  ");
}

}/*Output:Enter the number: 5
15*/