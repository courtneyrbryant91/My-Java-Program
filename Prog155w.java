/*Courtney Bryant
 * Jordan-Matthews High
 * Prog155w
 * Created: November 23, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: The program computes how much two children have to pay of their phone bill based on a formula. 
 *                           Local calls (includes internet) are $.55 for every 5 minutes
 *                           Long distance calls are $ .95 for every 10 minutes
 * Difficulties: I had problems with variables not being recognized.  To fix this, I created a global class that contained these variables.
 * What I learned: I learned how to import a name (string) from a file. I also learned how to make loops continue a certain number of times based on a number read from a file.
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class Prog155w
{
    public static void main(String[] args)
    {
        
        Scanner inFile = null;
        try
        {
            inFile = new Scanner(new File("155w.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
            System.exit(0);
        }
        
       
        while (inFile.hasNext())
        {
            int lDTotal=0;
            int localTotal = 0;
            String name = inFile.next();
            int lDNum = inFile.nextInt();
            for (int x = 1; x<=lDNum; x++)
            {  
                lDTotal += inFile.nextInt();
            }
            int localNum = inFile.nextInt();
            for (int y = 1; y <= localNum; y++)
            {
                localTotal += inFile.nextInt();
            }
            Global.totalPaid += (((lDTotal/10)*.95)+(((localTotal/5)*.55)));
            System.out.println(name+"    $"+Global.twoDigits.format(((lDTotal/10)*.95)+(((localTotal/5)*.55))));
        }
        System.out.println("The children paid $"+ Global.totalPaid+ " of $110.71, or "+ Global.percent.format(((Global.totalPaid)/110.71))+" of the total phone bill.");
    }
    /*Output:
Jerimiah	$40.25
Rashika	    $29.50
The children paid $69.75 of $110.71, or 63.0% of the total phone bill.
     */
}