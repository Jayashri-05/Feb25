/*Snippet 15: 
public class Main { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + num2; 
 System.out.println(result); 
 } 
} */
/* Errors:
	error1: class Main is public, should be declared in a file named Main.java
		public class Main {
      		 ^
	error2: incompatible types: possible lossy conversion from double to int
 		int result = num1 + num2;
                   ^
*/
/*Explanation:
->For compilation error1 public keyword is removed from class Main
->For Second error I have done typecasting from double to int type

*/
//correct code
class Main { 
 public static void main(String[] args) { 
 int num1 = 10; 
 double num2 = 5.5; 
 int result = num1 + (int)num2; 
 System.out.println(result); 
 } 
}
//Output:15