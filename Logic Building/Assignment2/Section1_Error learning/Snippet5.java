/*Snippet 5: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(int[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
} 
*/
/*Errors:
	-> error1: class Main is public, should be declared in a file named 			   Main.java
	           public class Main {
*/

/*Explanation
	->public keyword is removed from class Main

*/
//Correct code

 class Main { 
 public static void main(String[] args) { 
 System.out.println("Main method with String[] args"); 
 } 
 public static void main(int[] args) { 
 System.out.println("Overloaded main method with int[] args"); 
 } 
} 

//Output of code :Main method with String[] args