/*Courtney Bryant
 * Jordan-Matthews High
 * Prog215b
 * Created: October 24, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program loops a formula over and over until 60 seconds have passed.  It then displays the maximum height reached by the formula.
 * Difficulties: I did not have any difficulties with this program.
 * What I Learned: I learned how to use the if statement to display the highest number in a loop.
 */
public class Prog215b
{
    public static void main(String[] args)
    {
        double answer = 0;
        for (int sec = 0; sec<=60; sec++)
        {
            double height = (960*sec)-(16*sec*sec);
            if (height >answer)
            {answer = height;}
        }
        System.out.println("The maximum height reached by the bullet is: "+ answer+" feet.");
    }
    /*Output:
     * The maximum height reached by the bullet is: 14400.0 feet.
     */
}