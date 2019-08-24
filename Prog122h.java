/*Courtney Bryant
 *Jordan-Matthews High
 *Prog122h
 *Created: Sept 27, 2008
 *Compiler/Platform: Java 1.6, Windows XP
 *Description: This program displays all numbers from 1 to 20, along with their square, square root, cube, and 4th root.
 *Difficulties: I had a difficult time figuring out how to do the 4th root of a number. To solve this, I used google to search how to do the 4th root in Java code.  I found out you have to raise it to the 1/4 power.
 *What I learned: I learned how to find the 4th root in Java programming.  I also learned that the Math.pow statement returns values in double data type.
 */

import java.text.*;
public class Prog122h
{
    public static void main(String[] args)
    {
        int number = 1;
        DecimalFormat fourdigits = new DecimalFormat("0.0000");
        System.out.println("Number\tSquare\tSquare Root\tCube\t4th Root");
        do {
            System.out.println(number + "\t" + number*number +"\t"+ fourdigits.format(Math.sqrt(number)) +"\t\t"+ (number*number*number) +"\t"+ fourdigits.format(Math.pow(number, (1.0/4.0))));
            number +=1;
        } while (number < 21);
    }
    /*Output:
Number	Square	Square Root	Cube	4th Root
1	1	1.0000		1	1.0000
2	4	1.4142		8	1.1892
3	9	1.7321		27	1.3161
4	16	2.0000		64	1.4142
5	25	2.2361		125	1.4953
6	36	2.4495		216	1.5651
7	49	2.6458		343	1.6266
8	64	2.8284		512	1.6818
9	81	3.0000		729	1.7321
10	100	3.1623		1000	1.7783
11	121	3.3166		1331	1.8212
12	144	3.4641		1728	1.8612
13	169	3.6056		2197	1.8988
14	196	3.7417		2744	1.9343
15	225	3.8730		3375	1.9680
16	256	4.0000		4096	2.0000
17	289	4.1231		4913	2.0305
18	324	4.2426		5832	2.0598
19	361	4.3589		6859	2.0878
20	400	4.4721		8000	2.1147

     */
    
    //NOTE: numbers align correctly in output
}
