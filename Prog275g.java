/*Courtney Bryant
 * Jordan-Matthews High
 * Prog275g
 * Created: November 2, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program calculates any 14 coin combination that adds up to 1.05
 * Difficulties: I had a little trouble figuring out how to add up each coin to calculate the 14 coins.  To solve this, I just divided each value by its coin value and added it together (ie  50 quarters/25 = 2 coins).
 * What I learned: I did not learn anything new.  This program helped me reinforce my nested loop skills.
 */
public class Prog275g
{
    public static void main(String[] args)
    {
        int coins = 0;
        for (int quarters = 0; quarters < 350; quarters+=25)
        {
            for (int dimes = 0; dimes < 140; dimes+=10)
            {
                for (int nickles = 0; nickles < 70; nickles +=5)
                {
                    for (int pennies = 0; pennies < 14; pennies++)
                    {
                        if ((quarters+dimes+nickles+pennies)==105)
                        {
                            if (((quarters/25)+(dimes/10)+(nickles/5)+pennies)==14)
                            {
                                System.out.println((quarters/25)+" quarters "+(dimes/10)+" dimes "+(nickles/5)+" nickles "+pennies+" pennies.");
                            }
                        }
                    }
                }  
            }
        }
    }
    /*Output:
0 quarters 7 dimes 7 nickles 0 pennies.
1 quarters 3 dimes 10 nickles 0 pennies.
1 quarters 7 dimes 1 nickles 5 pennies.
2 quarters 3 dimes 4 nickles 5 pennies.

     */
}