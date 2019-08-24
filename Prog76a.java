/*Courtney Bryant
 * Jordan-Matthews High
 * Prog76a
 * Created: Sept 21, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter a number (1-9). It then multiplies the number by 9 and then by 12345679 to get the original number repeated.  The number is then multiplied by 1000.
 * Difficulties: I had a problem getting the *1000 to come out correctly (I kept getting a negative and not sure why). To solve this, I just added "000" to the end of the number.
 * What I learned: I learned how to do a new number trick and display multiplication using java.
 */
import java.util.*;
import java.io.*;
public class Prog76a
{
    public static void main(String[] args)
    {
        Scanner numEntered = new Scanner(System.in);
        System.out.print("Enter a number you dislike: ");
        int badNum = numEntered.nextInt();
        final int multiNum = 12345679;
        System.out.println("\t\t\t"+ badNum + "\n\t\t\tX 9");
        System.out.println("\t         _________________\n\t\t\t" + (badNum*9));
        System.out.println("\t\t\tX 12345679\n\t\t   ________________");
        System.out.println("Suprise\t\t\t" + ((badNum*9)*multiNum));
        System.out.println("\t\t\tX 1000\n\t\t   _________________");
        System.out.println("\"No Surprise\"?\t      " + (((badNum*9)*multiNum))+ "000");
        
        /*Output:
         * Enter a number you dislike: 6
         *                            6
         *                            X 9
         *                     `_________________
         *                            54
         *                            X 12345679
         *                       ________________
         *          Suprise			666666666
         *                          X 1000
         *                      _________________
         *   "No Surprise"?	      666666666000
         */
    }
}