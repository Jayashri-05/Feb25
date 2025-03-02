/*Snippet 3: 
public class DoWhileIncorrectCondition { 
 public static void main(String[] args) { 
 int num = 0; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num > 0); 
 } 
} 
Compilation Error1 :class IncorrectWhileCondition is public, should be declared in a file named IncorrectWhileCondition.java public class IncorrectWhileCondition {
       ^
Explanation :
->For error1 public word is removed from class  DoWhileIncorrectCondition.
->After execution this code is giving infinite answer.
To print output only once we need to change while condition as(num<0).
*/
//Corrected code
class DoWhileIncorrectCondition { 
 public static void main(String[] args) { 
 int num = 0; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num < 0); 
 } 
} 
//Output:0
