/*Snippet21: 
public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 // Missing closing brace here 
}*/
/*Error:
	Compilation error1: reached end of file while parsing }
							      ^
		    Error2:class Main is public, should be declared in a file named Main.java
                           public class Main {
*/
/*Explanation:
->For compilation error1 number of opening and closing curly braces are made same.
->For compilation error public keyword is removed from class Main
*/
//correct code
class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 // Missing closing brace here 
}
}

//Output : Hello, World!


 							       
