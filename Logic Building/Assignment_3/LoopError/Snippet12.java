/*Snippet 12: 
public class LoopVariableScope { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) { 
 int x = i * 2; 
 } 
 System.out.println(x); // Error: 'x' is not accessible here 
 } 
} 
Compilation Error1: class LoopVariableScope is public, should be declared in a file named LoopVariableScope.java public class LoopVariableScope {
Error2:error: cannot find symbol
 System.out.println(x); // Error: 'x' is not accessible here
                    ^
  symbol:   variable x
  location: class LoopVariableScope
Explanation:
->For error1 public word is removed from class LoopVariableScope.
->For error2 According to the 'scope of variables'variable define inside the for loop accessed within the loop only.Hence to print value of x,need to take SIOP Statement inside the for loop. 
*/
//Corrected code:
class LoopVariableScope { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) { 
 int x = i * 2; 
 
 System.out.println(x); // Error: 'x' is not accessible here 
 } 
}
} 
/*Output:
0
2
4
6
8*/