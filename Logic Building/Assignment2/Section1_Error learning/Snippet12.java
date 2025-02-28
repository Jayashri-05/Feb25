/*Snippet 12: 
public class Main { 
 public static void main(String[] args) { 
 while (true) { 
 System.out.println("Infinite Loop"); 
 } 
 } 
} */
/*Error
 error: class Main is public, should be declared in a file named Main.java
public class Main {
       ^
*/
/*Explanation:
->For compilation error public keyword is removed from class Main

*/
//correct code
class Main { 
 public static void main(String[] args) { 
 while (true) { 
 System.out.println("Infinite Loop"); 
 } 
 } 
}
/*Output:
Infinite Loop
Infinite Loop
Infinite Loop
:
:
:infinite times
*/