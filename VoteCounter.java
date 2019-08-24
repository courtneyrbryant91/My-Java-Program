/* Courtney Bryant
 * Prog52h (EC)
 * Jordan-Matthews High School
 * Created: Sept 6, 2008
 * Description: This program uses a mathematical formula to determine the number of votes each student received in an election.
 * Difficulties: I am having problems memorizing the "public static void main" statement and the "System.out.println" statement.
 * What I learned: I learned that including a space at the end of a set of quotes (within the quotes) will be displayed when the program is ran.
 */

public class VoteCounter
{
    public static void main (String[]args)
    {
      int numVotes = 9485;
      int maryVotes = (numVotes + 183)/4;
      int peteVotes = maryVotes - 74;
      int paulVotes = maryVotes - 23;
      int joanVotes = maryVotes - 86;
      System.out.println("Mary won the election which gives her " + maryVotes + " votes.");
      System.out.println("Pete has 74 less than Mary giving him " + peteVotes + " votes.");
      System.out.println("Paul has 23 less than Mary giving him " + paulVotes + " votes.");
      System.out.println("Joan has 86 less than Mary giving her " + joanVotes + " votes.");
      System.out.println("Total votes = \t \t \t      " + numVotes + " votes.");
    }
    /*Output:
     * Mary won the election which gives her 2417 votes.
     * Pete has 74 less than Mary giving him 2343 votes.
     * Paul has 23 less than Mary giving him 2394 votes.
     * Joan has 86 less than Mary giving her 2331 votes.
     * Total votes =        	 	 	      9485 votes.
     */
     
}