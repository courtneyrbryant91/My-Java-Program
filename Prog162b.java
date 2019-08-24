/*Courtney Bryant
 * Jordan-Matthews High
 * Prog162b
 * Created: October 9, 2008
 * Compiler/Platform: Java 1.6, Windows XP
 * Description: This program displays the number of years(since 1990) that it will take for a population to double (increases at 2.9% annually).
 * Difficulties: I did not have any difficulties with this program.
 * What I learned: I learned how to update a value by using a percent.
 */

public class Prog162b
{
    public static void main(String[] args)
    {
        System.out.println("-------Growth Rate 2.9% annually-------");
        System.out.println("Year   Population (in millions");
        double initialPop = 236;
        final double rate = 1.029;
        int year = 1990;
  
        while (initialPop < 472)
        {
            year++;
            initialPop = (initialPop*rate);
            System.out.println(year+"\t\t"+(int)(initialPop));
        }
        System.out.println("\nThe population will double by the year "+ year+".");
        
        /*Output:
-------Growth Rate 2.9% annually-------
Year   Population (in millions
1991		242
1992		249
1993		257
1994		264
1995		272
1996		280
1997		288
1998		296
1999		305
2000		314
2001		323
2002		332
2003		342
2004		352
2005		362
2006		372
2007		383
2008		394
2009		406
2010		418
2011		430
2012		442
2013		455
2014		468
2015		482

The population will double by the year 2015.
         */
    }
}