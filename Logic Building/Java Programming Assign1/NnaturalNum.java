/*17. Print the First N Natural Numbers 
Write a Java program to print the first N natural numbers, where N is provided by the user.*/
import java.util.Scanner; 
class NnaturalNum{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt(); 

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " "); 
        }
    }
}
/*Output:
Enter a natural number (n): 10
1 2 3 4 5 6 7 8 9 10*/