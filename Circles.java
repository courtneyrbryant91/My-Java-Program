/* Courtney Bryant
 * Jordan-Matthews High
 * Prog54c (Circles)
 * Created: Sept 13, 2008
 * Description: This program allows the user to enter the radius of a circle.  It then calculates the circumference and area of a circle with that radius.
 * Difficulties: I had problems with the java.util.* command because I did not have the correct JDK update installed.
 * What I learned: I learned how to use the Scanner class to get input from the user.  I also learned how to use this input to do an equation and return another output.
 */

import java.io.*;
import java.util.*;
import java.text.*;
public class Circles
{  
    public static void main(String[] args)
    {
        final double pie = 3.14159;
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat threedigits = new DecimalFormat("0.000");
        System.out.print("Enter the value of the radius: ");
        double radius = keyboard.nextDouble();
        System.out.println("The Radius of the circle = " + threedigits.format(radius));
        System.out.println("The Area of the circle = " + threedigits.format(pie*(radius*radius)));
        System.out.println("The Circumference of the circle = " + threedigits.format(2*pie*radius));
    }
}

/*Output:
 * Enter the value of the radius: 23
The Radius of the circle = 23.000
The Area of the circle = 1661.901
The Circumference of the circle = 144.513
 */