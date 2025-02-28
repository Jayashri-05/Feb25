/*Snippet 11: 
public class Main { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[5]); 
 } 
} */
/*Errors:
	Compilation errors:
		 error1: class Main is public, should be declared in a file named Main.java
		public class Main {
       		^
	Runtime error:
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3

*/
/*Explanation:
	->For compilation error1 public keyword is removed from class Main
	->There is Runtime error because we are thrying to print the element at index 5 but the size of given array is 3.
		Hence we are getting "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3"error.
		we can print any number under the range i.e.upto index 2.I am printing arr[2]. 
*/
//Correct code

class Main { 
 public static void main(String[] args) { 
 int[] arr = {1, 2, 3}; 
 System.out.println(arr[2]); 
 } 
} 
//Output: 3