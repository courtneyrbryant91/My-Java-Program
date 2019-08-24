/*Courtney Bryant
 * Jordan-Matthews High
 * Created: October 24, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program displays the number of times three dice can be rolled (each goes from 1-6) and the sum add up to 9 or 10.
 * Difficulties: I had a difficult time figuring out how/what to do to get the program to display the correct answer.
 * What I learned: I learned how to use both nested loops and if statements to solve a problem.
 */
public class Prog209b
{
    public static void main(String[] args)
    {   int num1=1;
        int num2=1;
        int num3=1;
        int sum=0;
        int numNine=0;
        int numTen=0;
        
        for (num1=1; num1<=6; num1++)
        {
            for (num2=1; num2<=6; num2++)
            {
                for (num3=1; num3<=6; num3++)
                {
                    sum=num1+num2+num3;
         
                    if (sum==9)
                        {
                        numNine++;
                        }
                    else if (sum==10)
                        {
                        numTen++;
                        }
                  }
             }
         }
        System.out.println("There are "+numNine+" possible ways to get nine.");
        System.out.println("\nThere are "+numTen+" possible ways to get ten.");
        /*Output:
There are 25 possible ways to get nine.

There are 27 possible ways to get ten.
         */
    }
}
