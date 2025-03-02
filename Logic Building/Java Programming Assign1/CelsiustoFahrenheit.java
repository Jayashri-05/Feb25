/*18. Convert Celsius to Fahrenheit 
Write a Java program to convert a temperature from Celsius to Fahrenheit.*/
class celsiustofahrenheit { 
    public static void main(String[] args) 
    {  
        int cels = 25;
	double fah; 
        
        // formula for conversion 
        fah = (cels*1.8)+32; 
        System.out.println(+cels+" degree celcius is equal to "+fah+" Fahrenheit"); 
    } 
}	
//Output:25 degree celcius is equal to 77.0 Fahrenheit
