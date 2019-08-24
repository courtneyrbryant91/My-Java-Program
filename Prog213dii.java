/*Courtney Bryant
 * Jordan-Matthews High
 * Prog213d-ii
 * Created: November 14, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter a value in celsius. It then converts the value to fahrenheit and displays a sport that the person should play in that temperature.
 * Difficulties: I did not have any difficulties with this program
 * What I learned: I learned how to convert from celsius to fahrenheit.
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class Prog213dii
{
    public static void main(String[] args)
    {
        DecimalFormat onedigit = new DecimalFormat ("0.0");
        System.out.print("Enter Celsius Temperature: ");
        Scanner keyboard = new Scanner(System.in);
        int celsius = keyboard.nextInt();
        double fahrenheit = (celsius*1.8)+32;
        System.out.println("Fahrenheit Temperature = "+ onedigit.format(fahrenheit));
        if (fahrenheit<=9)
            System.out.println("Chess Today!");
        else if (fahrenheit >9 && fahrenheit <=39)
            System.out.println("Skiing Today!");
        else if (fahrenheit >39 && fahrenheit <=69)
            System.out.println("Golf Today!");
        else if (fahrenheit >69 && fahrenheit <=84)
            System.out.println("Tennis Today!");
        else if (fahrenheit >84)
            System.out.println("Swimming Today!");
    }
}
/*Output:
Enter Celsius Temperature: 32
Fahrenheit Temperature = 89.6
Swimming Today!

Enter Celsius Temperature: 0
Fahrenheit Temperature = 32.0
Skiing Today!

Enter Celsius Temperature: 20
Fahrenheit Temperature = 68.0
Golf Today!

Enter Celsius Temperature: 21
Fahrenheit Temperature = 69.8
Tennis Today!

Enter Celsius Temperature: -15
Fahrenheit Temperature = 5.0
Chess Today!
 */