/*Snippet26: 
public class Switch { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5"); 
 break; 
 case 5: 
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
 }
}
}
=>Error:
	error: class Switch is public, should be declared in a file named Switch.java public class   		Switch {
 	error: duplicate case label case 5:
=>Explanation:
	->To remove error1 Public keyword is removed from class Switch
	->As there is duplication of case 5,one case 5 is labled as 7.
*/
/*Error to Investigate: Why does the compiler complain about duplicate case labels? What happens when you have two identical case labels in the same switch block? 
->If you have two identical case lables within a switch block,it will throw a compilation error because duplicate case values are not allowed.
*/
//Corrected code:
class Switch { 
 public static void main(String[] args) { 
 int number = 5; 
 switch(number) { 
 case 5: 
 System.out.println("Number is 5"); 
 break; 
 case 7: 
 System.out.println("This is another case 5"); 
 break; 
 default: 
 System.out.println("This is the default case"); 
}
}
}
 