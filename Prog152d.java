/*Courtney Bryant
 *Jordan-Matthews High
 *Prog152d
 *Platform/Compiler: Java 1.6, Windows XP
 *Created: October 5th, 2008
 *Description: This program allows the user to enter a starting number and an ending number.  It then displays all numbers between the starting and ending values.  It also calcualtes the sum and average of all of the numbers displayed.
 *Difficulties: I had a hard time figuring out how to use the for loop.  To fix this, I just decided to use the Do..While loop.
 *What I learned: I learned how to get two values from the user, display the numbers between the two values, and also calculate the sum and average using a loop.
 */
import java.util.*;
import java.io.*;
public class Prog152d
{
    public static void main(String []args)
    {
        System.out.print("Enter starting number ");
        Scanner keyboard1 = new Scanner(System.in);
        int startNum = keyboard1.nextInt();
        System.out.print("Enter ending value ");
        Scanner keyboard2 = new Scanner(System.in);
        int counter = startNum;
        int endNum = keyboard1.nextInt();
        int sum = 0;
        double totalNum = 0.0;
        do
        {
            sum+=counter;
            totalNum++;
            System.out.println(counter);
            counter++;
            
        } while (counter < endNum+1);
        System.out.println("Sum of the numbers "+ startNum +".."+endNum+ " is "+ sum);
        System.out.println("The average of the numbers "+ startNum+".."+endNum+" is "+ (double)(sum/totalNum));
            
    }
    /*Output:
Enter starting number 5
Enter ending value 8
5
6
7
8
Sum of the numbers 5..8 is 26
The average of the numbers 5..8 is 6.5
*/
}