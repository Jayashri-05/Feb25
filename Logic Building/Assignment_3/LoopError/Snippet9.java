/*Snippet 9: 
public class InfiniteForLoopUpdate { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i += 2) { 
 System.out.println(i); 
 } 
 } 
} 

Compilation  error: class InfiniteForLoopUpdate is public, should be declared in a file named InfiniteForLoopUpdate.java
public class InfiniteForLoopUpdate {
	^
Explanation:
->For error1 public word is removed from class InfiniteForLoopUpdate.
->I made code to print from 0 to 4 for that i+=1.
*/
//Corrected code:
class InfiniteForLoopUpdate { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i += 1) { 
 System.out.println(i); 
 } 
 } 
} 
/*Output:
0
1
2
3
4*/
