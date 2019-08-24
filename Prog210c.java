/*Courtney Bryant
 * Jordan-Matthews High
 * Prog210c
 * Created: November 1, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program generates a random number and then prompts the user to guess the random number.  It then gives the user clues (higher or lower) until he/she guesses the correct number.
 * Difficulties: I had a difficult time figuring out how to get the program to loop continuously until the correct answer is reached.  To fix this, I used a do loop along with outputted information before the loop (this gives a value to the variable guess before the loop is executed).
 * What I learned: I learned how to generate a random number between two numbers.  I also learned that the symbol != means not equal to.
 */
import java.util.*;
import java.io.*;
public class Prog210c
{
    public static void main(String[] args)
    {
        System.out.println("I am thinking of a number between 1 and 100");
        Random generator = new Random();
        int num = generator.nextInt(100)+1;
        System.out.print("What do you think it is? ");
        Scanner keyboard = new Scanner(System.in);
        int guess = keyboard.nextInt();
        int tries = 1;
        do
        {
            if (guess < num)
            {
                System.out.println("Higher--Try Again");
            }
            else if (guess > num)
            {
                System.out.println("Lower--Try Again");
            }
            System.out.print("What do you think it is? ");
            Scanner keyboard2 = new Scanner(System.in);
            guess = keyboard2.nextInt();
            tries++;
        } while (guess != num);
        System.out.println("You got it right in "+tries+" guesses.");
    }
    /*Output:
I am thinking of a number between 1 and 100
What do you think it is? 50
Higher--Try Again
What do you think it is? 80
Higher--Try Again
What do you think it is? 84
Higher--Try Again
What do you think it is? 90
Lower--Try Again
What do you think it is? 86
Higher--Try Again
What do you think it is? 88
You got it right in 6 guesses.


I am thinking of a number between 1 and 100
What do you think it is? 90
Lower--Try Again
What do you think it is? 80
Lower--Try Again
What do you think it is? 60
Lower--Try Again
What do you think it is? 30
Lower--Try Again
What do you think it is? 10
Lower--Try Again
What do you think it is? 1
Higher--Try Again
What do you think it is? 3
Higher--Try Again
What do you think it is? 4
Higher--Try Again
What do you think it is? 6
Lower--Try Again
What do you think it is? 5
You got it right in 10 guesses.
     */
}