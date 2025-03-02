/*Snippet 5: 
public class WrongInitializationForLoop { 
 public static void main(String[] args) { 
 for (int i = 10; i >= 0; i++) { 
 System.out.println(i); 
 } 
 } 
} 
Error:
Compilation Error1 :class WrongInitializationForLoop is public, should be declared in a file named WrongInitializationForLoop.java public class  WrongInitializationForLoop {
       ^
Explanation:
->For error1 public word is removed from class WrongInitializationForLoop.
->Given code gives infinite output Starting from 10 upto infinite to print output from 1 to 10 for(int i=1;i<=10;i++).

*/
//Corrected code:
class WrongInitializationForLoop { 
 public static void main(String[] args) { 
 for (int i=1;i<=10;i++) { 
 System.out.println(i); 
 } 
 } 
} 
/*Output:
1
2
3
4
5
6
7
8
9
10*/