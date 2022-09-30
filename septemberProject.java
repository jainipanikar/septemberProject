package operators;

import java.util.* ;

public class septemberProject {
	
      public static void main(String[] args) {
		
		
    	Scanner sc = new Scanner(System.in); //System.in is a standard input stream
  		System.out.println("Enter the String");
  		String str1 = sc.nextLine();
  		System.out.print("Enter the first number");		
  		int num1 = sc.nextInt();
  		System.out.print("Enter the second number");
  		int num2 = sc.nextInt();

		//this is toni this is a new change
		//on another line
  		
  		    
  		
  		  	
  		    		    
  		    		    
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
  	    
  		    
  			
  		    
  		   // trim method 
  		    String str2 = "   Need A Vacation      ";

  		    System.out.println(str2.trim());
  		    
  		    //join method 
  		    String str4 = "Thank you";
  		    String str5 = "Techbridge";
  		    String str6 = "And Macy";

  		// join strings with space between them
		    String joinedStr = String.join(" ", str4, str1, str6);
 
  		    
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
  		    
  		    
  		    System.out.println(str1.length());
  		 // Here string is a string object
  	        String str = "Good Morning";
  	  
  	        System.out.println("The size of " + "the String is "+ str.length());	
  		
  		  
  		  }
  		  
  		  
  		  
  		
  		 
  	
  	
  }

		
	    
	