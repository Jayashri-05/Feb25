/*Q8:  Write a program that  takes three boolean inputs  and prints  true  if at least two of 
them are  true  . 
Hint  : Use logical operators (  &&  ,  || )*/
class ThreeBooleanInputs{
public static void main(String args[]){
boolean a=true;
boolean b=false;
boolean c=true;
boolean ans=false;
if(a){
ans =b||c;
}
else{
ans=b && c;
}
if(ans)
System.out.println("Two inputs are true.");
else
System.out.println("Two inputs are not true.");
}
}
/*
Output:Two inputs are true.
*/