/*Snippet23: 
public class Confusion { 
 public static void main(String[] args) { 
 int value = 2; 
 switch(value) { 
 case 1: 
 System.out.println("Value is 1"); 
 case 2: 
 System.out.println("Value is 2"); 
 case 3: 
 System.out.println("Value is 3"); 
 default: 
 System.out.println("Default case"); 
 } 
 } 
} */
/*Error:
->error: class Confusion is public, should be declared in a file named Confusion.java
   public class Confusion {
          ^
*/
/*Explanation:
->For compilation error public keyword is removed from class Main

*/
/*Error to Investigate: Why does the default case print after "Value is 2"? How can you prevent the program from executing the default case?
->As there is no break statement after case 2:,All next statments including break  	are executed.Hence put break keyword in case2.


//Corrected code
class Confusion { 
 public static void main(String[] args) { 
 int value = 2; 
 switch(value)
 { 
 case 1: 
        System.out.println("Value is 1"); 
 case 2: 
        System.out.println("Value is 2");
        break; 
 case 3: 
        System.out.println("Value is 3");
	
 default: 
        System.out.println("Default case"); 
	
 } 
 } 
} 
//output:Value is 2
