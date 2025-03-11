/*Q11:  Write a program to check if a given number is a  power of 2  using bitwise operators. 
Hint  :  n & (n - 1) == 0  for positive numbers.*/
class PowerOfTwo{
public static boolean isPowerOfTwo(int a){
if(a<=0){
return false;
}
else
{
	return (a&(a-1))==0;
}
}
public static void main(String args[]){
System.out.println(isPowerOfTwo(15));
System.out.println(isPowerOfTwo(64));
System.out.println(isPowerOfTwo(20));

}
}
/*
Output:
false
true
false*/