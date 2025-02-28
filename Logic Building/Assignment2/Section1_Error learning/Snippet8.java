/*Snippet 8: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!" 
 } 
} */
/*Errors
	->Compilation errors:
		 error1: ')' expected
                        System.out.println("Hello, World!"
							  ^
		  error2: class Main is public, should be declared in a file named Main.java
		public class Main {
    
*/
/*Explanation
		->For compilation error1 ')'given at the end of statement"System.out.println("Hello, World!" " and terminated the 		  statement by ';'.
		->For compilation error2 public keyword is removed from class Main
*/
//correct code

class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!" );
 } 
}

//Output:Hello, World!