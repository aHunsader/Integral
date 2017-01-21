// All terms need to be separated by spaces.
// Parentheses are always needed
// Does not work with multiplication and division
// Example:
// (x)^2 + (4x)^2 + 2 cos(x)

import java.util.ArrayList;
import java.util.Scanner;
public class Main_Integral
{
    public static void main(String[] args)
    {
        System.out.println("Please enter in the first x-value");
       Scanner xval = new Scanner(System.in);
       double x = xval.nextDouble();
      
       System.out.println("Please enter in the second x-value");
       Scanner yval = new Scanner(System.in);
       double y = yval.nextDouble();
    
       System.out.println("What is your dx?");
       Scanner dxx = new Scanner(System.in);
       double dx = dxx.nextDouble();
       
       System.out.println("Enter in a polynomial: ");
       System.out.println("Press enter then 'exit' to evaluate integral");
       Scanner eq1 = new Scanner(System.in);
      
       String eq = "";
       double m = 0;
       while(true)
       {
           
           eq = eq1.next();
           if(!eq.equals("exit"))
           {
	           if(eq.equals("+"))
	           {
	             eq = eq1.next();
	             Integrator yay = new Integrator(eq, x, y, dx);
	             m+=yay.integrate(yay);
	           }
	           else if(eq.equals("-"))
	           {
	              eq = eq1.next();
	              Integrator yay = new Integrator(eq, x, y, dx);
	              m-=yay.integrate(yay); 
	            }
	            else
	            {
	                Integrator yay = new Integrator(eq, x, y, dx);
	              m=yay.integrate(yay);
	            }
	    
           }
           else
           {
        	   System.out.println(m);
        	   break;
           }
       }
    }
}
