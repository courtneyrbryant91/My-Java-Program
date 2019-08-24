/*Courtney Bryant
 * Jordan-Matthews High
 * Prog155t
 * Created: October 7, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program imports grades from a text file.  It loops to add them together and find the sum and average (program exits when grade entered = 0)
 * Difficulties: I had a difficult time with this program.  I did not (and kinda still dont) understand the code/method to import information from a file.  To solve my problem, I tried using the book and asking my classmates.  In the end, I asked Mr. L and he helped me fix my program.
 * What I learned: I learned that the file entered must be a text file.  I also learned that if it is an integer value in the text file, the variable in the program must be set to the integer data type.
 */

import java.io.*;
import java.util.*;

public class Prog155t
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(new FileReader("grades1.txt"));
//receives information from file
double totalNum = 0;
double sum = 0;
int num = keyboard.nextInt();
while (num>0){
            totalNum+=1;
            sum += num;
            System.out.println(num);
            num=keyboard.nextInt();
            }


System.out.println("The sum of the numbers = " + sum);
System.out.println("The number of scores = "+totalNum);
System.out.println("The average of the numbers = " +(double)(sum/totalNum));


keyboard.close();

}
}
/*Output:
3
8
1
13
18
15
7
17
1
14
The sum of the numbers = 97.0
The number of scores = 10.0
The average of the numbers = 9.7

 */