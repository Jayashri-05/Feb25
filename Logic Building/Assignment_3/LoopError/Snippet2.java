/*Snippet 2: 
public class IncorrectWhileCondition { 
 public static void main(String[] args) { 
 int count = 5; 	qw
 while (count = 0) { 
 System.out.println(count); 
 count--; 
 } 
 } 
} 
Compilation Error1 :class IncorrectWhileCondition is public, should be declared in a file named IncorrectWhileCondition.java public class IncorrectWhileCondition {
       ^
error2: incompatible types: int cannot be converted to boolean
 	while (count = 0) {
              	^:
Explanation:
->For error1 public word is removed from class IncorrectWhileCondition.
->for error2 Assignment operator is replace by equal to operator.
*/

//Corrected code
class IncorrectWhileCondition { 
 public static void main(String[] args) { 
 int count = 5; 
 while (count== 0) { 
 System.out.println(count); 
 count--; 
 } 
 } 
}
//Output:no output is printed.As count=5 not decrementing
 