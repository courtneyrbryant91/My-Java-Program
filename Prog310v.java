/* Courtney Bryant
 * Jordan-Matthews High
 * Prog310v
 * Created: January 18, 2009
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: Create an application that displays all perfect integers up to 100.  A perfect integer is a number which is equal to the 
 *      sum of all it's factors except itself.  For example 6, is a perfect number because 1 + 2 + 3 = 6.  The application should include a 
 *      boolean method isPerfect().
 * Difficulties: I did not have any difficulties with this program
 * What I Learened: I learned (through this program and research) that there are only two perfect numbers between one and one hundred.
 */
public class Prog310v
{
    public static void main(String[] args)
    {
        System.out.println("The following numbers are perfect integers (where n is equal to the sum of \nit's factors except the number itself) between 1 and 100:\n");
        for (int x =1; x<=100; x++)//for nums all the way to 100
        {
            if (isPrime(x))//if method is true then print num
            {
                System.out.println(x);
            }
            else
            {
            }
        }
    }
    public static boolean isPrime(int num)
    {
        int total = 0;
        for (int y = 1; y< num; y++)//sqrt is where the factors repeat
        {
            if (num%y==0 )//if y is a factor of num then add y and the factor to the total
               total+=y;
         
           
        }
        if (total==num)//if total = num then return true
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /*OUTPUT:
The following numbers are perfect integers (where n is equal to the sum of 
it's factors except the number itself) between 1 and 100:

6
28
     */
}