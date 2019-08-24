/*Courtney Bryant
 * Jordan-Matthews High
 * Prog162a
 * Created: October 7, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program displays the factoral (number times every number before that number) for any amount entered by the user.  The program loops until the user enters 0.
 * Difficulties: I had a problem getting the program to loop over and over. To fix this, I read the discussion board and learned how to place a break within the code.
 * What I learned: I learned how to make a program loop continously.  I also learned how to insert a break into my program.
 */


import java.io.*;
import java.util.*;
public class Prog162a
{
    public static void main(String[] args)
    {
        int loopCounter = 0;
        do{
            System.out.print("Enter a Number [zero to quit]: ");
            Scanner keyboard = new Scanner(System.in);
            int initialValue = keyboard.nextInt();
            if(initialValue==0)
            {break;}
            int factoral = 1;
            for (int value = initialValue; value > 0; value--)
                 {factoral=factoral*value;}
          System.out.println("The value of "+ initialValue+"! is "+ factoral+"\n");}
        while (loopCounter==0);
        }
        
        /*Output:
Enter a Number [zero to quit]: 6
The value of 6! is 720

Enter a Number [zero to quit]: 9
The value of 9! is 362880

Enter a Number [zero to quit]: 12
The value of 12! is 479001600

Enter a Number [zero to quit]: 14
The value of 14! is 1278945280

Enter a Number [zero to quit]: 0
         */
    }
