/*20. Count the Number of Digits in a Number 
Write a Java program that counts the number of digits in a given number.*/
class CountnumberOfDigits{

  public static void main(String[] args) {

    int count = 0, num = 123456;

    while (num != 0) {
          num /= 10;
      ++count;
    }

    System.out.println("The number 123456 has "+count+" digits");
  }
}
//Output:The number 123456 has 6 digits