//Snippet 2: 
 public class DecrementingLoop { 
 public static void main(String[] args) { 
 int total = 0; 
 for (int i = 5; i > 0; i--) { 
 total += i; 
 if (i == 3) continue; 
 total -= 1; 
 } 
 System.out.println(total); 
 } 
}
/*There is one for loop and variable total is initialize to 0.
First condition is checked in for loop,If it is true then it will execute statements inside the loop otherwise jump outof the loop.
int total=0;
for loop:		total=total+i;  total-=1
int i=5  (i>0)-True	1+5=>6		5-1=4
int i=4  (i>0)-True	5+4=>9		8-1=7
int i=3  (i>0)-True	8+3=>11		10-1=9
int i=2  (i>0)-True	10+2=>12 	11-1=10
int i=1  (i>0)-True	11+1=>12	12-1=11
int i=0  (i>0)-False                     -------	
End of for loop
SOP Statement will print
OUTPUT:11*/



