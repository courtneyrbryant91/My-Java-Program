/*Courtney Bryant
 * Jordan-Matthews High
 * Prog212a
 * Created: November 1, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter the speed of a passenger train and then it calculates at what time the passenger train passes a freight train that is traveling 40mph and has an 80 mile head start.
 * Difficulties: I had a hard time getting the times to work out correctly. To solve this, I incremented the variables by 40 and "speed" instead of doing 40*hours or speed*hours.  Then I made hours = 11 because that is the time that the second train leaves.
 * What I learned: I learned how to increment two variables while testing to see if they are equal to or greater than one another.
 */
import java.io.*;
import java.util.*;
public class Prog212a
{
    public static void main(String[] args)
    {
        System.out.print("Enter the speed of the passenger train: ");
        Scanner keyboard = new Scanner(System.in);
        int speed = keyboard.nextInt();
        int hours = 11;//time train2 leaves
        int train1 = 80;//accounts for the head start
        int train2 = 0;
        while (train2<train1)
        {
            train1 +=40;
            train2 +=speed;
            hours++;
        }
        if ((hours)>12)
        {
            hours = (hours-12);//keeps the program from outputting 13 o'clock or 15 o'clock...
        }
        if (train2!=train1)
        {
               if ((train2-speed) < (train1-40))//calculates for between hour passings.
               {
                   System.out.println("The passenger train passed the freight train between "+(hours-1)+" and "+(hours)+" o'clock.");
                   System.out.println("The freight train was traveling 40 mph.");
                   System.out.println("The passenger train was traveling "+speed+" mph.");
                }
         }
        else //calculates for on the hour passings.
        {
             System.out.println("The passenger train passed the freight train at "+(hours)+" o'clock");
             System.out.println("The freight train was traveling 40 mph.");
             System.out.println("The passenger train was traveling "+speed+" mph.");
        }
    
    }
    /*Output:
Enter the speed of the passenger train: 75
The passenger train passed the freight train between 1 and 2 o'clock.
The freight train was traveling 40 mph.
The passenger train was traveling 75 mph.

Enter the speed of the passenger train: 80
The passenger train passed the freight train at 1 o'clock
The freight train was traveling 40 mph.
The passenger train was traveling 80 mph.
     */
}