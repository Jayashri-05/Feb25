
import java.util.Scanner;

class StudentPassFail {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter percentage: ");
		float percent = sc.nextFloat();
		String result= percent>=40 ?"Pass" : "Fail" ;
		System.out.println("Result : "+result);
}
}		
/*Output1:
Enter percentage:
55
Result : Pass
Output2:
Enter percentage:
35
Result : Fail
*/