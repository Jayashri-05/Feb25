//Assignment1:Que1.Print the series of numberwith recursive java methods
import java.util.Scanner;
class NumberSeries{
static int series(int n){
		if(n==1){
		return 1;
	}else
	{
		System.out.print(n+"  ");
		return series(n-1);
	}
}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the digit till you want to print the series.");
	int n = sc.nextInt();
	System.out.println(series(n)+"  ");

}
}/*Output:Enter the digit till you want to print the series.
7
7  6  5  4  3  2  1*/
