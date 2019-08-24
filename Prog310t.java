/* Courtney Bryant
 * Jordan-Matthews High
 * Prog310t
 * Created: January 18, 2009
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: Create a table similar to the one shown below.  The numbers generated are to be created as random numbers between $10,000 
 *          and $40,000.  The numbers and graph indicate the sales from a wholesaler during the month of October.  Note that they are not
 *          open seven days a week.  (Sunday is the day they are closed, and Sundays fall on October 1, 8, 15, 22, and 29 during the year 
 *          in question.  The graph is generated in that each star represents $1,000 in sales.
 *          
 *          Your graph will not look exactly like this since random numbers will be generated differently in each program.  Print the dates
 *          in columns as shown (right-justified).  Also, Mondays always have sales over $30,000 and Tuesdays always have sales over $20,000.
 *          Saturdays always have sales less than $15,000. 
 * Difficulties: The only problem I had with this program was that I could not get the method to recognize the variable "charPrint".  To fix
 *          this, I created another class and made the variable public.
 * What I learned: I did not learn anything new from this program. It was very similar to Prog310a2, so I just used the majority of my code
 *          from that program.
 */

import java.io.*;
import java.util.*;
public class Prog310t
{
    public static void main(String[] args)
    {
        System.out.print("Do you wish to supply the graphing character (Y/N): ");
        Scanner keyboard = new Scanner(System.in);
        String graphChar = keyboard.next();
        graphChar = graphChar.toLowerCase();
        if (graphChar.equals("y"))
        {
         System.out.print("Enter the character: ");
         Global.charPrint = keyboard.next();
        }
        else
        {
           Global.charPrint = "*";
        }
        System.out.println("\nKEY: One star (*) equals $1,000.\n\nDay\tDaily\tSales Graph");
        int count = 2;
        do
        {
        int value = randomNum(count);
        if (value!=0)
        {
         System.out.println(count+"\t"+value+"\t"+drawBar(value, Global.charPrint));
        }
        else
        {
            System.out.println();
        }
        count++;
      } while (count<=31);
    }
    public static int randomNum(int day)
    {
     int num=0;
     Random generator = new Random();
     if (day==2 || day==9 || day==16|| day == 23|| day ==30)//Mondays greater than 30,000
     {
         num = generator.nextInt(10000)+1;
         num+=30000;
     }
     else if (day==3 || day==10|| day==17||day==24||day==31)//Tuesdays greater than 20,000
     {
         num = generator.nextInt(20000)+1;
         num+=20000;
     }
     else if (day==7||day==14|| day==21||day==28)//Saturdays less than 15,000
     {
         num= generator.nextInt(15000)+1;
     }
     else if(day ==1||day==8||day==15||day==22||day==29)//Sundays - closed
     {      
     }
     else //every other day
     {
     num=generator.nextInt(40000)+1;
     }
     return num;
    }
    public static String drawBar(double length, String mark)
    {
        String answer = "";
        for (int x = 1; x<=length/1000; x++)
        {
           answer +=mark;
        }
        return answer;
    }

}  
/*OUTPUT:
Do you wish to supply the graphing character (Y/N): n

KEY: One star (*) equals $1,000.

Day Daily   Sales Graph
2   34239   **********************************
3   20753   ********************
4   18276   ******************
5   21306   *********************
6   1896    *
7   8653    ********

9   39656   ***************************************
10  22153   **********************
11  27152   ***************************
12  22942   **********************
13  16086   ****************
14  2938    **

16  35679   ***********************************
17  21030   *********************
18  9407    *********
19  34070   **********************************
20  10360   **********
21  6540    ******

23  30902   ******************************
24  27102   ***************************
25  26196   **************************
26  26142   **************************
27  26787   **************************
28  6939    ******

30  34561   **********************************
31  28590   ****************************


Do you wish to supply the graphing character (Y/N): y
Enter the character: #

KEY: One star (*) equals $1,000.

Day Daily   Sales Graph
2   38256   ######################################
3   20199   ####################
4   8503    ########
5   35074   ###################################
6   6481    ######
7   10396   ##########

9   31523   ###############################
10  33237   #################################
11  25140   #########################
12  18837   ##################
13  28572   ############################
14  5068    #####

16  38350   ######################################
17  25708   #########################
18  39456   #######################################
19  5474    #####
20  17426   #################
21  13838   #############

23  33399   #################################
24  26728   ##########################
25  11180   ###########
26  9440    #########
27  32516   ################################
28  8147    ########

30  31076   ###############################
31  37641   #####################################

 */
    
