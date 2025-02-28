//Snippet 5: 
public class ConditionalLoopOutput { 
 public static void main(String[] args) { 
 int num = 1; 
 for (int i = 1; i <= 4; i++) { 
 if (i % 2 == 0) { 
 num += i; 
 } else { 
 num -= i; 
 } 
 } 
 System.out.println(num); 
 } 
} 
/*Dry Run:
			for loop	  if(i%2==0)	   SOP outside the loop
		----------------------- ---------------    -------------------
int num=1;	int i=1;   i<=4;         True    False
1		 1	  True	   	      	   yes
-----------------------------------------------------------------
num=0-1=-1	 2	  True		  yes
----------------------------------------------------------------
num=0+2=2	 3        True			  yes
----------------------------------------------------------------
num=1-3=-2	 4        True	 	  yes
----------------------------------------------------------------
num=-1+4=3       5        False					3
----------------------------------------------------------------
Output:3*/