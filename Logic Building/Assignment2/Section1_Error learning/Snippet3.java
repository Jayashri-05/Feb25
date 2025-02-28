//Snippet 3: 
/*public class Main { 
 public static int main(String[] args) { 
 System.out.println("Hello, World!"); 
 return 0; 
 } 
}*/

// What error do you encounter? Why is void used in the main method?
/* Compilation error :
	->error1: class Main is public, should be declared in a file 	          named Main.java
	          public class Main {
	->error2:Main method must return a value of type void in   	         class Main, please define the main method as:
   	         public static void main(String[] args)
	->error 3:error: incompatible types: unexpected return value
 	         return 0;
*/
/*Explanation :
		->for error1 I removed public keyword from class 		Main
		->for error2 int in Main methode is replaced by void
		-> for error3 'return 0' is removed from code
*/

 class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 
 } 
}
