/*Courtney Bryant
 * Jordan-Matthews High
 * Prog52g
 * Created: Sept 14, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter the length and width of a driveway (in feet) in order to calculate the price for a construction company to build it.
 * Difficulties: I had a difficult time trying to get the program to convert feet to yards.
 * What I learned:  I learned how to convert feet to yards and how to round two added variables.
 */
import java.io.*;
import java.text.*;
import java.util.*;
public class Prog52g
{
    public static void main(String[] args)
    {
        System.out.print("Enter the driveway length (in feet): ");
        Scanner keyboard = new Scanner(System.in);
        double length = keyboard.nextDouble(); 
        
        System.out.print("Enter the driveway width (in feet): ");
        Scanner keyboard2 = new Scanner(System.in);
        double width = keyboard2.nextDouble(); 
        
        DecimalFormat twodigits = new DecimalFormat("0.00");
       double area = (double)((length*width*.25)* (.037037037)); //converts to cubic yards
     
       double concrete =((area*42.50));
       double labor = (area*27.50);
       double cost =(labor+concrete);
       System.out.print("A driveway with these dimensions will cost: $"+ twodigits.format(cost)); 
    }
}
/*Output:
 * Enter the driveway length (in feet): 42
Enter the driveway width (in feet): 26
A driveway with these dimensions will cost: $707.78
 */