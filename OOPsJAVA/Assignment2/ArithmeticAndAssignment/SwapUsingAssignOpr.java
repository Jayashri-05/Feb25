//Q5:  Write a Java program to  swap two numbers  using the  +=  and  -=  operators only.
class SwapUsingAssignOpr{
public static void main(String args[]){
int a=10,b=20,t;
System.out.println("Before Swapping:-a= "+a+" b="+b);
a+=b;
t=30;
t-=b;
b=t;
a-=b;
System.out.println("After Swapping:- a= "+a+"  b="+b);
}
}
/*
Output:
Before Swapping:-a= 10 b=20
After Swapping:- a= 20  b=10
*/