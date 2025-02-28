//Snippet 1:
/*public class Main { 
 public void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} */


//-> What error do you get when running this code?

//Error:
   /* Main method is not static in class Main, please define the main method as:
   public static void main(String[] args)*/

//Correct code :
	public class Main { 
	 public static void main(String[] args) { 
 	System.out.println("Hello, World!"); 
 } 
} 

//Explanation of error:
/*There was an error because 'static' keyword was missing in Main method*/

