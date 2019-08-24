/*Courtney Bryant
 * Jordan-Matthews High
 * Prog213d-iv
 * Created: November 23, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program displays the grade for a student who is learning how to type.  The inital characters, minutes, and errors are entered by the user.  The characters are divided by 5 to make a word (errors are multiplied by 5 to make the whole word wrong) errors are subtracted from total words and the typer is given a grade based on a formula.
 * Difficulties: I did not have any difficulties with this program
 * What I learned: I did not learn anything new.
 */
import java.io.*;
import java.util.*;
public class Prog213div
{
    public static void main(String[] args)
    {
        System.out.println("Typing Speed Calculator");
        System.out.print("Enter the number of characters: ");
        Scanner keyboard = new Scanner(System.in);
        int characters = keyboard.nextInt();
        System.out.print("Enter the number of minutes: ");
        Scanner keyboard1 = new Scanner(System.in);
        int minutes = keyboard1.nextInt();
        System.out.print("Enter the number of errors: ");
        Scanner keyboard2 = new Scanner(System.in);
        int errors = keyboard2.nextInt();
        
        double words = characters/5;
        double total = words/minutes;
        errors = errors*5;
        int finalAns = (int)(total - errors);
        System.out.println("Net words per minute: "+ finalAns);
        if (finalAns < 21)
            System.out.println("Grade: F\tYou're capable of better, concentrate!");
        else if (finalAns >= 21 && finalAns <24)
            System.out.println("Grade: D\tKeep your eyes on the copy and practice!");
        else if (finalAns >=24 && finalAns <27)
            System.out.println("Grade: C\tKeep practicing to improve!");
        else if (finalAns >=27 && finalAns < 30)
            System.out.println("Grade: B\tNot Bad, You're almost at the top!");
        else if (finalAns >=30)
            System.out.println("Grade: A\tGreat Job!");
        
    }
    /*Output:
Typing Speed Calculator
Enter the number of characters: 150
Enter the number of minutes: 1
Enter the number of errors: 0
Net words per minute: 30
Grade: A	Great Job!
     */
}