/*Courtney Bryant
 * Jordan-Matthews High
 * Prog82c
 * Created: Sept 21, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter the miles (one way) he/she is travelling, mpg the car gets, and estimated cost of gas.  It then calculates how much money the user can plan on spending while making the trip.
 * Difficulties: I had a small problem realizing what the worksheet was asking for. At first, I did not realize that you had to multiply the miles by two because it is a round trip, not just one way.
 * What I learned: I learned how to take input from three lines and use it to calculate data.
 */

import java.io.*;
import java.util.*;
import java.text.*;
public class Prog82c
{
    public static void main(String[] args)
    {
        System.out.print("Enter miles to your destination (one way): ");
        Scanner keyboardMiles = new Scanner(System.in);
        double miles = 2*(keyboardMiles.nextDouble());
        System.out.print("Enter estimated cost of gas: ");
        Scanner keyboardGas = new Scanner(System.in);
        double gasCost = keyboardGas.nextDouble();
        System.out.print("Enter mpg for your vehicle: ");
        Scanner keyboardMPG = new Scanner(System.in);
        double mpg = keyboardMPG.nextDouble();
        DecimalFormat twodigits= new DecimalFormat("0.00");
        System.out.println("\nThe cost of traveling "+miles+" miles, in a car that averages "+mpg+" mpg, \nwith gasoline cost $"+gasCost+" would be $"+twodigits.format((miles/mpg)*gasCost)+".");
        
        /*Output:
         *Enter miles to your destination (one way): 1487.06
         *Enter estimated cost of gas: 1.719
         *Enter mpg for your vehicle: 30

         *The cost of traveling 2974.12 miles, in a car that averages 30.0 mpg, 
         *with gasoline cost $1.719 would be $170.42.
         */
    }
}