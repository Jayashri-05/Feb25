/*Snippet 10: 
public class IncorrectWhileLoopControl { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num = 10) { 
 System.out.println(num); 
 num--; 
 } 
 } 
} 
Compilation Error1: class IncorrectWhileLoopControl is public, should be declared in a file named IncorrectWhileLoopControl.java
public class IncorrectWhileLoopControl {
 error2: incompatible types: int cannot be converted to boolean
 while (num = 10) {
            ^
Explanation:
->For error1 public word is removed from class IncorrectWhileLoopControl.
->To remove error2 while (num = 10) is replace by while (num>=10).
->After removing both the errors output was 10.but to print sequence from 10 to 0 I made some changes mention above.
*/
//Corrected code:
class IncorrectWhileLoopControl { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num >=0) { 
 System.out.println(num); 
 num--; 
 } 
 } 
} 
/*Output:
10
9
8
7
6
5
4
3
2
1
0*/