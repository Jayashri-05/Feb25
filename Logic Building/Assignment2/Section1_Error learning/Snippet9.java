/*Snippet 9: 
public class Main { 
 public static void main(String[] args) { 
 int class = 10; 
 System.out.println(class); 
 } 
} */
/*Errors:
Compilation errors:
error1: not a statement
 int class = 10;
error2: ';' expected
 int class = 10;
    ^
error3: <identifier> expected
 int class = 10;
          ^
erro4: <identifier> expected
 System.out.println(class);
                   ^
error5: illegal start of type
 System.out.println(class);
                    ^
error6: <identifier> expected
 System.out.println(class);
                         ^
error7: reached end of file while parsing
}
Compilation errors2:class Main is public, should be declared in a file named Main.java
public class Main {
*/
/*Explanation:
->As class is a keyword so we can not use class as a variable name.
I took 'a' as variable of int type. 
->For compilation error2 public keyword is removed from class Main

*/
//Correct code
class Main { 
 public static void main(String[] args) { 
 int a = 10; 
 System.out.println(a); 
 } 
} 

//Output: 10
