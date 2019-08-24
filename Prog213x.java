/*Courtney Bryant
 * Jordan-Matthews High
 * Prog213x
 * Created: November 23, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program calculates the next license plate number in a sequence.  The sequence continues until it equals ZZZ999 and then starts over.
 * Difficulties: I kind of got confused with all the nested loops.  To fix this, I used comments so that I could better understand it.
 * What I learned:  I learned how to use .charAt() to determine the value of each number/letter in a word.
 */
import java.io.*;
import java.util.*;
public class Prog213x
{
    public static void main(String[] args)
    {
        System.out.print("LAST TAG NUMBER: ");
        Scanner keyboard = new Scanner(System.in);
        String plate = keyboard.next();
        int firstChar = plate.charAt(0);
        int secondChar = plate.charAt(1);
        int thirdChar = plate.charAt(2);
        int firstInt = plate.charAt(3);
        int secondInt = (plate.charAt(4));
        int thirdInt = (plate.charAt(5));
        
        if (thirdInt == 57)//if third number = 9
        {
            secondInt++;
            thirdInt = 48;//third num = 0
            if (secondInt ==58)//if second num = 10
            {
                firstInt++;
                secondInt = 48;//second num = 0
                if (firstInt == 58)//if first num = 10
                {
                    thirdChar++;
                    firstInt = 48;//first num = 0
                    secondInt = 48;//second num = 0
                    thirdInt = 48;//third num = 0
                    if (thirdChar == 91)//if third letter = Z
                    {
                        secondChar++;//increase second letter
                        thirdChar = 65;//third letter = A
                        if (secondChar ==91)//if second letter = Z
                        {
                            firstChar++;//increase first letter
                        }
                    }
                }
            }
        }
        else
        {
           thirdInt++;
        }
        if (firstChar ==91)
        {
           System.out.println("ALL DIGITS AND CHARACTERS HAVE BEEN USED AAA0");  
        }
        else
        {
            System.out.println("THE NEXT TAG IN THE SEQUENCE IS: "+(char)(firstChar)+""+(char)(secondChar)+""+(char)(thirdChar)+""+(char)(firstInt)+""+(char)(secondInt)+""+(char)(thirdInt));
        }
        /*Output:
LAST TAG NUMBER: ABA100
THE NEXT TAG IN THE SEQUENCE IS: ABA101

LAST TAG NUMBER: AAZ999
THE NEXT TAG IN THE SEQUENCE IS: ABA000

LAST TAG NUMBER: ZZZ999
ALL DIGITS AND CHARACTERS HAVE BEEN USED AAA0
         */
    }
}
