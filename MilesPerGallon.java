/*Courtney Bryant
 *Prog54a
 *Jordan-Matthews High School
 *Created Sept 7, 2008
 *Description: This program displays the average miles per gallon (rounded to the tenths place) of various vehicles.
 *Difficulties: I had trouble getting the rounding to come out correctly because I forgot to put the ".0" after the numbers I was dividing.
 *What I learned: I learned how to round a number to the tenths place (and others if needed).  I also learned that the ".0" is an essential part when using decimal numbers.
 */


public class MilesPerGallon
{
 public static void main (String []args)
 {
     double bug = (286.0/9.0);
     double firebird = (412.0/40.0);
     double subaru = (361.0/18.0);
     double cutlass = (161.0/11.0);
     
     bug = (bug*10)+.5;
     bug=(int)(bug);
     bug=bug/10;
     firebird = (firebird*10)+.5;
     firebird = (int)(firebird);
     firebird = firebird/10;
     subaru = (subaru*10)+.5;
     subaru = (int)(subaru);
     subaru=subaru/10;
     cutlass=(cutlass*10)+.5;
     cutlass=(int)(cutlass);
     cutlass=cutlass/10;
     
     System.out.println("Kansas City Grand Prix \nMiles/Per Gallon");
     System.out.println("1970 VW Bug averaged " + bug + " mpg.");
     System.out.println("1979 Firebird averaged " + firebird +" mpg.");
     System.out.println("1980 Subaru averaged " + subaru + " mpg.");
     System.out.println("1975 Cutlass averaged " + cutlass + " mpg.");
     
     /*Output:
      * Kansas City Grand Prix 
      * Miles/Per Gallon
      * 1970 VW Bug averaged 31.8 mpg.
      * 1979 Firebird averaged 10.3 mpg.
      * 1980 Subaru averaged 20.1 mpg.
      * 1975 Cutlass averaged 14.6 mpg.
      */
    }
}