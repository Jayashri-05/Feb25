/*11. Find the Largest of Three Numbers 
Write a Java program that takes three numbers as input and finds the largest of the three*/
class LargestofThree{
public static void main(String args[])
{
int first_num=12;
int second_num=45;
int third_num=22;
if(first_num > second_num && first_num > third_num)
System.out.println(+first_num+" is largest number");
else if (second_num > first_num && second_num > third_num)
System.out.println(+second_num+" is largest number");
else
System.out.println(+third_num+" is largest number");
}
}

//Output :- 45 is largest number.