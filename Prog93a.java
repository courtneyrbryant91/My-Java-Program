/*Courtney Bryant
 * Jordan-Matthews High
 * Prog93a
 * Compiler/Platform: Java 1.6, Windows XP
 * Created: Sept 21, 2008
 * Description: This program allows the user to enter the number of Kilowatts he/she used.  It then calculates and displays the base charge, surcharge, city tax, total amount he/she has to pay, and overdue charges.
 * Difficulties: I had a difficult time calculating the amounts correctly.  To fix this, I reviewed the worksheet and noticed that it was only .0475 cents not 4.75.
 * What I learned: I learned how to calculate a bill and display the numbers in a chart.
 */

import java.io.*;
import java.util.*;
import java.text.*;
public class Prog93a
{
    public static void main(String[] args)
    {
        System.out.print("Enter KWH used: ");
        Scanner keyboard = new Scanner(System.in);
        double kwh = keyboard.nextDouble();
        DecimalFormat twodigits = new DecimalFormat("0.00");
        double baseCharge =(kwh*.0475);
        double surcharge = (baseCharge)*.1;
        double cityTax = (baseCharge)*.03;
        double penalty = (surcharge+baseCharge+cityTax)*.04;
       
        
        System.out.println("\n     C O M P S C I Electric\n---------------------------------");
        System.out.println("Kilowats Used\t"+kwh+" @ $0.0475\n---------------------------------");
        System.out.println("Base Charge\t\t$"+twodigits.format(baseCharge));
        System.out.println("Surcharge\t\t$"+twodigits.format(surcharge));
        System.out.println("City tax\t\t$"+twodigits.format(cityTax)+"\n\t\t\t_______");
        System.out.println("Pay this amount:\t$"+ twodigits.format(baseCharge+surcharge+cityTax)+"\n");
        System.out.println("After May 20th Pay:\t$"+twodigits.format(baseCharge+surcharge+cityTax+penalty));
        
        /*Output:
         * Enter KWH used: 993

     C O M P S C I Electric
---------------------------------
Kilowats Used	993.0 @ $0.0475
---------------------------------
Base Charge		        $47.17
Surcharge		        $4.72
City tax		        $1.42
			           _______
Pay this amount:	    $53.31

After May 20th Pay:	    $55.44
         */
    }
}