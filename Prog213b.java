/*Courtney Bryant
 * Jordan-Matthews High
 * Prog213b
 * Created: November 9, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter the quantity of a certain item ordered.  It then displays the price per item and the total cost of all the items purchased.
 * Difficulties: I had a little trouble with this one because I tried to use the Switch method and I could not figure out how to get it to accept a range of variables (from 0-99) not just one number.  To solve this, I just used if then statments.
 * What I learned: I did not learn anything new.
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class Prog213b
{  
    public static void main (String[] args)
    {
        DecimalFormat money = new DecimalFormat("$00.00");
        System.out.print("Enter quantity: ");
        Scanner keyboard = new Scanner (System.in);
        int quantity = keyboard.nextInt();
        if (quantity >=0 && quantity <=99)
        {
            System.out.println("Price = $5.95");
            System.out.println("Amount due = " + money.format(quantity*5.95));
        }
        else if (quantity >=100 && quantity <=199)
        {
            System.out.println("Price = $5.75");
            System.out.println("Amount due = " + money.format(quantity*5.75));
        }
        else if (quantity >=200 && quantity <= 299)
        {
            System.out.println("Price = $5.40");
            System.out.println("Amount due = " + money.format(quantity*5.40));
        }
        else if (quantity >=300)
        {
            System.out.println("Price = $5.15");
            System.out.println("Amount due = " + money.format(quantity*5.15));
        }
        
    }
    /*Output:
Enter quantity: 50
Price = $5.95
Amount due = $297.50

Enter quantity: 199
Price = $5.75
Amount due = $1144.25

Enter quantity: 200
Price = $5.40
Amount due = $1080.00

Enter quantity: 475
Price = $5.15
Amount due = $2446.25
     */
}