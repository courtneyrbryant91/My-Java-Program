/*Courtney Bryant
 * Jordan-Matthews High
 * Prog58a (Pie ala mode)
 * Created: Sept 14, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter the radius of a circle.  It then calculates the circumference, volume, and surface area of a sphere with the same radius.
 * Difficulties: I had a problem getting the program to round to four decimal places. It produced an error saying it could not convert it to that data type.  To solve this, I placed the round command in the line of code that displays the output.
 * What I learned:  I learned that area is a 2D object - a sphere only has surface area because it is 3D.  I also learned how to round to four decimal places.
 */

import java.io.*;
import java.util.*;
import java.text.*;
public class Prog58a
{
    public static void main(String[] args)
    {
        System.out.print("Enter the radius of a circle: ");
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat fourdigits = new DecimalFormat("0.0000");
        double radius = keyboard.nextDouble();
        final double pie = 3.14159;
        double surfaceArea = 4*pie*(radius*radius);
        double circumference = 2*pie*radius;
        double volume = (4/3)*pie*(radius*radius*radius);
        System.out.println("A circle with a radius of "+ radius + " has:\n");
        System.out.println("Circumverence of " + fourdigits.format(circumference));
        System.out.println("Volume of " + fourdigits.format(volume)+"\n");
        System.out.println("A sphere with the radius of " + radius + " has the surface area of: " + fourdigits.format(surfaceArea));
    }
}
/*Output:
 *Enter the radius of a circle: 32
A circle with a radius of 32.0 has:

Circumverence of 201.0618
Volume of 102943.6211

A sphere with the radius of 32.0 has the surface area of: 12867.9526
 */