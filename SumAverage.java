/*Courtney Bryant
 *Prog54b (Sum & Average)
 *Created Sept 7, 2008
 *Description:  This program calculates the sum and average of four numbers declared by the variables.
 *Difficulties: I had a problem with finding the average as a decimal because I tried to use the variable "sum" (I could not use this because I had already converted it to an integer).
 *What I Learned: I learned how to compute sum and average using Java.
 */

public class SumAverage
{
    public static void main(String[]args)
    {
        double num1 = 475.0;
        double num2 = 821.0;
        double num3 = 369.0;
        double num4 = 562.0;
        int sum = (int)(num1+num2+num3+num4);
        double average =((num1+num2+num3+num4)/4);
        System.out.println("The sum of the four numbers is " + sum);
        System.out.println("The average of the four numbers is " + average);
        
        /*Output:
         * The sum of the four numbers is 2227
         * The average of the four numbers is 556.75
         */
    }
}