//Assignment 1:Que.4:
class RecursionCode{
	    // 1. Check if a number is prime using recursion
  static boolean isPrime(int num, int divisor) {
        if (num <= 1) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }
        return isPrime(num, divisor - 1);
    }

    // 2. Check whether a given string is a palindrome
	static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    // 3. Find the sum of digits of a given number
	static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigits(num / 10);
    }

    // 4. Calculate the nth Fibonacci number
     static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 5. Calculate a raised to the power b
    static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        int num = 7;
        String strInput = "racecar";
        int numDigits = 1234;
        int fibIndex = 6;
        int a = 2, b = 5;

        System.out.println("Is prime: " + isPrime(num, num - 1));  
        System.out.println("Is '" + strInput + "' a palindrome? " + isPalindrome(strInput, 0, strInput.length() - 1)); 
        System.out.println("Sum of digits of " + numDigits + ": " + sumOfDigits(numDigits));  // Sum of digits
        System.out.println("Fibonacci(" + fibIndex + "): " + fibonacci(fibIndex)); //Fibonacci number
        System.out.println(a + "^" + b + " = " + power(a, b));  // Power calculation
    }
}/*Output:Is prime: true
Is 'racecar' a palindrome? true
Sum of digits of 1234: 10
Fibonacci(6): 8
2^5 = 32
*/