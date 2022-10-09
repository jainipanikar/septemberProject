package operators;

import java.util.Scanner;

public class circle {
	

    public static void main(String[] args) {
    	
    	Scanner in = new Scanner(System.in);
		   
		  System.out.print("Please enter a radius: ");
		  double radius = in.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }

}
