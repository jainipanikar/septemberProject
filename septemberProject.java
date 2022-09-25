package operators;
import java.util.* ;

public class septemberProject {

	 

	public static void main(String[] args) {
		
		
		
		
	    
		Scanner sc = new Scanner(System.in); //System.in is a standard input stream 
		System.out.print("Enter the amount:");		
		
		// declare variables
	    int num1 = 100;
	    int num2 = 25;
		
		  	
		    		    
		    		    
		   // addition operator
		    System.out.println("sum of integer = " + (num1 + num2));

		    // subtraction operator
		    System.out.println("The Result of subtraction = " + (num1 - num2));

		    // multiplication operator
		    System.out.println("The Result of multiplication = " + (num1 * num2));

		    // division operator
		    System.out.println("The Result of Division = " + (num1 / num2));

		    // modulo operator
		    System.out.println("The Result of remainder after division = " + (num1 % num2));
		    
		    
		    
		    //create variables
		    int a = 10;
		    int var;
		    
		    // assign value using =
		    var = a;
		    System.out.println("var using =:" + var);
		    
		 // assign value using =+
		    var += a;
		    System.out.println("var using +=: " + var);

		    // assign value using =*
		    var *= a;
		    System.out.println("var using *=: " + var);
		    
		  
		 // arithmetic using doubles
			System.out.println("\nFloating Point Arithmetic");
			double r = 1 + 1;
			double n = r * 3;
			double o = n / 4;
			double p = o - r;
			double q = -p;
			System.out.println("r = " + r);
			System.out.println("n = " + n );
			System.out.println("o = " + o);
			System.out.println("p = " + p);
			System.out.println("q = " + q);
	    
		    
		    		
		  //  String to Boolean
			
		    String str1 = "Learn at TechBridge";
		    Boolean result;

		    // check if str1 contains "TechBridge"
		    result = str1.contains("TechBridge");
		    System.out.println(result);  // true

		    // check if str1 contains "College"
		    result = str1.contains("College");
		    System.out.println(result);  // false

		    // check if str1 contains ""
		    result = str1.contains("");

		    System.out.println(result);  // true
		    
		   // trim method 
		    String str2 = "   Need A Vacation      ";

		    System.out.println(str2.trim());
		    
		    //join method 
		    String str4 = "Thank you";
		    String str5 = "Techbridge";
		    String str6 = "And Macy";

		    // join strings with space between them
		    String joinedStr = String.join(" ", str4, str5, str6);

		    System.out.println(joinedStr);
		    
		    String str7 = "Study Better";
		    String str8 = "Study\nBetter";

		    // first character
		    System.out.println(str1.charAt(0));  // 'S'

		    // seventh character
		    System.out.println(str1.charAt(6));  // 'a'


		    // sixth character
		    System.out.println(str2.charAt(5));  // 'e'
		    
		    // string valueof() method convert data
		    char c = 'H';
		    char ch[] = {'H', 'e', 'l', 'l', 'o'};

		    // convert char to string
		    System.out.println(String.valueOf(c));  // "H"


		    // convert char array to string
		    System.out.println(String.valueOf(ch));  // "Hello"

		  }
		  
		  
		  
		
		 
	
	
}
