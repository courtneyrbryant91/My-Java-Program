/*Courtney Bryant
 * Jordan-Matthews High
 * Prog155c
 * Created: October 19, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program calculates the amount a college student would owe after the cost of tuition, room and board have been raised each year.  It also determines how much she would owe after subtracting this amount from the amount she is expected to make each of the four years.
 * Difficulties: I had a difficult time figuring out how to find the total.  To fix this problem, I just added in more variables to keep track of the incrementing numbers.
 * What I learned: I learned how to caluclate the intended cost of college by using a loop and variables that store the amount each time to calculate the total.
 */

import java.text.*;
public class Prog155c
{
    public static void main(String[] args)
    {
        System.out.println("Year\tTuition\t\tRm&Bd\t\tTotal Cost\tSalary\t\tExcess/Shortage");
        double tuition=4000.00;
        double room = 9500.00;
        double salary = 14000.00;
        double totalTuition=0;
        double totalRoom=0;
        double totalCost=0;
        double totalSalary=0;
        DecimalFormat twodigits = new DecimalFormat("0.00");
        
            for (int x=1; x<=4; x++)
            {
                System.out.println(x+"\t"+twodigits.format(tuition)+"\t\t"+twodigits.format(room)+"\t"+twodigits.format(tuition+room)+"\t"+twodigits.format(salary)+"\t"+twodigits.format(salary-(tuition+room)));
                totalTuition+=tuition;
                totalRoom+=room;
                totalCost+=(tuition+room);
                totalSalary+=salary;
                tuition =(tuition*1.15);
                room=(room*1.1);
                salary=(salary*1.04);
        
            }
            
        System.out.println("Total\t"+twodigits.format(totalTuition)+"\t"+twodigits.format(totalRoom)+"\t"+twodigits.format(totalCost)+"\t"+twodigits.format(totalSalary)+"\t"+twodigits.format(totalSalary-totalCost));
        }  
        
        /*Output:
Year	Tuition		Rm&Bd	Total Cost	Salary		Excess/Shortage
1	4000.00		9500.00 	13500.00	14000.00	500.00
2	4600.00		10450.00	15050.00	14560.00	-490.00
3	5290.00		11495.00	16785.00	15142.40	-1642.60
4	6083.50		12644.50	18728.00	15748.10	-2979.90
Total	19973.50	44089.50	64063.00	59450.50	-4612.50

         */
        //NOTE: Format is correct in output
    }
