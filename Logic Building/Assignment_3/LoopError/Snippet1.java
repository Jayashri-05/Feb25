/*Snippet 1: 
public class InfiniteForLoop { 
 public static void main(String[] args) { 
 for (int i = 0; i < 10; i--) { 
 System.out.println(i); 
 } 
 } 
}

Compilation Error1: class InfiniteForLoop is public, should be declared in a file 		   named InfiniteForLoop.java public class InfiniteForLoop {
Explanation:Error1 is coming because class InfiniteForLoop is declared as public.
After removing error this code gives Infinite output,to make it finite  instead of decrement we will increment the value of i.
*/
//Corrected code
class InfiniteForLoop { 
 public static void main(String[] args) { 
 for (int i = 0; i < 10; i++) { 
 System.out.println(i); 
 } 
 } 
}
/*Ouput:
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