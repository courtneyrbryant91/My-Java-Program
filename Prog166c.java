/*Courtney Bryant
 * Jordan-Matthews High
 * Prog166c
 * Created: October 11, 2008
 * Description: This program uses loops to display a pyramid of *'s.
 * Difficulties: I had a hard time getting the correct number of rows of *'s. To fix this, I noticed that I had to add "num<=6" to the while loop.
 * What I learned: I learned how to use nested loops to set a certain number of tabs and stars on each line.
 */

public class Prog166c
{
    public static void main(String[] args)
    {
        int tab=6;
        int num = 1;
        int starNum=11;
        while (num<=6)
        {
        for (int i=tab; i>0;i--)
        {
            System.out.print(" ");
        }
        for (int n=starNum; n<=11;n++)
      {System.out.print("*");
        }
        System.out.println("");
    starNum-=2;
      tab--;
      num++;
    }
    }
    /*Output:
      *
     ***
    *****
   *******
  *********
 ***********
     */
    }
