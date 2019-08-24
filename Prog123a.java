/*Courtney Bryant
 * Jordan-Matthews High
 * Prog123a
 * Created:October 9, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program formats numbers 1-25 in a chart.
 * Difficulties: I had a problem with the if..then statement.  To fix this, I placed == within the condition statement.
 * What I learned: I learned how to use the if..then statement to make a program do a certain command at a specific time.
 */
public class Prog123a
{
    public static void main(String[] args)
    {
        System.out.println("Table of numbers:");
        int counter = 1;
        while (counter <26)
        {
         if (counter==6) 
         {System.out.print("\n\n"+ counter+"\t");
            counter++;}
         else if (counter==11) {
            System.out.print("\n\n"+ counter+"\t");
        counter++;}
         else if (counter==16) {
            System.out.print("\n\n"+ counter+"\t");
        counter++;}
        else if (counter==21) {
           System.out.print("\n\n"+ counter+"\t");
        counter++;}
        else  {System.out.print(counter+"\t");
            counter++;}
          
        }
        
        /*Output:
Table of numbers:
1	2	3	4	5	

6	7	8	9	10	

11	12	13	14	15	

16	17	18	19	20	

21	22	23	24	25	
         */
    }
}