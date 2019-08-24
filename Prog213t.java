/*Courtney Bryant
 * Jordan-Matthews High
 * Prog213t
 * Created: November 20, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program calculates the cost of shipping a package based on a formula for calculating the cost.
 * Difficulties: I did not have any difficulties with this program.
 * What I learned: I learned how to import numbers from a file and use if then statements in order to determine the correct cost.
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class Prog213t
{
    public static void main(String[] args)
    {
        DecimalFormat money = new DecimalFormat("$0.00");
        
        Scanner inFile = null;
        try
        {
            inFile = new Scanner(new File("213t.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
            System.exit(0);
        }
        
        
        while (inFile.hasNext())
        {
        System.out.println("NATIONAL PARCEL SERVICE\nPACKAGE DATA\n");
        double length = inFile.nextDouble();
        double width = inFile.nextDouble();
        double height = inFile.nextDouble();
        double weight = inFile.nextDouble();
        System.out.println("LENGTH\tWIDTH\tDEPTH\tWEIGHT");
        System.out.println(length+"\t"+width+"\t"+height+"\t"+weight+"\n");
        if (weight > 50)
        {
            System.out.println("Package Refused--Package Weight Exceeds 50 pounds.\n\n");
        }
        else if (length > 3)
        {
          System.out.println("Package Refused--Package Dimensions Exceed 3 feet.\n\n");  
        }
        else if (width > 3)
        {
           System.out.println("Package Refused--Package Dimensions Exceed 3 feet.\n\n"); 
        }
        else if (height > 3)
        {
            System.out.println("Package Refused--Package Dimensions Exceed 3 feet.\n\n"); 
        }
        else
        {
            double rate=0.0;
            double surcharge = 0.00;
            System.out.println("BASE RATE\t\t$0.75");
            if (weight <= 20)
            {
                rate = 0.08;
            }
            else if (weight > 20 && weight <=40)
            {
                rate = 0.10;
            }
            else
            {
                rate = 0.15;
            }
            System.out.println("Weight @ "+rate+"\t\t"+money.format(rate*weight));
            if ((length*width*height) > 18)
            {
                surcharge = 1.00;
            }
           
            System.out.println("Volume Surcharge\t"+money.format(surcharge));
            System.out.println("\tTotal Due\t"+money.format(.75+(rate*weight)+surcharge)+"\n\n");
            
          }
        }
    }
    /*Output:
NATIONAL PARCEL SERVICE
PACKAGE DATA

LENGTH	WIDTH	DEPTH	WEIGHT
1.5	1.2	0.8	6.0

BASE RATE		$0.75
Weight @ 0.08		$0.48
Volume Surcharge	$0.00
	Total Due	$1.23


NATIONAL PARCEL SERVICE
PACKAGE DATA

LENGTH	WIDTH	DEPTH	WEIGHT
3.0	2.7	2.3	25.6

BASE RATE		$0.75
Weight @ 0.1		$2.56
Volume Surcharge	$1.00
	Total Due	$4.31


NATIONAL PARCEL SERVICE
PACKAGE DATA

LENGTH	WIDTH	DEPTH	WEIGHT
2.4	1.0	4.4	55.8

Package Refused--Package Weight Exceeds 50 pounds.


NATIONAL PARCEL SERVICE
PACKAGE DATA

LENGTH	WIDTH	DEPTH	WEIGHT
2.6	2.6	2.6	40.5

BASE RATE		$0.75
Weight @ 0.15		$6.08
Volume Surcharge	$0.00
	Total Due	$6.82


NATIONAL PARCEL SERVICE
PACKAGE DATA

LENGTH	WIDTH	DEPTH	WEIGHT
2.0	2.0	2.0	63.2

Package Refused--Package Weight Exceeds 50 pounds.


NATIONAL PARCEL SERVICE
PACKAGE DATA

LENGTH	WIDTH	DEPTH	WEIGHT
3.5	3.5	3.5	21.7

Package Refused--Package Dimensions Exceed 3 feet.
     */
    //NOTE: format is correct in output.
}