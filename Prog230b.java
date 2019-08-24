/*Courtney Bryant
 * Jordan-Matthews High
 * Prog230b
 * Created: November 1, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program uses numbers from 1-25 to calculate the value if the even numbers are divided by 2, and the odd numbers are multiplied by 3 and added to 1.  The program continues under these conditions until each line equals 1.
 * Difficulties: I had trouble figuring out which loop controlled which line or function.  To solve this, I used comments.
 * What I learned: I learned how to use nested if then statments and loops to control output under certain conditions.
 */
public class Prog230b
{
    public static void main(String[] args)
    {
        for (int num = 1; num <=25; num++)
        {
            if (num==1)//if num from 1-25 is 1
            {
                System.out.print(num+": ");
                int num1 = num+7;
                while (num1>1) //calculates values for each line until the num = 1
                {
                if ((num1%2)==0)
                    {
                        num1 = (num1/2);
                        System.out.print("  "+num1);
                    }
                    else
                    {
                        num1 = (num1*3)+1;
                        System.out.print("  "+num1);
                    }  
                }
            }
            else if ((num%2)==0)//if num from 1-25 is even
            {
                System.out.print(num+": ");
                int num2 = num;
                while (num2 >1)//calculates values for each line until the num = 1
                {
                   if ((num2%2)==0)
                    {
                        num2 = (num2/2);
                        System.out.print("  "+num2);
                    }
                    else
                    {
                        num2 = (num2*3)+1;
                        System.out.print("  "+num2);
                    }    
                }
            }
            else //if num from 1-25 is odd
            {
                System.out.print(num+": ");
                int oddNum = num;
                while (oddNum>1)//calculates the value of each line until the num = 1
                {
                     if ((oddNum%2)==0)
                    {
                        oddNum = (oddNum/2);
                        System.out.print("  "+oddNum);
                    }
                    else
                    {
                        oddNum = (oddNum*3)+1;
                        System.out.print("  "+oddNum);
                    }    
                }
            }
       System.out.println();
      }
    }
    /*Output:
1:   4  2  1
2:   1
3:   10  5  16  8  4  2  1
4:   2  1
5:   16  8  4  2  1
6:   3  10  5  16  8  4  2  1
7:   22  11  34  17  52  26  13  40  20  10  5  16  8  4  2  1
8:   4  2  1
9:   28  14  7  22  11  34  17  52  26  13  40  20  10  5  16  8  4  2  1
10:   5  16  8  4  2  1
11:   34  17  52  26  13  40  20  10  5  16  8  4  2  1
12:   6  3  10  5  16  8  4  2  1
13:   40  20  10  5  16  8  4  2  1
14:   7  22  11  34  17  52  26  13  40  20  10  5  16  8  4  2  1
15:   46  23  70  35  106  53  160  80  40  20  10  5  16  8  4  2  1
16:   8  4  2  1
17:   52  26  13  40  20  10  5  16  8  4  2  1
18:   9  28  14  7  22  11  34  17  52  26  13  40  20  10  5  16  8  4  2  1
19:   58  29  88  44  22  11  34  17  52  26  13  40  20  10  5  16  8  4  2  1
20:   10  5  16  8  4  2  1
21:   64  32  16  8  4  2  1
22:   11  34  17  52  26  13  40  20  10  5  16  8  4  2  1
23:   70  35  106  53  160  80  40  20  10  5  16  8  4  2  1
24:   12  6  3  10  5  16  8  4  2  1
25:   76  38  19  58  29  88  44  22  11  34  17  52  26  13  40  20  10  5  16  8  4  2  1
     */
}
