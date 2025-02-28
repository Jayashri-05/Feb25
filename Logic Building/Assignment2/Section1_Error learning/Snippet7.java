/*Snippet 7: 
public class Main { 
 public static void main(String[] args) { 
 int x = "Hello"; 
 System.out.println(x); 
 } */
/*Errors:
	compilation errors:
	error1: reached end of file while parsing  }
	error2: class Main is public, should be declared in a file named Main.java
		public class Main {
    		   ^
	error3: incompatible types: String cannot be converted to int
 		int x = "Hello";
      			   ^
						   ^
*/
/*Explanation:
        ->For compilation error1 to remove,I add one more clossing curly bracket at the end pf the code
	->For compilation error2 Public keyword is removed from class Main
	->Error3 is because in given code X is an int type variable and is assigne a String data ,Hence to remove this error I need to take X as string datatype.

*/

//Correct code
class Main { 
 public static void main(String[] args) { 
 String x= "Hello"; 
 System.out.println(x); 
 }
 }