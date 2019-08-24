/*Courtney Bryant
 * Jordan-Matthews High
 * Prog168h
 * Created: October 11, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program displays the numbers 1-23 in an X intersecting at number 12.
 * Difficulties: I had a very difficult time with this program.  It was hard to get it to format correctly.  It is still not the best X in the world, but it is as close as I could get it.
 * What I learned: I learned how to make an X using a bunch of nested loops.
 */

public class Prog168h
{
    public static void main(String[] args)
    {
        int num = 1;
        int tab = 12;
        int num2 = 13;
     
      while (num<13)
        {
            if (num==12)
            {
                System.out.print("\t   "+num+"\n");
                tab--;
                num++;
            }
                else{
                    for (int n=tab; n<12;n++)
            {
                System.out.print(" ");
            }
                    System.out.print(num);
                      for (int i=tab; i>2;i--)
                {
                    System.out.print("  ");
                }   
               System.out.print(num+"\n");
                  tab--;
                 num++;
                }    
    }    
    tab = 12;
    while (num2<24)
    {
          for (int n=tab; n>2;n--)
            {
                System.out.print(" ");
            }
                    System.out.print(num2);         
                    for (int i=tab; i<12;i++)
                {
                    System.out.print("  ");
                }   
        System.out.print(num2+"\n");          
        tab--;
        num2++;
    }   
    }
    /*Output:
1                     1
 2                   2
  3                 3
   4               4
    5             5
     6           6
      7         7
       8       8
        9     9
         10  10
          1111
	       12
          1313
         14  14
        15    15
       16      16
      17        17
     18          18
    19            19
   20              20
  21                21
 22                  22
23                    23

     */
}

        
 