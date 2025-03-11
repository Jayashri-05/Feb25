/*
Q10:  Write a program to determine if a  character is a vowel  or a consonant using the 
ternary operator. 
*/
import java.util.Scanner;
class CharacterisVowel{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a character: ");
char ch=sc.next().toLowerCase().charAt(0);
boolean result=ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'?true:false;
System.out.println(ch+" is a Vowel : "+result);
}
}
/*Output:
U
u is a Vowel : true
*/