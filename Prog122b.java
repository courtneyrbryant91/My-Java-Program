/*Courtney Bryant
 * Jordan-Matthews High
 * Prog122b
 * Created: Sept 27, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program displays a chart containing the wages per hour for someone making $4 an hr.
 * Difficulities: I did not notice that the program assignment was supposed to skip from 13 and go to 29.  I had originally coded mine to stop at 13 and then start again at 14 and go to 40.
 * What I learned: I learned how to use two loops in one program.
 */

import java.util.*;
import java.io.*;
public class Prog122b
{
    public static void main(String[] args)
    {
        int number = 1;
        final int rate = 4;
        System.out.println("Hours\tPay");
        do {
            System.out.println(number +"\t"+ (number*rate));
            number +=1;
        } while (number < 14);
        System.out.println("\n....More Answers here\n");
        number += 15;
        do {
            System.out.println(number +"\t"+ (number*rate));
            number+=1;
        } while (number < 41);
    }
   
    /*Output:
Hours	Pay
1	4
2	8
3	12
4	16
5	20
6	24
7	28
8	32
9	36
10	40
11	44
12	48
13	52

....More Answers here

29	116
30	120
31	124
32	128
33	132
34	136
35	140
36	144
37	148
38	152
39	156
40	160
     */
    //NOTE: Spacing is correct in output.
}
