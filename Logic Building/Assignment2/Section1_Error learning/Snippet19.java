/*Snippet 19: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 0; 
 int result = a / b; 
 System.out.println(result); 
 } 
}  */
/*Error:
error: class Main is public, should be declared in a file named Main.java
public class Main {
Runtime error:Exception in thread "main" java.lang.ArithmeticException: / by zero
*/
/*Explanation:
->For compilation error public keyword is removed from class Main
->We cannot devide any number by zero,Hence I am replacing '0' by '1'
*/
//correct code
class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 0; 
 int result = a/ b; 
 System.out.println(result); 
 } 
} 
//output: