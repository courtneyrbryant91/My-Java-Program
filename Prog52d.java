/*Courtney Bryant
 *Jordan-Matthews High
 *Prog52d (Batting Average)
 *Created: Sept 13, 2008
 *Description: This program allows the user to enter a person's number of times at bat, number of hits, and number of walks in order to calculate that person's batting average.
 *Difficulties: I had problems figuring out how to calculate batting average.  I read the directions but I did not quite understand them.
 *What I learned: I learned how to calculate batting averages..lol.  I also learned how to get input from three separate lines of text and use them in my program.
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class Prog52d
{
    public static void main(String[] args)
    {
        System.out.print("Enter Number of Times at bat: ");
        Scanner bat = new Scanner(System.in);
        double timesBat = (double)(bat.nextInt());
        System.out.print("Enter Number of Hits: ");
        Scanner hit = new Scanner(System.in);
        double hits = (double)(hit.nextInt());
        System.out.print("Enter Number of Walks: ");
        Scanner walk = new Scanner(System.in);
        double walks =(double)(walk.nextInt());
        DecimalFormat threedigits = new DecimalFormat("0.000");
        double battingAverage = (double)(hits/(timesBat-walks));
        System.out.println("The batting average for this person is: " + threedigits.format(battingAverage));
    }
}
/*Output:
 * Enter Number of Times at bat: 25
Enter Number of Hits: 18
Enter Number of Walks: 3
The batting average for this person is: 0.818
 */