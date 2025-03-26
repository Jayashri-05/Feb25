//Electricity Bill
import java.util.*;
class ElectricityBill {
 private String  customerName;
 public double  unitsConsumed ;
 public double  billAmount;
 
ElectricityBill(String  customerName,double  unitsConsumed){
this.customerName=customerName;
this.unitsConsumed=unitsConsumed;
}
void calculateBillAmount(){
	if(unitsConsumed<=0){

        throw new IllegalArgumentException("Unit Consumed cannot be Negative");
    
}else if(unitsConsumed<=100 && unitsConsumed>0)
{billAmount=unitsConsumed*5;
}
else if(unitsConsumed<=300 && unitsConsumed>100)
{	billAmount=500+(unitsConsumed-100)*7;
}	else if(unitsConsumed>300){
	billAmount=500+1400+(unitsConsumed-300)*10;
}
}
void displayBillAmount(){
	System.out.println("Customer name : "+customerName+"\nunitsConsumed : "+unitsConsumed+"\nTotal Bill Amount : "+billAmount);
	
}	


}
class ElectricityBillAssign {
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter customer name and unit consumed");
		String  customerName=sc.nextLine();	
	double  unitsConsumed=sc.nextDouble();
				
	ElectricityBill E2 = new ElectricityBill(customerName,unitsConsumed);
	E2.calculateBillAmount();
	E2.displayBillAmount();
		
}
}
/*Output:Ramukaka
250
Customer name : Ramukaka
unitsConsumed : 250.0
Total Bill Amount : 1550.0*/
