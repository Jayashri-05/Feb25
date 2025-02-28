/*Snippet 16: 
public class Main { 
 public static void main(String[] args) { 
 int num = 10; 
 double result = num / 4; 
 System.out.println(result); 
 } 
}*/
/* Errors:
	error1: class Main is public, should be declared in a file named Main.java
		public class Main {
      		 ^
*/
/*Explanation:
->For compilation error1 public keyword is removed from class Main
*/
//Correct code
class Main { 
 public static void main(String[] args) { 
 int num = 10; 
 double result = num / 4; 
 System.out.println(result); 
 } 
}
//Output:2.0