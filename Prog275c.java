/* Courtney Bryant
 * Jordan-Matthews High
 * Prog275c
 * Created: January 31, 2009
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: Write a program that will find all 3-digit numbers (in which there are no repeating digits) that when the sum of the digits is squared and divided into the number there is no remainder.
 * Difficulties: I had a little trouble remembering how to use mod division to determine the value of a digit in a number.  I used google to help me solve this problem
 * What I learned: I learned how to use multiple methods (kinda like nested loops) to solve one problem.  One method was based on the output from the other method.  This is why they were "nested."
 */
public class Prog275c
{
    public static void main(String[] args)
    {
        System.out.println("All 3 digit numbers with no repeating digits, when the sum of the digits\nis squared and divided into the number there is no remainder.\n");
        int totalCount=1;
        for (int i = 101; i<1000; i++)
        {
            String num = ""+i;
            if (num.charAt(2)==num.charAt(1))
            {
            }
            else if (num.charAt(0)==num.charAt(1))
            {
            }
            else
            {
                if (factor(numSum(num),num)==true)//if num % total of digits^2 == 0 is true then print num 
                {
                    System.out.println(totalCount+".)  "+num);
                    totalCount++;
                }
                else
                {
                }
            }
        }
    }
    /* Determines each digit and adds them up.  
     * Pre: Three digit numbers without repeating digits
     * Post: Returns sum of all three digits of the number
     */
    public static int numSum(String originalNum)
    {
        int num = Integer.parseInt(originalNum);//converts from string to int
        int onesDigit = num%10;
        int tensDigit = ((num%100)-onesDigit)/10;
        int hundDigit = (num-((tensDigit*10)+onesDigit))/100;
        int total = onesDigit+tensDigit+hundDigit;
        return total;
    }
    /* Determines if the total (of the digits of the number) squared equals the original number
     * Pre: The numSum method sends the sum of the three digits of a non-repeating digit number to this method.
     * Post: Returns true if total^2 equals the original number.  Returns false if total^2 does not equal the original number.
     */ 
    public static boolean factor(int total, String originalNum)
    {
        int squared = total*total;
        int num = Integer.parseInt(originalNum);//converts from string to int
        if (num%squared==0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
/*OUTPUT:
All 3 digit numbers with no repeating digits, when the sum of the digits
is squared and divided into the number there is no remainder.

1.)  162
2.)  243
3.)  324
4.)  392
5.)  405
6.)  512
7.)  605
8.)  648
9.)  810
10.)  972

 */