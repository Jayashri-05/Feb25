/*Snippet 8: 
public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num--; 
 } while (num > 0); 
 } 
} 
Compilation Error: class OffByOneDoWhileLoop is public, should be declared in a file named OffByOneDoWhileLoop.java
public class OffByOneDoWhileLoop {
Explanation:
->For error1 public word is removed from class OffByOneDoWhileLoop.
->After removing error1 given code's output is 1.adjustments are needed to print the numbers from 1 to 5 are  num++; and  while (num <=5); 

*/
//Corrected code
class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num <=5); 
 } 
} 
/*Expected output:
1
2
3
4
5*/