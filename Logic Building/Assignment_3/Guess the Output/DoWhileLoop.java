//Snippet 4: 
public class DoWhileLoop { 
 public static void main(String[] args) { 
 int i = 1; 
 do { 
 System.out.print(i + " "); 
 i++; 
 } while (i < 5); 
 System.out.println(i); 
 } 
} 
/* Guess the output of this do-while loop. 
Here ther is do-while loop.int i=1; and i++ is incremental statement.
Dry Run:
		SOP Statement	i++ 	while(i<5);	SOP(i)
int i=1		1		2	True
int i=2		2		3	True
int i=3		3		4	True
int i=4		4		5	False		5
Output:
1 2 3 4 5*/