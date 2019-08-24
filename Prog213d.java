/*Courtney Bryant
 * Jordan-Matthews High
 * Prog213d
 * Created: November 7, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter a number of cricket chirps.  It then converts it to fahrenheit by adding 40 and dividing by 4.  The program then outputs the fahrenheit and celsius value of the number of cricket chirps along with a saying to match it...(Dead Cricket, Whew, Bur-rrr, etc.)
 * Difficulties: I did not have any difficulties with this program
 * What I learned: I learned how to use if and else if to output different lines in the condition statements. I also learned how to convert from fahrenheit to celsius.
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class Prog213d
{
    public static void main(String[] args)
    {
        DecimalFormat onedigit = new DecimalFormat("0.0");
        System.out.print("Enter Cricket Chirps/Min: ");
        Scanner keyboard = new Scanner(System.in);
        double fahrenheit = (keyboard.nextInt()+40)/4.0; //transforms from number of cricket chirps to fahrenheit
        System.out.println("Fahrenheit = "+onedigit.format(fahrenheit));
        double celsius = ((fahrenheit-32)*5.0)/9.0; // calculates celsius from fahrenheit
        System.out.println("Centigrade = "+onedigit.format(celsius));
        if (fahrenheit < 45)
            System.out.println("Condition = Bur-rrr");
        else if (fahrenheit >=45 && fahrenheit <=64)
            System.out.println("Condition = Take a Jacket");
        else if (fahrenheit >=65 && fahrenheit <=80)
            System.out.println("Condition = Ah-hhh");
        else if (fahrenheit >=81 && fahrenheit <=108)
            System.out.println("Condition = Whew");
        else if (fahrenheit >= 109)
            System.out.println("Condition = Dead Cricket");
    }
    /*Output:
Enter Cricket Chirps/Min: 20
Fahrenheit = 15.0
Centigrade = -9.4
Condition = Bur-rrr

Enter Cricket Chirps/Min: 180
Fahrenheit = 55.0
Centigrade = 12.8
Condition = Take a Jacket

Enter Cricket Chirps/Min: 480
Fahrenheit = 130.0
Centigrade = 54.4
Condition = Dead Cricket
     */
}