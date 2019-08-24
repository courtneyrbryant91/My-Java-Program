/*Courtney Bryant
 * Jordan-Matthews High
 * Prog152a
 * Created: Sept 27, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program adds up all multiples of three from 3 to 9669 and displays the sum.
 * Difficulties: I did not have any difficulties with this program. I found it pretty easy.
 * What I learned: I learned how to use a counter and a variable to both add three to the number each time and add that number to the sum variable.
 */
public class Prog152a
{
    public static void main(String[] args)
    {
        int sum = 0;
        int x = 0;
        do {
            x+=3;
            sum+=x;
        }while (x < 9669);
        System.out.println("The sum of the multiples of 3, from 3 to 9669 is: "+sum);
    }
    /*Output:
     * The sum of the multiples of 3, from 3 to 9669 is: 15586428
     */
}
