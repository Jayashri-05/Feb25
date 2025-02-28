/*Snippet 17: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a ** b; 
 System.out.println(result); 
 } 
}*/
/*Error:
	compilaton error1: illegal start of expression
 		int result = a ** b;
	error2: class Main is public, should be declared in a file named Main.java
		public class Main {
*/
/*Explanation:
->For compilation error1 ** operator is replaced by *
->For compilation error2 public keyword is removed from class Main
*/
//correct code
class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a*b; 
 System.out.println(result); 
 } 
}
//Output :50