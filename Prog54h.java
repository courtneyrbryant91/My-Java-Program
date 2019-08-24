/*Courtney Bryant
 * Jordan-Matthews High
 * Program 54h
 * Created: Sept 13, 2008
 * Description:  This program finds the area of donut island and then subtracts the area of the lake in the middle in order to calcualte the amount of cultivatable land there is.
 * Difficulties: I had a difficult time remembering the code to round the decimal number to two places.
 * What I learned: I learned how to round a number by using the java.text.* class.
 */

import java.text.*;
public class Prog54h
{
    public static void main(String[] args)
    {
        final double pie = 3.14159;
        double landRadius = 4.16/2.0;
        double lakeRadius = .95;
        double landArea = pie*landRadius*landRadius;
        double lakeArea = pie*lakeRadius*lakeRadius;
        DecimalFormat twodigits = new DecimalFormat("0.00");
        System.out.println("Donut island, with a diameter of 4.16 miles that contains a circular lake of .95 miles, has " + twodigits.format(landArea - lakeArea) + " square miles of cultivatable land.");
    }
}
/*Output:
 * Donut island, with a diameter of 4.16 miles that contains a circular lake of .95 miles, has 10.76 square miles of cultivatable land.
 */