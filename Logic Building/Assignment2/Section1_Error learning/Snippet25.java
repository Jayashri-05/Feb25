/*Snippet25: 
public class Switch { 
 public static void main(String[] args) { 
 double score = 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
}
=>Error:
 error1: class Switch is public, should be declared in a file named Switch.java
public class Switch {
       ^
error2: incompatible types: possible lossy conversion from double to int
 switch(score) {
       ^
=>Explanation:
->error1: remove public keyword from Switch class
->Error2:to remove 2nd error I have done typecasting.
*/

/* Error to Investigate: Why does this code not compile? What does the error tell you about the types allowed in switch expressions? How can you modify the code to make it work? 
->Switch case does not allowed Double,boolean,long,float type.
*/
//Corrected code
class Switch { 
 public static void main(String[] args) { 
int score =(int) 85.0; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 
//Output:Great job!
