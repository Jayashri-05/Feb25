/* Snippet 2: 
 public class Main { 
 static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} */

//What happens when you compile and run this code?

/*Compilation error: 
	class Main is public, should be declared in a file named 		 Main.java
         public class Main {   
*/

/* Explanation:
	As in snippet1 I saved java file as Main.java while saving snippet2 code I 'removed public keyward 'from class Main so that I can save snippet2 as Snippet2.java for avoiding duplication of Main.java file.
*/

//Correct code

 class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 
