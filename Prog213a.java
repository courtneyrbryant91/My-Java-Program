/*Courtney Bryant
 * Jordan-Matthews High
 * Prog213a
 * Created: November 19, 2008
 * Compiler/Platform: Java 1.6
 * Description: This program computes a person's wage based on a formula determined by the instructions (see file).
 * Difficulties: I had trouble figuring out what the program was asking for.  I had a math teacher (props to Ms. Evans) help me out.  Once we figured out the formula, then it was fairly easy for me to program.
 * What I learned: I learned how to import numbers from a file and use them to calculate the wage a person would earn.
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class Prog213a
{
    public static void main(String[] args)
    {
        DecimalFormat money = new DecimalFormat("$00.00");
        Scanner inFile = null;
        try
        {
            inFile = new Scanner (new File("213a.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
            System.exit(0);
        }
        int week = 1;
        while (inFile.hasNext())
        {
            System.out.print("Hours Worked: ");
            int over = 0;
            double total=0.0;
            int totalDays = 0;
            int num = inFile.nextInt();
            System.out.print(num+" ");
            
            total += ((10*(num))+(10*(num)*.5));//calculate sun
            
            for (int days = 1; days <=5; days++)//calculate mon-fri
            {
                num = inFile.nextInt();
                System.out.print(num+" ");
                if (num > 8)
                {
                    over+= (num-8);
                    totalDays+=8;//updates total num of hours in a week
                }
                else if (num<=8)
                {
                totalDays+=num; //updates total num of hours in week
                }
            }
            if ((totalDays+over) > 40)//calculates if hours is over 40
            {
                total+=14*((totalDays+over)-40)+400;
            }
            else
            {
                total+= (totalDays*10)+(11.5*over);
            }
            num = inFile.nextInt();
            System.out.print(num+"\n");
            total+=(10*(num)+((10*num*1.25)));//calculates for sat
            System.out.println("Week #" + week +" "+ money.format(total)+"\n");
            week++;
        }
        System.out.println("Hours Worked: End of reading from file.");
    }
}
/*Output:
Hours Worked: 9 8 10 8 9 9 5
Week #1 $703.50

Hours Worked: 7 8 8 8 0 8 9
Week #2 $627.50

Hours Worked: 6 10 5 0 0 0 0
Week #3 $243.00

Hours Worked: End of reading from file.
*/