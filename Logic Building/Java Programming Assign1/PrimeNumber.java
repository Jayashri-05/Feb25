/*16. Check Whether a Number Is Prime 
Write a Java program to check whether a number is prime or not.*/

class PrimeNumber{    
 public static void main(String args[]){    
  int i,m=0,flag=0;      
  int n=17;    
  m=n/2;      
  if(n==0||n==1){  
   System.out.println("The number "+n+" is not Prime");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println("The number "+n+" is not Prime");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println("The number "+n+" is Prime"); }  
  }
}    
}   
//Output:The number 17 is Prime