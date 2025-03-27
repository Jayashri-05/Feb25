//Assign. Que.5 :A recursive java palindrome checker
import java.util.Scanner;
class PalindromeRecussion{
	static boolean PaliRecursion(String s,int sindex,int eindex){
		if(sindex>=eindex){
			return true;
		}
		if(s.charAt(sindex)!=s.charAt(eindex)){
			return false;
		}
		return PaliRecursion(s,sindex+1,eindex-1);
	}

public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the String : ");
	String s=sc.nextLine();
	int sindex=0;
	int eindex=s.length()-1;
	
if(PaliRecursion(s,sindex,eindex)){
	System.out.println(s+" is a palindrome.");
}	
	else 
		System.out.println(s+" is not a palindrome.");
}

}/*Output1:
Enter the String : Jaya
Jaya is not a palindrome.
Output 2:
Enter the String : rajar
rajar is a palindrome.
*/