/*Snippet 4: 
public class Main { 
 public static void main() { 
 System.out.println("Hello, World!"); 
 } 
} */

/*Errors:
	->error1(Compilation error):class Main is public, should be declared in a 		file named Main.java
	         public class Main {
	->error2:Main method not found in class Main, please define the main method 		as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
 */

/*Explanation :
	->For error1 removed the public keyword from class Main
	->For error 2 Main method is written in proper syntax as:
		public static void main(String[] args)
*/

//Correct code
 class Main { 
public static void main(String[] args)
 { 
 System.out.println("Hello, World!"); 
 } 
} 
    