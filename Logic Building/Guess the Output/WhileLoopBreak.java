//Snippet 3: 
public class WhileLoopBreak { 
 public static void main(String[] args) { 
 int count = 0; 
 while (count < 5) { 
 System.out.print(count + " "); 
 count++; 
 if (count == 3) break; 
 } 
 System.out.println(count); 
 } 
} 
/* Guess the output of this while loop:
Here there is one condition statement and one while loop.
int count=0;
while loop:
		  SOP Statement		count++		if(count==3)
(count<5)-True      0			1		False
(count<5)-True      1			2		False
(count<5)-True      2			3		True-------------Break
		    3
Output:
0 1 2 3
Because of break statement in if();
compiler jump out of the loop and execute the SOP statement just after the loop
*/