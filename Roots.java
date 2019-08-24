/*Courtney Bryant
 * Jordan-Matthews High
 * Prog58b (Roots)
 * Created: Sept 13, 2008
 * Discription:  This program allows the user to enter the A, B, and C from an equation.  It then calculates the roots of the equation by using the quadratic formula.
 * Difficulties:  I had trouble remembering the statment to get information from the user and declare it as a variable.
 * What I learned: I learned how to use the square root math class to find the square root of a number.
 */

import java.io.*;
import java.util.*;
public class Roots
{
    public static void main(String[] args)
    {
      System.out.println("Quadratic Equation Solver");
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter A, B, C [all on one line]: ");
      double A = keyboard.nextDouble();
      double B = keyboard.nextDouble();
      double C = keyboard.nextDouble();
      double root = (B*B) - (4*A*C);
      root = Math.sqrt(root);
      double answer1 = ((-B) + root)/(2*A);
      double answer2 = ((-B) - root)/(2*A);
      System.out.println("The roots are: " + answer2 + ", " + answer1);
    }
}
/*Output:
 * Quadratic Equation Solver
Enter A, B, C [all on one line]: 1 5 6
The roots are: -3.0, -2.0
 */