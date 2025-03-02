/*7. Multiplication Table 
Write a Java program that takes a number as input and prints its multiplication table up to 
10. 
Test Data: 
 Input a number: 8 */
class Mtable{
	public static void main(String args[]){
	int i,a=8;
	for(i=1;i<=10;i++)
	{	
		System.out.println(a+"*"+i+"="+a*i);
		System.out.println("\n");
	
	}
}
}/*
Output:

8*2=16


8*3=24


8*4=32


8*5=40


8*6=48


8*7=56


8*8=64


8*9=72


8*10=80

*/