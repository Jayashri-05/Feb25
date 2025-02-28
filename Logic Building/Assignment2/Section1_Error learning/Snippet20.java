/*Snippet20: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World") 
 } 
} */
/*Error
	Compilation error1:';' expected
                         System.out.println("Hello, World")
 							   ^
 Compilation error2: class Main is public, should be declared in a file named     			Main.java
		public class Main {
      			 ^
*/
/*Explanation:
->For compilation error1 I put semicolon "System.out.println("Hello, World")"
 							                   ^
 ->For compilation error2  public keyword is removed from class Main

*/
//Corrected code
class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World") ;
 } 
} 

