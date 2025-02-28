/*Snippet 14: 
public class Main { 
 public static void main(String[] args) { 
 double num = "Hello"; 
 System.out.println(num); 
 } 
} */
/* Errors: 
	Error1:class Main is public, should be declared in a file named Main.java
		public class Main {
       		^
	error2: incompatible types: String cannot be converted to double
		 double num = "Hello";
              ^
*/
/*Explanation:
 ->For compilation error1 public keyword is removed from class Main
 ->Error2 is because in given code num is "double Data type" variable and is assigne a String data ,Hence to remove this error I need to take num as string datatype.

*/
//Correct code
 class Main { 
 public static void main(String[] args) { 
 String num = "Hello"; 
 System.out.println(num); 
 } 
}
