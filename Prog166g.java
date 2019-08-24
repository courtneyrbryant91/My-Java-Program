/*Courtney Bryant
 * Jordan-Matthews High
 * Prog166g
 * Created: October 11, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program allows the user to enter a number between 1 and 9.  It then displays a chart of rows/columns containing multiplication numbers (multiplication table).
 * Difficulties: I had a difficult time getting the program to format correctly.  I had an extra number on the end of each row.  My mistake was that I had used System.out.print(x) for the columns..and this added the extra number.
 * What I learned: I learned how to use a nested loop to create a multiplication table.
 */

import java.io.*;
import java.util.*;
public class Prog166g
{
    public static void main(String[] args)
    {
        System.out.print("Enter # of rows ");
        Scanner keyboard = new Scanner(System.in);
        int rows = keyboard.nextInt();
        for (int i=1; i<=rows;i++)
        {
            System.out.print(i+"\t");
        }
        for (int x=1; x<=rows;x++)
        {
            System.out.println("");
            
        for (int n=1;n<=x;n++)
        {
            System.out.print((x*n)+"\t");
        }
        
    }
    /*Output:
Enter # of rows 9
1	2	3	4	5	6	7	8	9	
1	
2	4	
3	6	9	
4	8	12	16	
5	10	15	20	25	
6	12	18	24	30	36	
7	14	21	28	35	42	49	
8	16	24	32	40	48	56	64	
9	18	27	36	45	54	63	72	81
     */
    }
}