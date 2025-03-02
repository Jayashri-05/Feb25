/*Snippet 6: 
public class MisplacedForLoopBody { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) 
 System.out.println(i); 
 System.out.println("Done"); 
 } 
} 
 Compilation error: class MisplacedForLoopBody is public, should be declared in a file named MisplacedForLoopBody.java public class MisplacedForLoopBody {
      					     ^
Explanation:
->For error1 public word is removed from class MisplacedForLoopBody.
->Put two SOP Statements inside the forloop by using curly bracket.
*/
//Corrected code:
class MisplacedForLoopBody { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) 
{
System.out.println(i); 
 System.out.println("Done"); 
}
 } 
}
/*snippet6-output:  |	Expected output
0		    |	0
1		    |	Done
2		    |	1
3	       	    | 	Done
4		    |	2
Done		    |	Done
		    |	3
		    |	Done
		    |	4
		    |	Done
*/
