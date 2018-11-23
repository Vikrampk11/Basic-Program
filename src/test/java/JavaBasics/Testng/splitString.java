package JavaBasics.Testng;

//import RestAssured.Create_Issue_Jira;

public class splitString {

	public static void main(String[] args) {


		// Java program to demonstrate working of split()
		
		        String str = "GeeksforGeeks:A Computer: Science Portal";
		        String [] arrOfStr = str.split(":");
		 
		        for (String a : arrOfStr)
		            System.out.println(a);
		        
		        String str1= new String("quick brown fox jumps over the lazy dog");
		        System.out.println("Substring starting from index 15:");
		        System.out.println(str1.substring(15));
		        System.out.println("Substring starting from index 15 and ending at 20:");
		        System.out.println(str1.substring(15, 20));
		    }
		
	

}
