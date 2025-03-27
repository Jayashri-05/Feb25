//Aasin.1:Que.3=>Calculate the factorial in java with recursion
import java.util.Scanner;
class FactorialRecursion{
	static int fact(int n){
		if(n==1){
			return 1;
			}
			else{
				return n*fact(n-1);
			}
		
	}

public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number :");
	int n=sc.nextInt();
	System.out.println(fact(n));
	
}
}
/*Output:Enter a number :5
120*/