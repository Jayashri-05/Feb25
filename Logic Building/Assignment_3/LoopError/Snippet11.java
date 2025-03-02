/*Snippet 11: 
public class IncorrectLoopUpdate { 
 public static void main(String[] args) { 
 int i = 0; 
 while (i < 5) { 
 System.out.println(i); 
 i += 2; // Error: This may cause unexpected results in output 
 } 
 } 
}
Compilation error: class IncorrectLoopUpdate is public, should be declared in a file named IncorrectLoopUpdate.java
public class IncorrectLoopUpdate {
Explanation:
->For error1 public word is removed from class IncorrectLoopUpdate.
->After removing error1 output is 0 2 4 but to print sequence from 0 to 4 with increment of 1 we need to do i+=1;
*/
//Corrected code:
class IncorrectLoopUpdate { 
 public static void main(String[] args) { 
 int i = 0; 
 while (i < 5) { 
 System.out.println(i); 
 i += 1; // Error: This may cause unexpected results in output 
 } 
 } 
}
/*Output:
0
1
2
3
4*/