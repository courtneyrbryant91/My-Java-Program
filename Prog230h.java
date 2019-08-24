/*Courtney Bryant
 * Jordan-Matthews High
 * Prog230h
 * Compiler/Platform: Java 1.6, Windows XP
 * Created: October 26, 2008
 * Description: This program displays the lowest number that is divided by 2, 3, 4, 5, 6, and 7 and has the remainders 1, 2, 3, 4, 5, and 0 respectively.
 * Difficulties: I did not have any difficulties with this program
 * What I learned: I learned how to use nested if then loops to calcualte a number and display it.
 */

public class Prog230h
{
    public static void main(String[] args)
    {
        for (int x=1; x<150;x++)
        {
            if (x%7==0)
            {
                if (x%6==5)
                {
                    if (x%5==4)
                    {
                        if (x%4==3)
                        {
                            if(x%3==2)
                            {
                                if (x%2==1)
                                {
                                    System.out.println("The basket contains "+x+" eggs");
                                }
                            }
                        }
                    }
                }
            }
        }
        /*Output:
         * The basket contains 119 eggs
         */
    }
}