/*Courtney Bryant
 * Jordan-Matthews High
 * Prog166d
 * Created: October 11, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program displays the wages for 3,4,5 and 6 employees who make $4 an hr (for 10,20,30, and 40 hrs).
 * Difficulties: I had a problem getting the nested loop to increment by 10.  To solve this, I used n+=10.
 * What I learned: I learned how to use a nested loop to make a program a lot simpler and shorter.
 */

public class Prog166d
{
    public static void main(String[] args)
    {
        for (int i = 3; i <7; i++)
        {
            System.out.println("Wages for "+i+" employees\n");
                for (int n = 10; n <50 ; n+=10)
            {  
             System.out.println("For "+n+"hours worked, the wages are "+(n*4*i)+" dollars.");
            }
            System.out.println("\n");
        }
    }
    /*Output:
Wages for 3 employees

For 10hours worked, the wages are 120 dollars.
For 20hours worked, the wages are 240 dollars.
For 30hours worked, the wages are 360 dollars.
For 40hours worked, the wages are 480 dollars.


Wages for 4 employees

For 10hours worked, the wages are 160 dollars.
For 20hours worked, the wages are 320 dollars.
For 30hours worked, the wages are 480 dollars.
For 40hours worked, the wages are 640 dollars.


Wages for 5 employees

For 10hours worked, the wages are 200 dollars.
For 20hours worked, the wages are 400 dollars.
For 30hours worked, the wages are 600 dollars.
For 40hours worked, the wages are 800 dollars.


Wages for 6 employees

For 10hours worked, the wages are 240 dollars.
For 20hours worked, the wages are 480 dollars.
For 30hours worked, the wages are 720 dollars.
For 40hours worked, the wages are 960 dollars.
     */
}
