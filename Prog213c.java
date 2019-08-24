/*Courtney Bryant
 * Prog213c
 * Jordan-Matthews High
 * Created: November 8, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter a student number along with the number of credits that person has.  It then outputs what grade level he/she is in.  It then prompts the user and asks him/her if he/she wants to run the program again.
 * Difficulties: I did not have any difficulties with this program
 * What I learned: I learned how to use the switch statement to loop a program based on the user's input.
 */
import java.io.*;
import java.util.*;
public class Prog213c
{
    public static void main(String[] args)
    {
        int run =1;
        while (run ==1)
        {
            System.out.print("Enter student number: ");
            Scanner keyboard = new Scanner(System.in);
            int studentNum = keyboard.nextInt();
            System.out.print("Enter credits: ");
            Scanner keyboard2 = new Scanner(System.in);
            double credits = keyboard.nextDouble();
            
            if (credits <30)
                System.out.println("Grade level = 1");
            else if (credits >=30 && credits < 70)
                System.out.println("Grade level = 2");
            else if (credits >=70 && credits < 90)
                System.out.println("Grade level = 3");
            else if (credits >=90)
                System.out.println("Grade level = 4");
      
            System.out.print("Do again (y/n): ");
            Scanner keyboard3 = new Scanner(System.in);
            char progRun = keyboard3.next().charAt(0);
            switch (progRun)
            {
                case 'y':
                case 'Y':
                    run = 1;
                    System.out.println();
                    break;
                case 'n':
                case 'N':
                    run = 0;
                    break;
             }
         }
      
    /*Output:
Enter student number: 2352
Enter credits: 30.0
Grade level = 2
Do again (y/n): y

Enter student number: 3639
Enter credits: 29.9
Grade level = 1
Do again (y/n): y

Enter student number: 4007
Enter credits: 70
Grade level = 3
Do again (y/n): y

Enter student number: 4915
Enter credits: 103.7
Grade level = 4
Do again (y/n): n
     */
  }
}