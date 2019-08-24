/*Courtney Bryant
 * Jordan-Matthews High
 * Prog52f (High Speed ISP)
 * Created: Sept 13, 2008
 * Description: This program allows the user to enter the number of premium and basic hours of internet service he/she had and then calculate the cost of his/her bill.
 * Difficulties: I had problems getting the money.format command to work correctly.
 * What I learned:  I learned how to round a decimal up regardless of its value.  I also learned how to format numbers to two decimal places (for money).
 */

import java.io.*;
import java.util.*;
import java.text.*;
public class Prog52f
{
    public static void main(String[] args)
    {
        System.out.print("Enter Basic Hours: ");
        Scanner basic = new Scanner(System.in);
        double basicHours = basic.nextDouble();
        
        System.out.print("Enter Premium Hours: ");
        Scanner premium = new Scanner(System.in);
        double premiumHours = premium.nextDouble();
        
        basicHours =(int) ((((basicHours-5) * 10)+9)/10);
        DecimalFormat money = new DecimalFormat("00.00");
        double basicHoursCost = (basicHours * 1.75);
        double premiumHoursCost = (premiumHours * 2.95);
        System.out.print("Your bill for the new service would have been: $" + money.format(basicHoursCost+premiumHoursCost));
    }
}
/*Output:
 * Enter Basic Hours: 9.9
Enter Premium Hours: 15.0
Your bill for the new service would have been: $53.00
 */