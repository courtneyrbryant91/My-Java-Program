/*Courtney Bryant
 * Jordan-Matthews High
 * Prog 72a
 * Compiler/Platform: Java 1.6, Windows XP
 * Created: Sept 20, 2008
 * Description: This program allows the user to enter a credit card number. It then adds up all four numbers and divides it by 26.  The program then takes the remainder and determines which ASCII character corresponds with that number.
 * Difficulties: I had a difficult time trying to get the program to display a letter value for the ASCII value.  To solve this, I had to add 65 to the number that my program calculated (because the alphabet starts at 65 on the table).
 * What I learned: I learned how to use the ASCII table and make my program display an ASCII character from a number.
 */

import java.util.*;
import java.io.*;
public class Prog72a
{
    public static void main(String[] args)
    {
        System.out.print("Enter the credit card number (XX XX XX XX): ");
        Scanner cardNumber = new Scanner(System.in);
        int firstNum = cardNumber.nextInt();
        int secondNum = cardNumber.nextInt();
        int thirdNum = cardNumber.nextInt();
        int fourthNum = cardNumber.nextInt();
        int finalInteger = (firstNum+secondNum+thirdNum+fourthNum)%26;
        char asciiNum = (char)(finalInteger+65);
        System.out.println("The correct number code is: " + firstNum + " " + secondNum + " " + thirdNum + " " + fourthNum + " " + asciiNum);
 
        /*Output:
         * Enter the credit card number (XX XX XX XX): 26 54 74 56
         * The correct number code is: 26 54 74 56 C
         */
    }
}