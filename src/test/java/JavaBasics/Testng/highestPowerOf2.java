package JavaBasics.Testng;

public class highestPowerOf2 {

	static int highestPowerof2(int n) 
	{ 
	      
	    int p = (int)(Math.log(n) /  
	                  Math.log(2)); 
	    return (int)Math.pow(2, p);  
	} 
	  
	// Driver code 
	public static void main (String[] args)  
	{ 
	    int n = 33; 
	   // System.out.println(Math.log(33));
	    System.out.println(highestPowerof2(n)); 
	} 
}
