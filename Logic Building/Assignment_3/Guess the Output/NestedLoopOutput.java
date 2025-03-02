//Snippet 1: 
public class NestedLoopOutput { 
 public static void main(String[] args) { 
 for (int i = 1; i <= 3; i++) { 
 for (int j = 1; j <= 2; j++) { 
 System.out.print(i + " " + j + " "); 
 } 
 System.out.println(); 
 } 
 } 
} 
// Guess the output of this nested loop. 
/*Dry Run:
There are two for loops.Code will execute as follows.
first loop 		second loop		Output
-----------     	-----------		-------
i=1  (i<=3)-True	j=1  (j<=2)-True	1 1 1 2
			j=2  (j<=2)-True	
			j=3  (j<=2)-False
--------------------------------------------------------
i=2  (i<=3)-True	j=1  (j<=2)-True	2 1 2 2
			j=2  (j<=2)-True	
			j=3  (j<=2)-False
---------------------------------------------------------
i=3  (i<=3)-True	j=1  (j<=2)-True	3 1 3 2
			j=2  (j<=2)-True	
			j=3  (j<=2)-False
-----------------------------------------------------------
i=4  (i<=3)-False		End*/
