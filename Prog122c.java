/*Courtney Bryant
 * Jordan-Matthews High
 * Prog122c
 * Created: Sept 27, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program displays a number, that number plus one, the number times 2, and the square of the number in one line.  On the next line, one is added to that number and the same information is displayed.
 * Difficulties:  I did not have any difficulties with this program.
 * What I learned: I learned how to use a variable (x) to modify a program to display the numbers that I wanted.
 */

public class Prog122c
{
    public static void main(String[] args)
    {
        int x = 1;
        do {
            System.out.println((x*2) +"\t"+(x*2+1) +"\t"+(x*4)+"\t"+((x*2)*(x*2))+"\n");
            x+=1;
        } while (x<6);
        
        /*Output:
2	3	4	4

4	5	8	16

6	7	12	36

8	9	16	64

10	11	20	100
         */
    }
}