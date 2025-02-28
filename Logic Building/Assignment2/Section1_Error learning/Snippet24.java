/*Snippet24: 
public class MissingBreakCase { 
 public static void main(String[] args) { 
 int level = 1; 
 switch(level) { 
 case 1: 
 System.out.println("Level 1"); 
 case 2: 
 System.out.println("Level 2"); 
 case 3: 
 System.out.println("Level 3"); 
 default: 
 System.out.println("Unknown level"); 
 } 
 } 
} */
/*Error:
->error: class MissingBreakCase is public, should be declared in a file named MissingBreakCase.java
public class MissingBreakCase {


/*Error to Investigate: When level is 1, why does it print "Level 1", "Level 2",   			"Level 3", and "Unknown level"? What is the role of the 			break statement in this situation? 
->Because there is no break statement after case1 all other statements after  case1 are also printed including default Statement.*/

//Corrected code
class MissingBreakCase { 
 public static void main(String[] args) { 
 int level = 1; 
 switch(level) { 
 case 1: 
 System.out.println("Level 1");
break; 
 case 2: 
 System.out.println("Level 2"); 
 case 3: 
 System.out.println("Level 3"); 
 default: 
 System.out.println("Unknown level"); 
 } 
 } 
}
//output:Level 1