/*Snippet 18: 
public class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a + b * 2; 
 System.out.println(result); 
 } 
} */
/*Error:
error: class Main is public, should be declared in a file named Main.java
public class Main {
*/
/*Explanation:
->For compilation error public keyword is removed from class Main
*/
//corrected code
class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 int b = 5; 
 int result = a + b * 2; 
 System.out.println(result); 
 } 
} 
//Output:20