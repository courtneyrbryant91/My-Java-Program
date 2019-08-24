/*Courtney Bryant
 * Jordan-Matthews High
 * Prog230a
 * Created: October 24, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program displays all numbers divisible by 3 or 7 from 0 to 100
 * Difficulties: I did not have any difficulties with this program.
 * What I learned: I did not learn anything new.
 */
public class Prog230a
{  
    public static void main(String[] args)
    {
        for (int x=1; x<=100; x++)
        {
            if ((x%3)==0)
            {
                System.out.println(x);
            }
            else if ((x%7)==0)
            {
                System.out.println(x);
            }
        }
    }
    /*Output:
3
6
7
9
12
14
15
18
21
24
27
28
30
33
35
36
39
42
45
48
49
51
54
56
57
60
63
66
69
70
72
75
77
78
81
84
87
90
91
93
96
98
99
     */
}