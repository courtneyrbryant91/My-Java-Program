/*Courtney Bryant
 * Jordan-Matthews High
 * Prog213e
 * Created: November 23, 2008
 * Description: This Program reads a file and tells how many people are within a certain age group.
 * Difficulties: I had a little trouble getting the percent to work out correctly.  To fix this, I made my variables double.
 * What I learned: I learned how to read a file and use if then statements to categorize information.
 */
import java.util.*;
import java.io.*;
import java.text.*;
public class Prog213e
{
    public static void main(String[] args)
    {
       DecimalFormat twodigits = new DecimalFormat("0.00");
       Scanner inFile = null;
       try
       {
           inFile = new Scanner(new File("prog213e.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found!");
            System.exit(0);
        }
        double age1 = 0.0;
        int age2 = 0;
        int age3 = 0;
        int age4 = 0;
        int age5 = 0;
        int run = inFile.nextInt();
        for (int times = 1; times <=run;times++)
        {
            int age = inFile.nextInt();
            if (age <20)
                age1++;
            else if (age >=20 && age <40)
                age2++;
            else if (age >= 40 && age <60)
                age3++;
            else if (age >=60 && age <=79)
                age4++;
            else if (age > 79)
                age5++;    
        }
        System.out.println("Langner Family\nAge Group\tDistribution\tPercentage");
        System.out.println("  <20\t\t"+(int)(age1)+"\t\t"+twodigits.format((age1/(age1+age2+age3+age4+age5))*100.0));
        System.out.println("20-39\t\t"+age2+"\t\t"+twodigits.format((age2/(age1+age2+age3+age4+age5))*100.0));
        System.out.println("40-59\t\t"+age3+"\t\t"+twodigits.format((age3/(age1+age2+age3+age4+age5))*100.0));
        System.out.println("60-79\t\t"+age4+"\t\t"+twodigits.format((age4/(age1+age2+age3+age4+age5))*100.0));
        System.out.println("  >79\t\t"+age5+"\t\t"+twodigits.format((age5/(age1+age2+age3+age4+age5))*100.0));
    }
}
/*Output:
Langner Family
Age Group	Distribution	Percentage
  <20		3		17.65
20-39		4		23.53
40-59		5		29.41
60-79		3		17.65
  >79		2		11.76
  
NOTE: Format is correct in output
 */