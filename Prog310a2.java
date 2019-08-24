/* Courtney Bryant
 * Jordan-Matthews High
 * Prog310a2
 * Created: January 17, 2009
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: Write a method that will output a histogram as follows:  the main program
 *          will input floating point number which is to be represented by a horizontal
 *          line of asterisks.  The number of asterisks in each line equals the value of
 *          the corresponding real number rounded to the nearest integer.  Thus, 12.4 is 
 *          represented by 12 asterisks, while 12.5 and 12.6 are each represented by 13 
 *          asterisks.  Output the original value immediately to the right of the histogram.
 * Difficulties: I did not have any difficulties with this program.  I found it relatively easy.
 * What I learned: I learned what method overloading is and how it is accomplished.
 *          I also learned how bluej recognizes which method to run when it has two
 *          methods of the same name.
 */
import java.io.*;
import java.util.*;
public class Prog310a2
{
    public static void main(String[] args)
    {
        System.out.print("Enter value to chart: ");
        Scanner keyboard = new Scanner(System.in);
        double value =keyboard.nextDouble();
        System.out.print("Do you wish to supply the graphing character (Y/N): ");
        String graphChar = keyboard.next();
        graphChar = graphChar.toLowerCase();
        
        if (graphChar.equals("y"))
        {
         System.out.print("Enter the character: ");
         String charPrint = keyboard.next();
         System.out.print(drawBar(value, charPrint)+" "+value+"\n");
        }
        else
        {
            System.out.print(drawBar(value)+" "+value+"\n");
        }
    }
    public static String drawBar(double length, String mark)
    {
        String answer = "";
        for (int x = 1; x<=length; x++)
        {
           answer +=mark;
        }
        return answer;
    }
    public static String drawBar(double length)
    {
        String answer = "";
        for (int x = 1; x<=length; x++)
        {
            answer+="*";
        }
        return answer;
    }
}
/*OUTPUT:
Enter value to chart: 13.5
Do you wish to supply the graphing character (Y/N): n
************* 13.5
 
Enter value to chart: 3.2
Do you wish to supply the graphing character (Y/N): y
Enter the character: $
$$$ 3.2

Enter value to chart: 16.1
Do you wish to supply the graphing character (Y/N): y
Enter the character: @
@@@@@@@@@@@@@@@@ 16.1

Enter value to chart: 0.0
Do you wish to supply the graphing character (Y/N): n
0.0 
*/