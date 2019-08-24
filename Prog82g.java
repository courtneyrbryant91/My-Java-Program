/*Courtney Bryant
 * Jordan Matthews High
 * Prog82g
 * Created: Sept 20, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program was designed to calculate the amount of ice cream, cones, nuts, and sauce used by a company in one day.  The user is prompted for the number of sundaes, cones, and shakes.  The program then calculates and displays the correct answer.
 * Difficulties: I had a difficult time making my numbers match up with those in the worksheet.  To fix this, I asked my teacher (Mr. L) and he said to verify my answers with my classmates.
 * What I Learned: I learned how to format numbers correctly using codes.
 */

import java.io.*;
import java.util.*;
import java.text.*;
public class Prog82g
{
    public static void main(String []args)
    {
        System.out.print("Number of Sundaes: ");
        Scanner sundaes = new Scanner(System.in);
        int numSundaes = sundaes.nextInt();
        System.out.print("Number of Cones: ");
        Scanner keyboardCones = new Scanner(System.in);
        int numCones = keyboardCones.nextInt();
        System.out.print("Number of Shakes: ");
        Scanner shakes = new Scanner(System.in);
        int numShakes = shakes.nextInt();
        System.out.print("\nIngredients Used\n\n");
        double iceCream =(double)((numSundaes*9)+(numCones*6)+(numShakes*10));
        double cones = (double)(numCones/36.0);
        double nuts = (double)(numSundaes*.75);
        double sauce = (double)((numSundaes*2)+(numShakes*1.5));
        DecimalFormat twodigits = new DecimalFormat("0.00");
        System.out.println("Ice Cream:\t" + twodigits.format(iceCream/32.0) + " quarts");
        System.out.println("Cones:\t\t" + twodigits.format(cones)+ " cases");
        System.out.println("Nuts:\t\t" + twodigits.format(nuts/16.0) + " pounds");
        System.out.println("Sauce:\t\t" + twodigits.format(sauce/24)+ " cans");
    }
}
/*Output:
Number of Sundaes: 252
Number of Cones: 311
Number of Shakes: 213

Ingredients Used

Ice Cream:	195.75 quarts
Cones:		8.64 cases
Nuts:		11.81 pounds
Sauce:		34.31 cans
*/