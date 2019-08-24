/*Courtney Bryant
 * Jordan-Matthews High
 * Prog214a
 * Created: November 6, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program places a man at the middle of a 7ft bridge.  It then generates a random number (0 or 1) and then moves the man forward (for 1) or backward (for 0). It calculates how many steps the man takes before he falls off the bridge.  This is then looped 1000 times and calculates the average and greatest number of steps.  The whole program then runs 20 times and displays answers each time.
 * Difficulties: I had a difficult time understanding what this program was asking.  The people in my class helped out by giving suggestions in the discussion board.  I also used created a Global class to globalize my variables to use in each loop because the program said "variable not found" when they were initialized in separate loops.
 * What I learned: I learned how to create global variables.
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class Prog214a
{
    public static void main(String[] args)
    {
        DecimalFormat oneDigit = new DecimalFormat("0.0");
        System.out.println("1000 iterations\nRun\tAverage\t\tGreatest Number of Steps");
        for (int output=1; output<=20; output++)
        {
            Global.greatestStep=0;
            Global.totalSteps=0;
        for (int runs = 1; runs <= 1000; runs++)
        {
            Global.stepNum=0;
            double steps = 3.5;//places the man at the middle of the 7ft bridge
                while (steps < 7 && steps >0)
                {
                    Random generator = new Random();
                    int randomNum = generator.nextInt(2)+0;
                    if (randomNum ==0)
                    {
                        steps--;
                    }
                    else if(randomNum==1)
                    {
                        steps++;
                    }   
                    Global.stepNum++;
                }
                Global.totalSteps+=Global.stepNum;
                if (Global.stepNum > Global.greatestStep)
                {
                    Global.greatestStep= Global.stepNum;
                }  
        }
        System.out.println("#"+output+":\t"+oneDigit.format(Global.totalSteps/1000.0)+"\t\t\t"+Global.greatestStep);
      }
    }
    /*Output:
1000 iterations
Run	Average		Greatest Number of Steps
#1:	10.7			66
#2:	9.3			64
#3:	9.5			34
#4:	9.2			32
#5:	9.6			34
#6:	9.6			32
#7:	9.4			38
#8:	9.6			40
#9:	9.3			36
#10:	9.5			38
#11:	9.6			38
#12:	9.3			38
#13:	9.6			32
#14:	9.4			34
#15:	9.1			30
#16:	9.7			36
#17:	9.5			38
#18:	9.6			38
#19:	9.6			40
#20:	9.8			46
     */
    
    //NOTE: Format is correct in output
}