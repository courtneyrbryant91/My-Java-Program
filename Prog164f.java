/*Courtney Bryant
 * Jordan-Matthews High
 * Prog164f
 * Created: October 19, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program uses the Math.pow() function to display the squares of all numbers between 1 and 10.
 * Difficulties: The only problem I had was that my program displayed decimal answers (1.0, 4.0, etc). To fix this, I used DecimalFormat.
 * What I learned: I learned how to use all three types of loops to display the same information.  I also had to submit this program a second time because I did not understand the directions.  I used the mathclass when I was not supposed to.
 */



public class Prog164f
{
    public static void main(String[] args)
    {
        int num = 0;
        
        System.out.println("For Loop");
            for (int x=1; num<100;x+=2)
            {
                num=x+num;
                System.out.print((num)+" ");
                
            }
        System.out.println("\n\nWhile Loop");
        int x = 19;
            while (num>0)
            {
                System.out.print(num+ " ");
                num-=x;
                x-=2;
            }
        
        System.out.println("\n\nDo While Loop");
        x=1;
            do
            {
                num+=x;
                System.out.print(num + " ");
                x+=2;
            } while (x<=19);
    }
    
    /*Output:
For Loop
1 4 9 16 25 36 49 64 81 100 

While Loop
100 81 64 49 36 25 16 9 4 1 

Do While Loop
1 4 9 16 25 36 49 64 81 100 
     */
}