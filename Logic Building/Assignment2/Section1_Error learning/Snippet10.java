/*Snippet 10: 
public class Main { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 display(); 
 display(5); 
 } 
} */
/*Errors:
   Complation errors:
	error1: class Main is public, should be declared in a file named Main.java
		public class Main {
       		^
	error2: non-static method display() cannot be referenced from a static   		context
 		display();
 		^
	error3: non-static method display(int) cannot be referenced from a static 		context
 		display(5);
		 ^

*/
/*Explanation
	->For compilation error1 public keyword is removed from class Main
	->For 2nd and 3rd compilation error I made both Main methods as Static.
*/
//Correct code
class Main { 
 public static void display() { 
 System.out.println("No parameters"); 
 } 
 public static void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
 display(); 
 display(5); 
 } 
}
/*Output:
No parameters
With parameter: 5

