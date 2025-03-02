/*Snippet 7: 
public class UninitializedWhileLoop { 
 public static void main(String[] args) { 
 int count; 
 while (count < 10) { 
 System.out.println(count); 
 count++; 
 } 
 } 
} 
Compilation error1: class UninitializedWhileLoop is public, should be declared in a file named UninitializedWhileLoop.java public class UninitializedWhileLoop {
 error2: variable count might not have been initialized
 while (count < 10) {    					     ^
Explanation:
->For error1 public word is removed from class UninitializedWhileLoop.
->To remove error2 count must be initialize with any value.
here I initialize count=0
*/
//Corrected code:
class UninitializedWhileLoop { 
 public static void main(String[] args) { 
 int count=0; 
 while (count < 10) { 
 System.out.println(count); 
 count++; 
 } 
 } 
}
/*Out
0
1
2
3
4
5
6
7
8
9*/