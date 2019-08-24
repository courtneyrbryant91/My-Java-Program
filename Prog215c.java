/*Courtney Bryant
 * Jordan-Matthews High
 * Prog215c
 * Created: October 24, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program calculates the length of the sides of a rectangle with maximum area made from 100 yards of material.
 * Difficulties:I had a hard time figuring out where the for loop should stop. To fix this, I just made it loop while it was <100 because 100 was the maximum amount of yards of material.
 * What I learned: I learned how to increment a variable to save the maximum value of the length of the sides.
 */
public class Prog215c
{
    public static void main(String[] args)
    {
        double newArea = 0;
        int length=0;
    for (int x = 0; x<=100; x++)//loops until 100 because that is the most material you have
    {
        double area = x*(100-2*x);
        if (area>newArea)
        { newArea = area;
         length = x;
        }
    }
    System.out.println("With 100 yards of fencing material:\nA rectangle "+length+" X "+ (100-2*length)+" yards produces the maximum area of " + newArea+" square yards.");
    }
    /*Output:
With 100 yards of fencing material:
A rectangle 25 X 50 yards produces the maximum area of 1250.0 square yards.
     */
}