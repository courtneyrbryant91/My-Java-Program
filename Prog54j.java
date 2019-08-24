/*Courtney Bryant
 *Jordan-Matthews High
 *Prog54j
 *Compiler/Platform: Java 1.6 / Windows XP
 *Created: Sept 14, 2008
 *Description: This program calculates the circimference of two spheres (one with a diameter 30 ft greater than the other) and then calculates how long it will take a car to travel around each one of these spheres if they are both travelling 70 mph.  It then calculates how many seconds (after the first car) it will take for the 2nd car to cross the finish line (make one lap).
 *Difficulties: I had a problem figuring out the correct formula to calculate the right answer.  After racking my brain for a few hours, I finally figured it out (I think).
 *What I learned: I learned how to calculate the diameter of two circles and subtract to find the extra distance a car may be travelling.  I also learned how to convert miles per hour into miles per second.
 */
import java.text.*;
public class Prog54j
{
    public static void main(String[] args)
    {
        double car1 =8000; 
        final double pie = 3.14159;
        car1 = pie*car1; //find circumference
        double car2 = car1 + .0056818182; //add extra 15 ft for one side and 15 ft for other side and convert it to miles
        car2 = pie*car2;
        double rate = (70);
        double difference = car2 - car1; // calculates distance car2 has to make up
        DecimalFormat twodigits = new DecimalFormat("0.00");
        System.out.println("The Blue Car will cross the finish line "+ (twodigits.format((difference/rate)*.0002777777)) + " seconds after the red car.");
    // .000277777 convertes mph to miles per second (conversion rate from google calculator) to return value in seconds.
    }
}
/*Output:
 * The Blue Car will cross the finish line 0.21 seconds after the red car.
 */