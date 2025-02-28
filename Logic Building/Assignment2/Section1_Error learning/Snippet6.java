/*Snippet 6: 
public class Main { 
 public static void main(String[] args) { 
 int x = y + 10; 
 System.out.println(x); 
 } 
} */

/*Errors :
	->Compilation errors:
		error1:class Main is public, should be declared in a file named 			Main.java
			public class Main {
		error2:cannot find symbol
 			int x = y + 10;
        			 ^
  			symbol:   variable y
  			location: class Main

 */
/*Explanation:
	->For compilation error1 public keyword is removed from class Main.
	->For compilation error2 we need to declare variable y as int datatype
	   and initialize with some value 		
*/
//correct code
class Main { 
 public static void main(String[] args) { 
 int y=5;
 int x = y + 10; 
 System.out.println(x); 
 } 
}

//Output :15 
	