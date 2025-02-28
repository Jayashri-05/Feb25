/*Snippet 13: 
public class Main { 
 public static void main(String[] args) { 
 String str = null; 
 System.out.println(str.length()); 
 } 
} */
/*Error
 error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
*/
/*Explanation:
>For compilation error public keyword is removed from class Main

*/
//Correct code

class Main { 
 public static void main(String[] args) { 
 String str = null; 
 System.out.println(str.length); 
 } 
}